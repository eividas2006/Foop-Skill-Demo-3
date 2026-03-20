// Book.java
package com.mycompany.libraryproject;

public class Book extends LibraryItem {

    private String author;
    private String isbn;

    //constructor implemented
    public Book(int itemID, String title, boolean available, String author, String isbn) {
        super(itemID, title, available);
        this.author = author;
        this.isbn = isbn;
    }

    //Author getter
    public String getAuthor() {
        return author;
    }

    //author setter
    public void setAuthor(String author) {
        this.author = author;
    }

    //ISBN getter
    public String getIsbn() {
        return isbn;
    }

    //ISBN Setter
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

   
    public String toString() 
    {
        return super.toString() 
        + "\nauthor: " + author
        + "\nisbn: " + isbn;
    }
}