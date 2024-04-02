//8feb24

/*Write a Java program to create a class called "Book" with attributes for title,
  author, and ISBN, and methods to add and remove books from a collection.*/

package com.practiceprogram.demo;


import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private String isbn;

   // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
//
    // Getter methods
    public String getTitle() {
        return title;
    }
//
    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    // Method to add a book to the collection
    public static void addBook(List<Book> collection, Book book) {
        collection.add(book);
        System.out.println("Book added to the collection: " + book.getTitle());
    }

    // Method to remove a book from the collection
    public static void removeBook(List<Book> collection, String isbn) {
        for (Book book : collection) {
            if (book.getIsbn().equals(isbn)) {
                collection.remove(book);
                System.out.println("Book removed from the collection: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found in the collection.");
    }

    public static void main(String[] args) {
        // Creating a collection of books
        List<Book> bookCollection = new ArrayList<>();

        // Adding books to the collection
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book.addBook(bookCollection, book1);

        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");
        Book.addBook(bookCollection, book2);

        // Removing a book from the collection
        Book.removeBook(bookCollection, "9780743273565");
    }
}
