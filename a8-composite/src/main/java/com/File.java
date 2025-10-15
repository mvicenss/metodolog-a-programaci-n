package src.main.java.com;

public class File implements Component {
    private int size;
    protected String name;

    public File(int size, String name) {
        this.size = size;
        this.name = name;
    }


    @Override
    public void print(String indentation) { //Exclusive print method por files
        System.out.println(indentation + name + " (" + size + "bytes)");
    }

    @Override
    public int getSize(){
        return size;
    }
}
