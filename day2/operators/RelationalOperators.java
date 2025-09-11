// Relational (Comparison) Operators in Java
// Used to compare two values and return boolean result (true/false)

public class RelationalOperators {
    public static void main(String[] args) {
        // Initialize two numbers for comparison
        int a = 10;
        int b = 5;
        int c = 10;
        
        System.out.println("Numbers: a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("--- Relational Operations ---");
        
        // Equal to (==)
        boolean isEqual = (a == c);
        System.out.println("Equal to: " + a + " == " + c + " is " + isEqual);
        
        // Not equal to (!=)
        boolean isNotEqual = (a != b);
        System.out.println("Not equal to: " + a + " != " + b + " is " + isNotEqual);
        
        // Greater than (>)
        boolean isGreater = (a > b);
        System.out.println("Greater than: " + a + " > " + b + " is " + isGreater);
        
        // Less than (<)
        boolean isLess = (b < a);
        System.out.println("Less than: " + b + " < " + a + " is " + isLess);
        
        // Greater than or equal to (>=)
        boolean isGreaterOrEqual = (a >= c);
        System.out.println("Greater than or equal: " + a + " >= " + c + " is " + isGreaterOrEqual);
        
        // Less than or equal to (<=)
        boolean isLessOrEqual = (b <= a);
        System.out.println("Less than or equal: " + b + " <= " + a + " is " + isLessOrEqual);
        
        // Using in if conditions
        System.out.println("\n--- Using in Conditions ---");
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        }
        
        if (a == c) {
            System.out.println(a + " is equal to " + c);
        }
    }
}

// Save as RelationalOperators.java
// To run: java RelationalOperators.java
