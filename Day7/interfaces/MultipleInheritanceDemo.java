/*
 * Intent: Demonstrate multiple inheritance using interfaces in Java
 * 
 * This file shows:
 * - How a class can implement multiple interfaces
 * - Benefits of multiple inheritance for combining behaviors
 * 
 * Key Learning Points:
 * 1. Java supports multiple inheritance through interfaces
 * 2. A class can implement multiple interfaces
 * 3. Interfaces allow combining behaviors from different sources
 */

// Define the first interface
interface Printable {
    void print();
}

// Define the second interface
interface Showable {
    void show();
}

// Implement both interfaces in a single class
class Document implements Printable, Showable {
    @Override
    public void print() {
        System.out.println("Printing the document...");
    }

    @Override
    public void show() {
        System.out.println("Showing the document...");
    }
}

// Main class to demonstrate multiple inheritance
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Multiple Inheritance Demo ===");

        // Create an object of the class that implements both interfaces
        Document doc = new Document();

        // Call methods from both interfaces
        doc.print();
        doc.show();

        System.out.println("\nMultiple inheritance via interfaces is powerful!");
    }
}
