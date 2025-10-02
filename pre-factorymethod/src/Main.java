package src;

import src.Book;
public class Main{
    public static void main(String [] args){
        Book book1 = new Book ("Pride and Prejudice", 95132456, "Jane Austen");
        book1.bookInfo();
        book1.print();
    }
}