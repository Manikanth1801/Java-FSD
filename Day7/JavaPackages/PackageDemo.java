/*
 * Order: 5 (MAIN CLASS - RUN THIS ONE)
 * Topic: Using Packages - Main Demo
 * Description: This file demonstrates how to import and use classes from different packages
 *              This is the main class that should be run to see all package examples
 * 
 * TO RUN: Navigate to Day7/JavaPackages directory and run:
 *         javac *.java utils/*.java models/*.java
 *         java PackageDemo
 */

// Import statements - tells Java which classes from other packages we want to use
import models.Book;      // Import Calculator class from utils package
import models.Student;    // Import StringHelper class from utils package
import utils.Calculator;        // Import Student class from models package
import utils.StringHelper;          // Import Book class from models package

/**
 * PackageDemo - Main class demonstrating package usage
 * This class shows how to import and use classes from different packages
 */
public class PackageDemo {
    
    public static void main(String[] args) {
        
        System.out.println("=== JAVA PACKAGES DEMONSTRATION ===");
        System.out.println("This demo shows how packages work in Java\n");
        
        // ===== PART 1: Using Calculator from utils package =====
        System.out.println("1. USING CALCULATOR FROM UTILS PACKAGE:");
        System.out.println("---------------------------------------");
        
        // Using static methods from Calculator class
        int sum = Calculator.add(10, 5);
        System.out.println("Sum result: " + sum);
        
        int difference = Calculator.subtract(10, 5);
        System.out.println("Difference result: " + difference);
        
        int product = Calculator.multiply(10, 5);
        System.out.println("Product result: " + product);
        
        int quotient = Calculator.divide(10, 5);
        System.out.println("Quotient result: " + quotient);
        
        System.out.println(); // Empty line for spacing
        
        // ===== PART 2: Using StringHelper from utils package =====
        System.out.println("2. USING STRING HELPER FROM UTILS PACKAGE:");
        System.out.println("------------------------------------------");
        
        String testString = "Hello Java Packages";
        
        // Using static methods from StringHelper class
        String reversed = StringHelper.reverse(testString);
        System.out.println("Original: " + testString);
        System.out.println("Reversed: " + reversed);
        
        int wordCount = StringHelper.countWords(testString);
        System.out.println("Word count: " + wordCount);
        
        String uppercase = StringHelper.toUpperCase(testString);
        System.out.println("Uppercase: " + uppercase);
        
        System.out.println(); // Empty line for spacing
        
        // ===== PART 3: Using Student from models package =====
        System.out.println("3. USING STUDENT FROM MODELS PACKAGE:");
        System.out.println("-------------------------------------");
        
        // Creating objects from model classes
        Student student1 = new Student("Alice Johnson", 20, "S001", "Computer Science");
        Student student2 = new Student("Bob Smith", 19, "S002", "Mathematics");
        
        // Using methods from Student class
        student1.displayInfo();
        student1.study();
        
        student2.displayInfo();
        student2.study();
        
        System.out.println(); // Empty line for spacing
        
        // ===== PART 4: Using Book from models package =====
        System.out.println("4. USING BOOK FROM MODELS PACKAGE:");
        System.out.println("----------------------------------");
        
        // Creating objects from Book class
        Book book1 = new Book("Java Programming", "James Gosling", 500);
        Book book2 = new Book("Data Structures", "Robert Sedgewick", 600);
        
        // Using methods from Book class
        book1.displayInfo();
        book1.borrowBook();
        book1.borrowBook(); // Try to borrow again
        book1.returnBook();
        
        book2.displayInfo();
        book2.borrowBook();
        
        System.out.println(); // Empty line for spacing
        
        // ===== PART 5: Combining packages =====
        System.out.println("5. COMBINING CLASSES FROM DIFFERENT PACKAGES:");
        System.out.println("---------------------------------------------");
        
        // Using Calculator to calculate student's age after 10 years
        int futureAge = Calculator.add(student1.getAge(), 10);
        System.out.println(student1.getName() + " will be " + futureAge + " years old in 10 years");
        
        // Using StringHelper to manipulate book title
        String bookTitleUpper = StringHelper.toUpperCase(book1.getTitle());
        System.out.println("Book title in uppercase: " + bookTitleUpper);
        
        System.out.println("\n=== DEMONSTRATION COMPLETE ===");
        System.out.println("This example showed:");
        System.out.println("- How to create packages using 'package' keyword");
        System.out.println("- How to import classes using 'import' statements");
        System.out.println("- How to organize related classes in packages");
        System.out.println("- How to use classes from different packages together");
    }
}
