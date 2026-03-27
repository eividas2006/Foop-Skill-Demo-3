// Book.java
public class Book extends LibraryItem {

    private String author;
    private String isbn;

    public Book(int itemID, String title, boolean available, String author, String isbn) {
        super(itemID, title, available);
        // constructor implementation
    }

    public String getAuthor() {
        // getter implementation
        return null;
    }

    public void setAuthor(String author) {
        // setter implementation
    }

    public String getIsbn() {
        // getter implementation
        return null;
    }

    public void setIsbn(String isbn) {
        // setter implementation
    }

    @Override
    public String toString() {
        // toString implementation
        return null;
    }
}
