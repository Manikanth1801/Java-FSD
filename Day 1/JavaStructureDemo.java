// This file explains the basic structure and working of a Java program.

/*
Java Program Structure:
1. Class Declaration: Every Java program starts with a class.
2. main() Method: Entry point of the program. JVM starts execution from here.
3. Statements: Instructions inside main() are executed sequentially.
*/

public class JavaStructureDemo {
    // main method: program execution starts here
    public static void main(String[] args) {
        // Declare a variable
        int number = 10;
        // Print the value of the variable
        System.out.println("The value of number is: " + number);
        // Call a method
        greet();
    }

    // A simple method to demonstrate method usage
    public static void greet() {
        System.out.println("Welcome to Java Programming!");
    }
}

// Save this file as JavaStructureDemo.java
// To run:
// 1. Compile: javac JavaStructureDemo.java
// 2. Run: java JavaStructureDemo
