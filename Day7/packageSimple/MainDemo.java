/*
 * Intent: Demonstrate the basic usage of packages in Java
 * 
 * This file shows:
 * - How to create and use a custom package
 * - How to import classes from a package
 * - Benefits of using packages for code organization
 * 
 * Key Learning Points:
 * 1. Packages group related classes together
 * 2. Import statements bring classes into scope
 * 3. Packages prevent naming conflicts
 */

// Import the custom package
import packageSimple.utilities.Calculator;

/**
 * MainDemo class demonstrates the usage of a custom package
 */
public class MainDemo {
    public static void main(String[] args) {
        System.out.println("=== Package Simple Demo ===");

        // Use the Calculator class from the custom package
        int sum = Calculator.add(10, 20);
        int difference = Calculator.subtract(30, 15);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);

        System.out.println("\nPackages help organize code and prevent naming conflicts!");
    }
}
