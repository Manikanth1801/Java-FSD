// Unary Operators in Java
// Operators that work with only one operand

public class UnaryOperators {
    public static void main(String[] args) {
        // Unary Plus (+) - indicates positive value
        int a = 5;
        int positiveA = +a;
        System.out.println("Unary plus: +a = " + positiveA);
        
        // Unary Minus (-) - negates the value
        int negativeA = -a;
        System.out.println("Unary minus: -a = " + negativeA);
        
        // Pre-increment (++)
        System.out.println("\n--- Increment Operations ---");
        int x = 10;
        System.out.println("Original x = " + x);
        System.out.println("Pre-increment ++x = " + (++x)); // increments first, then uses value
        System.out.println("Current x = " + x);
        
        // Post-increment (++)
        int y = 10;
        System.out.println("\nOriginal y = " + y);
        System.out.println("Post-increment y++ = " + (y++)); // uses value first, then increments
        System.out.println("Current y = " + y);
        
        // Pre-decrement (--)
        System.out.println("\n--- Decrement Operations ---");
        int p = 8;
        System.out.println("Original p = " + p);
        System.out.println("Pre-decrement --p = " + (--p)); // decrements first, then uses value
        System.out.println("Current p = " + p);
        
        // Post-decrement (--)
        int q = 8;
        System.out.println("\nOriginal q = " + q);
        System.out.println("Post-decrement q-- = " + (q--)); // uses value first, then decrements
        System.out.println("Current q = " + q);
        
        // Logical NOT (!)
        System.out.println("\n--- Logical NOT ---");
        boolean flag = true;
        System.out.println("Original flag = " + flag);
        System.out.println("Logical NOT !flag = " + (!flag));
        System.out.println("Original flag remains = " + flag); // original value unchanged
        
        // Practical example: Loop counter
        System.out.println("\n--- Practical Example ---");
        int counter = 1;
        System.out.println("Counter examples:");
        System.out.println("Loop " + counter++ + ": Post-increment"); // prints 1, then increments
        System.out.println("Loop " + ++counter + ": Pre-increment");  // increments to 3, then prints
        System.out.println("Final counter = " + counter);
    }
}

// Save as UnaryOperators.java
// To run: java UnaryOperators.java
