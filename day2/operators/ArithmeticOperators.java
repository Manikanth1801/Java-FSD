// Arithmetic Operators in Java
// Used for basic mathematical operations

public class ArithmeticOperators {
    public static void main(String[] args) {
        // Initialize two numbers for demonstration
        int a = 15;
        int b = 4;
        
        System.out.println("Numbers: a = " + a + ", b = " + b);
        System.out.println("--- Arithmetic Operations ---");
        
        // Addition (+)
        int sum = a + b;
        System.out.println("Addition: " + a + " + " + b + " = " + sum);
        
        // Subtraction (-)
        int difference = a - b;
        System.out.println("Subtraction: " + a + " - " + b + " = " + difference);
        
        // Multiplication (*)
        int product = a * b;
        System.out.println("Multiplication: " + a + " * " + b + " = " + product);
        
        // Division (/)
        int quotient = a / b;
        System.out.println("Division: " + a + " / " + b + " = " + quotient);
        
        // Modulus (%) - gives remainder
        int remainder = a % b;
        System.out.println("Modulus: " + a + " % " + b + " = " + remainder);
        
        // Increment (++)
        System.out.println("\nIncrement Operations:");
        int x = 5;
        System.out.println("Original x = " + x);
        System.out.println("Pre-increment: ++x = " + (++x)); // x becomes 6, then prints
        System.out.println("Post-increment: x++ = " + (x++)); // prints 6, then x becomes 7
        System.out.println("Final x = " + x);
        
        // Decrement (--)
        System.out.println("\nDecrement Operations:");
        int y = 10;
        System.out.println("Original y = " + y);
        System.out.println("Pre-decrement: --y = " + (--y)); // y becomes 9, then prints
        System.out.println("Post-decrement: y-- = " + (y--)); // prints 9, then y becomes 8
        System.out.println("Final y = " + y);
    }
}

// Save as ArithmeticOperators.java
// To run: java ArithmeticOperators.java
