package src.main.java.com;

import java.util.*;


/*HOW DO WE DIFERENCIATE BETWEEN FILES AND FOLDERS WHEN PRINTING?
    Folder and File classes have both their respective implementations of "print" method, since the Component class is implemented
    in both. We are currently using 2 ways to differenciate:
        1. Execution time: In "printSortedByName" and "printSortedBySize" we use the "instanceof" method when iterating through the Array of
        ALL ELEMENTS. Depending if the current element being analized is of the File type or Folder type, we
        2. Concrete API: If we call getChild, add or remove, we can be sure we are talking about a Folder.
 */

public class Main{
    static void main (String[] args){

        //1. Creating folder hierarchy
        Folder root = new Folder("Documents"); //Argument needed because of constructor of the class

        //Adding files with add method defined in Folder == Adds the files to an ArrayList
        root.add(new File(512, "cv.pdf"));
        root.add(new File(2048, "tfg.pdf"));

        Folder images = new Folder("Images"); //1st sub folder
        images.add(new File(5120, "fam.png"));//files inside
        images.add(new File(3072, "bff.png"));

        Folder music = new Folder("Music"); //2nd subfolder
        music.add(new File(8500, "song1.mp3"));
        music.add(new File(8192, "song2.mp3"));

        Folder pop = new Folder("Pop"); //2nd level subfolder of "Music"
        pop.add(new File(8192, "cpvta.mp3"));
        pop.add(new File(8192, "Otra mitad.mp3"));

        music.add(pop); //Adding subfolder to the array -- Called with music obj because its under it
        root.add(images); //Same for these two but for root dir
        root.add(music);

        Scanner sc = new Scanner(System.in);
        int option;

        do{
            System.out.println("\n--- File Explorer ---");
            System.out.println("1. Show unordered structure");
            System.out.println("2. Show structure by name");
            System.out.println("3. Show structure by size");
            System.out.println("0. Exit");
            System.out.println("Select an option: ");

            try{
                option = sc.nextInt();

                switch(option){
                    case 1:
                        System.out.println("-- Unordered file structure --");
                        root.print("");
                        System.out.println("\nTotal size = " + root.getSize() + " bytes");
                        break;
                    case 2:
                        System.out.println("-- Structure by name --");
                        printByName(root); //Starting folder = root
                        break;
                    case 3:
                        System.out.println("-- Structure by size --");
                        printBySize(root); //Starting folder = root
                        break;
                    case 0:
                        break;
                        default:
                            System.out.println("Invalid option");
                }
            }catch(Exception e){
                System.out.println("Error. Invalid input");
                sc.nextLine();
                option = -1; //stops do-while loop
            }

        }while(option != 0);

        sc.close();

    }

    private static void printByName(Folder root){
        printSortedByName(root, "");
        System.out.println("\nTotal size = " + root.getSize() + " bytes");
    }

    private static void printSortedByName(Folder folder, String indent){
        List<Component> children = folder.getChild(); //Will contain every thing UNDER the starting folder

        List<File> files = new ArrayList<>();
        for(Component c : children){
            if(c instanceof File){
                files.add((File)c); //If the element c is a file, add it to the files only array list
            }
        }
        files.sort((f1, f2) -> f1.name.compareToIgnoreCase(f2.name)); //Compare the names of both files

        //Rebuild folders structure, keeping folders in the same place
        Iterator<File> fit = files.iterator();

        for(Component c : children){//For every single thing in children class, no matter the type
            if (c instanceof File){
                File f = fit.next(); //Get the next element using iterator
                System.out.println(indent + f.name + " (" + f.getSize() + "bytes)"); //Print the element with indent and file size
            }else if(c instanceof Folder){
                Folder sub = (Folder) c;
                System.out.println(indent + sub.name + "/"); //Print its name with indent + a / at the end
                printSortedByName(sub, indent + "  "); //Recursive call of the method -- Restart whole loop
                //indent + "  " = aumenta la sangria
            }
        }
    }

    private static void printBySize(Folder root){
        printSortedBySize(root, "");
        System.out.println("\nTotal size = " + root.getSize() + " bytes");
    }

    private static void printSortedBySize(Folder folder, String indent){
        List<Component> children = folder.getChild();


        //"sort" sorts the list according to what its in its attribute
        children.sort((c1, c2) -> {
            int cmp = Integer.compare(c1.getSize(), c2.getSize()); //Comparing by size
            //cmp < 0 -- first element is smaller
            //cmp = 0 -- equivaent
            //cmp > 0 -- second element is smaller
            if(cmp != 0) return cmp; //If they are not the same, return to decide order inmediately

            //If there is a tie in size
            String name1 = (c1 instanceof File) ? ((File) c1).name : ((Folder) c1).name;
            String name2 = (c2 instanceof File) ? ((File)c2).name : ((Folder) c2).name;
            return name1.compareToIgnoreCase(name2); //Compare by name
            //compareToIgnoreCase -- compares strings lexicographically ignoring case differences
            //return negative numer -- first goes first
            //return positive number -- second goes first
            // return 0 -- same
        });


        for(Component c : children){
            if(c instanceof File){//If said element is a file
                File f =(File) c;
                System.out.println(indent + f.name + " (" + f.getSize() + "bytes)");
            }else if( c instanceof Folder){//If element is a folder
                Folder sub = (Folder) c;
                System.out.println(indent + sub.name + "/"); //Print name + /
                printSortedBySize(sub, indent + "  "); //Recursive call starting from the subfolder and adding more indent
            }
        }
    }
}
