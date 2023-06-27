package class16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Book {
    private String title;
    private String author;
    private String isbn;
    private int quantity;

    public Book(String title, String author, String isbn, int quantity) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Bookstore {
    private List<Book> inventory;
    private Set<String> uniqueIsbns;

    public Bookstore() {
        inventory = new ArrayList<>();
        uniqueIsbns = new HashSet<>();
    }

    public void addBook(String title, String author, String isbn, int quantity) {
        if (!uniqueIsbns.contains(isbn)) {
            Book newBook = new Book(title, author, isbn, quantity);
            inventory.add(newBook);
            uniqueIsbns.add(isbn);
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Book with the same ISBN already exists in the inventory.");
        }
    }

    public void removeBookByIsbn(String isbn) {
        Book bookToRemove = null;
        for (Book book : inventory) {
            if (book.getIsbn().equals(isbn)) {
                bookToRemove = book;
                break;
            }
        }

        if (bookToRemove != null) {
            inventory.remove(bookToRemove);
            uniqueIsbns.remove(isbn);
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Book not found in the inventory.");
        }
    }

    public void searchBookByIsbn(String isbn) {
        for (Book book : inventory) {
            if (book.getIsbn().equals(isbn)) {
                System.out.println("Book details:");
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Quantity: " + book.getQuantity());
                return;
            }
        }
        System.out.println("Book not found in the inventory.");
    }

    public void displayInventory() {
        System.out.println("Current Inventory:");
        for (Book book : inventory) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("ISBN: " + book.getIsbn());
            System.out.println("Quantity: " + book.getQuantity());
            System.out.println("--------------------------");
        }
    }
}

public class BookstoreManagementSystem {
    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();

        // Add books
        bookstore.addBook("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "9780439708180", 10);

        // Try adding a duplicate book
        bookstore.addBook("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "9780439708180", 5);

        // Search book by ISBN
        bookstore.searchBookByIsbn("9780439708180");

        // Remove book by ISBN
        bookstore.removeBookByIsbn("9780439708180");

        // Display inventory
        bookstore.displayInventory();
    }
}