/*
 * Order: 4
 * Topic: Another Model Class in the Same Package
 * Description: This file demonstrates how multiple related classes
 *              can be organized in the same package
 */

// This class also belongs to the models package
package models;

/**
 * Book - A simple model class representing a book
 * Shows how multiple related model classes can exist in the same package
 */
public class Book {
    
    // Private fields
    private String title;
    private String author;
    private int pages;
    private boolean isAvailable;
    
    /**
     * Constructor to create a new Book
     * @param title book title
     * @param author book author
     * @param pages number of pages
     */
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isAvailable = true; // Books are available by default
        System.out.println("New Book created: " + title + " by " + author);
    }
    
    // Getter methods
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public int getPages() {
        return pages;
    }
    
    public boolean isAvailable() {
        return isAvailable;
    }
    
    // Setter methods
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setPages(int pages) {
        this.pages = pages;
    }
    
    /**
     * Method to borrow the book
     */
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book '" + title + "' has been borrowed.");
        } else {
            System.out.println("Book '" + title + "' is not available.");
        }
    }
    
    /**
     * Method to return the book
     */
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book '" + title + "' has been returned.");
        } else {
            System.out.println("Book '" + title + "' was not borrowed.");
        }
    }
    
    /**
     * Display book information
     */
    public void displayInfo() {
        System.out.println("=== Book Information ===");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        System.out.println("========================");
    }
    
    /**
     * Override toString method
     */
    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + 
               "', pages=" + pages + ", available=" + isAvailable + "}";
    }
}
