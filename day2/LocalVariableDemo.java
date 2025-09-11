// package day2;
// Example 3: Local Variable
// Declared inside methods and used only within that method
public class LocalVariableDemo {
    public void showMessage() {
        String message = "Hello from local variable!"; // local variable
        System.out.println(message);
    }

    // Main method: Entry point of the program
    public static void main(String[] args) {
        // Create an instance of LocalVariableDemo
        LocalVariableDemo obj = new LocalVariableDemo();
        // Call the showMessage method to display the local variable
        obj.showMessage();
        // System.out.println(message); won't work as not defined here
    }
}

// Save as LocalVariableDemo.java
// To run:
// 1. Compile: javac LocalVariableDemo.java
// 2. Run: java LocalVariableDemo
