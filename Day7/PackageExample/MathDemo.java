/*
 * File Order: 1
 * Intent: Demonstrate the use of Java's built-in packages for mathematical operations
 * 
 * This file shows how to use:
 * - java.lang.Math package (automatically imported)
 * - java.util.Scanner package (needs explicit import)
 * 
 * Key Learning Points:
 * 1. Built-in packages provide ready-to-use functionality
 * 2. Some packages like java.lang are automatically imported
 * 3. Other packages need explicit import statements
 */

import java.util.Scanner; // Explicit import for Scanner class

/**
 * MathDemo class demonstrates the usage of Java's built-in Math package
 * for performing various mathematical operations
 */
public class MathDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Java Built-in Package Demo ===");
        System.out.println("Using java.lang.Math and java.util.Scanner packages\n");
        
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Get two numbers from user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        // Demonstrate various Math operations
        System.out.println("\n=== Mathematical Operations ===");
        
        // Basic operations using Math class methods
        System.out.println("Maximum of " + num1 + " and " + num2 + " = " + Math.max(num1, num2));
        System.out.println("Minimum of " + num1 + " and " + num2 + " = " + Math.min(num1, num2));
        System.out.println("Absolute value of " + num1 + " = " + Math.abs(num1));
        System.out.println("Square root of " + num1 + " = " + Math.sqrt(num1));
        System.out.println("Power: " + num1 + " raised to " + num2 + " = " + Math.pow(num1, num2));
        
        // Advanced Math operations
        System.out.println("\n=== Advanced Math Operations ===");
        System.out.println("Ceiling of " + num1 + " = " + Math.ceil(num1));
        System.out.println("Floor of " + num1 + " = " + Math.floor(num1));
        System.out.println("Random number (0-1): " + Math.random());
        
        // Mathematical constants
        System.out.println("\n=== Mathematical Constants ===");
        System.out.println("Value of PI: " + Math.PI);
        System.out.println("Value of E: " + Math.E);
        
        // Close scanner to prevent resource leak
        scanner.close();
        
        System.out.println("\n=== Demo Complete ===");
        System.out.println("This demonstrates how built-in packages save development time!");
    }
}
