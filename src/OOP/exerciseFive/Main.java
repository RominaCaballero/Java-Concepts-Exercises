package OOP.exerciseFive;
/* Write a Java program to create a class called "Book"
with attributes for title, author, and ISBN, and methods
to add and remove books from a collection.
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("MYORAR", "Otessa", 801);
        Book book2 = new Book("The metamorfosis", "Kafka", 890);
        Book book3 = new Book("Java Programming", "Spring Boot", 802);

        Book.addBook(book1);
        Book.addBook(book2);
        Book.addBook(book3);

        // Retrieve the book collection and store it in an ArrayList named bookCollection
        ArrayList<Book> bookCollection = Book.get_BookCollection();

        System.out.println("This are the books in our collection!");
        for (Book book : bookCollection) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getIsbn());
        }

        //remove a book

        Book.removeBook(book3);

        System.out.println("This are the books after removing " + book3.getTitle() + " from the collection!");
        for (Book book : bookCollection) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getIsbn());
        }
    }
}
