
import java.util.*;

// Element interface
interface FileSystemElement {
    void accept(FileSystemVisitor visitor);
    String getName();
}

// Visitor interface
interface FileSystemVisitor {
    void visit(File file); //visit files
    void visit(Folder folder); //visit folders
}

// Concrete Element: File
class File implements FileSystemElement {
    private String name;
    private int size; // in KB

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getName() {
        return name;
    }
}

// Concrete Element: Folder
class Folder implements FileSystemElement {
    private String name;
    private List<FileSystemElement> children = new ArrayList<>(); //elements inside the folder

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemElement element) {
        children.add(element);
    }

    public List<FileSystemElement> getChildren() {
        return children;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getName() {
        return name;
    }
}

// Concrete Visitor 1: Calculate total size
class SizeCalculatorVisitor implements FileSystemVisitor {
    private int totalSize = 0;

    @Override
    public void visit(File file) {
        totalSize += file.getSize(); //Get size of the file
    }

    @Override
    public void visit(Folder folder) {
        for (FileSystemElement element : folder.getChildren()) { //for every file in the folder
            element.accept(this); //accept the visitor
        }
    }

    public int getTotalSize() {
        return totalSize;
    }
}

// Concrete Visitor 2: List all names
class ListNamesVisitor implements FileSystemVisitor {
    @Override
    public void visit(File file) {
        System.out.println("File: " + file.getName());
    }

    @Override
    public void visit(Folder folder) {
        System.out.println("Folder: " + folder.getName());
        for (FileSystemElement element : folder.getChildren()) {
            element.accept(this);
        }
    }
}

// Main demo
public class Main {
    public static void main(String[] args) {

        // Build structure
        Folder root = new Folder("root"); //root folder
        root.add(new File("data.txt", 120));
        root.add(new File("image.png", 300));

        Folder documents = new Folder("documents");
        documents.add(new File("resume.pdf", 80));
        documents.add(new File("notes.docx", 40));

        root.add(documents);

        // Use visitor 1: size calculator
        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        root.accept(sizeVisitor);
        System.out.println("Total size: " + sizeVisitor.getTotalSize() + " KB");

        // Use visitor 2: list names
        System.out.println("\nListing all elements:");
        ListNamesVisitor listVisitor = new ListNamesVisitor();
        root.accept(listVisitor);
    }
}

