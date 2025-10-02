package src;

abstract class BookInfo{
    String name;
    int isbn;
    String author;

    public BookInfo(String name, int isbn, String author) {
        this.name = name;
        this.isbn = isbn;
        this.author = author;
    }

    public abstract void bookInfo();

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    //Getters
    public String getName(){
        return name;
    }
    public int getIsbn(){
        return isbn;
    }
    public String getAuthor(){
        return author;
    }
}


public class Book extends BookInfo implements Printable{

    //Constructor of Book class, that extends to the abstract class BookInfo. The goal is to initialize the parameters inherited from BookInfo
    //Abstract classes implementations must have all methods of the abstract class defined/acomodated to the new class
    public Book (String name, int isbn, String author) {
        super (name, isbn, author); //"super" = calls constructor of the superclass from the constructor of the subclass OR accessing methods of superclass that have been overriden
    }

    @Override
    public void bookInfo(){
        System.out.println("Name: " + name + " - ISBN: " + isbn + " - Author: " + author);
    }

    @Override
    public void print(){
        bookInfo();
    }
}
