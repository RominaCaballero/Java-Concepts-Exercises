package exerciseFive;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int isbn;
    private static ArrayList<Book> bookCollection = new ArrayList<Book>();

    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    // Add book to the collection
    public static void addBook(Book book) {
        bookCollection.add(book);
    }

    // Remove book from the collection
    public static void removeBook(Book book) {
        bookCollection.remove(book);
    }

    // Static method to retrieve the entire book collection
    public static ArrayList<Book> get_BookCollection() {
        // Return the bookCollection ArrayList
        return bookCollection;
    }

}
