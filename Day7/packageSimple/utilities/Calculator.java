/*
 * Intent: Provide utility methods for basic arithmetic operations
 * 
 * This file shows:
 * - How to define a class in a custom package
 * - Public static methods for reuse
 * - Benefits of organizing utility functions in a package
 * 
 * Key Learning Points:
 * 1. Package declaration must match the directory structure
 * 2. Public methods can be accessed from other packages
 * 3. Utility classes group reusable methods together
 */

package packageSimple.utilities; // Package declaration

/**
 * Calculator class provides basic arithmetic operations
 */
public class Calculator {
    
    /**
     * Adds two numbers and returns the result
     * @param a First number
     * @param b Second number
     * @return Sum of a and b
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts second number from first number
     * @param a First number
     * @param b Second number
     * @return Difference of a and b
     */
    public static int subtract(int a, int b) {
        return a - b;
    }
}
