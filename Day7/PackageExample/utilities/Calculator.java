/*
 * File Order: 2
 * Intent: Simple Calculator utility class to demonstrate custom package creation
 * 
 * This file shows:
 * - How to create a custom package (utilities)
 * - How to organize related functionality in a package
 * - Public methods that can be accessed from other packages
 * 
 * Key Learning Points:
 * 1. Package declaration must be the first non-comment line
 * 2. Package name should match directory structure
 * 3. Public classes can be accessed from other packages
 */

package utilities; // Package declaration - must match directory name

/**
 * Calculator class provides basic arithmetic operations
 * This class demonstrates how to organize utility functions in a package
 */
public class Calculator {
    
    /**
     * Adds two numbers and returns the result
     * @param a First number
     * @param b Second number
     * @return Sum of a and b
     */
    public static int add(int a, int b) {
        System.out.println("Calculator: Adding " + a + " + " + b);
        return a + b;
    }
    
    /**
     * Subtracts second number from first number
     * @param a First number (minuend)
     * @param b Second number (subtrahend)
     * @return Difference of a and b
     */
    public static int subtract(int a, int b) {
        System.out.println("Calculator: Subtracting " + a + " - " + b);
        return a - b;
    }
    
    /**
     * Multiplies two numbers and returns the result
     * @param a First number
     * @param b Second number
     * @return Product of a and b
     */
    public static int multiply(int a, int b) {
        System.out.println("Calculator: Multiplying " + a + " * " + b);
        return a * b;
    }
    
    /**
     * Divides first number by second number
     * @param a First number (dividend)
     * @param b Second number (divisor)
     * @return Quotient of a divided by b
     * @throws ArithmeticException if b is zero
     */
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        System.out.println("Calculator: Dividing " + a + " / " + b);
        return (double) a / b;
    }
    
    /**
     * Returns information about this calculator utility
     * @return String describing the calculator
     */
    public static String getInfo() {
        return "Simple Calculator from utilities package - provides basic arithmetic operations";
    }
}
