// Program to ask user's name and greet them
import java.util.Scanner;

public class GreetUser {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        // Print greeting
        System.out.println("Hello, " + name + "! Welcome to Java.");
        sc.close();
    }
}

// Save as GreetUser.java
// To run:
// 1. Compile: javac GreetUser.java
// 2. Run: java GreetUser
