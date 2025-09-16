/*
 * Order: 1
 * Topic: Basic Package Creation and Utility Class
 * Description: This file demonstrates how to create a simple package
 *              and define a utility class with static methods
 */

// Package declaration - MUST be the first non-comment line
// This tells Java that this class belongs to the utils package
package utils;

/**
 * Calculator - A simple utility class demonstrating basic package usage
 * This class contains static methods for basic arithmetic operations
 */
public class Calculator {
    
    /**
     * Adds two integers
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    public static int add(int a, int b) {
        System.out.println("Calculator.add() called with values: " + a + " and " + b);
        return a + b;
    }
    
    /**
     * Subtracts second number from first
     * @param a first number
     * @param b second number
     * @return difference of a and b
     */
    public static int subtract(int a, int b) {
        System.out.println("Calculator.subtract() called with values: " + a + " and " + b);
        return a - b;
    }
    
    /**
     * Multiplies two integers
     * @param a first number
     * @param b second number
     * @return product of a and b
     */
    public static int multiply(int a, int b) {
        System.out.println("Calculator.multiply() called with values: " + a + " and " + b);
        return a * b;
    }
    
    /**
     * Divides first number by second (integer division)
     * @param a dividend
     * @param b divisor
     * @return quotient of a divided by b
     */
    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        System.out.println("Calculator.divide() called with values: " + a + " and " + b);
        return a / b;
    }
}
