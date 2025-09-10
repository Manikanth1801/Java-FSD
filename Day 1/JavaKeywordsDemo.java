// Common Java Keywords Explained
// This file demonstrates and explains frequently used Java keywords with comments.

public class JavaKeywordsDemo {
    // 'public' - access modifier, visible to all
    // 'class' - defines a class
    // 'static' - belongs to the class, not instance
    // 'void' - method does not return a value
    // 'main' - entry point method
    public static void main(String[] args) {
        // 'int' - integer data type
        int number = 5;
        // 'final' - value cannot be changed after assignment
        final double PI = 3.14159;
        // Primitive Data Types in Java:
        // 'byte' - 8-bit integer
        byte b = 10;
        // 'short' - 16-bit integer
        short s = 1000;
        // 'int' - 32-bit integer
        int i = 12345;
        // 'long' - 64-bit integer
        long l = 123456789L;
        // 'float' - 32-bit floating point
        float f = 3.14f;
        // 'double' - 64-bit floating point
        double d = 123.456;
        // 'char' - single character
        char c = 'A';
        // 'boolean' - true or false
        boolean flag = true;
        // 'if' - conditional statement
        if (number > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is not positive");
        }
        // 'for' - loop statement
        for (int k = 0; k < 3; k++) {
            System.out.println("Loop iteration: " + i);
        }
        // 'return' - exits from method (not needed in void main)
        // 'new' - creates new object
        String text = new String("Hello");
        // 'try', 'catch' - exception handling
        try {
            int result = number / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    // 'private' - access modifier, visible only within class
    private void exampleMethod() {
        // ...existing code...
    }
}

/*
Other important keywords:
- 'abstract': used to declare abstract classes or methods
- 'extends': inheritance between classes
- 'implements': implements an interface
- 'interface': defines an interface
- 'this': refers to current object
- 'super': refers to parent class
- 'break', 'continue': control loop flow
- 'switch', 'case', 'default': switch statement
- 'import': imports classes/packages
- 'package': defines package
- 'boolean', 'char', 'float', 'double', 'long', 'short', 'byte': primitive data types
*/

// Save as JavaKeywordsDemo.java
// To run:
// 1. Compile: javac JavaKeywordsDemo.java
// 2. Run: java JavaKeywordsDemo
