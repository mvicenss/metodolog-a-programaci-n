package src.main.java.com;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Component {
    protected String name;
    protected List<Component> children;

    public Folder(String name){
        this.name=name;
        this.children = new ArrayList<>();
    }

    @Override
        public void print(String indentation) {//Exclusive print for folders
        System.out.println(indentation + name + "/"); //Name of root folder + /
        for (Component child : children) {//From then, for every children folder (we are Folder.java):
            child.print(indentation + "  ");//Recursive call aumenting the indentation
        }
    }

    @Override
    public int getSize() { //Total sizes of all files inside
        int totalSize = 0 ;
        for (Component child : children) {
            totalSize += child.getSize();
        }
        return totalSize;
    }

    public void add(Component child){
        children.add(child); //Add child to the List
    }

    public void remove(Component child){
        children.remove(child);
    }

    public List<Component> getChild(){ //Returns all childs
        return new ArrayList<>(children); //new ArrayList with the contents of children
    }
}
