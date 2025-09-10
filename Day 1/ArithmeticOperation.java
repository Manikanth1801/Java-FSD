// Program to perform arithmetic operations based on user input
import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get first number
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        // Get second number
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        // Get operation symbol
        System.out.print("Enter operation (+, -, *, /): ");
        char op = sc.next().charAt(0);
        double result = 0;
        boolean valid = true;
        // Perform operation
        switch(op) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': 
                if(num2 != 0) result = num1 / num2;
                else {
                    System.out.println("Error: Division by zero");
                    valid = false;
                }
                break;
            default:
                System.out.println("Invalid operation symbol");
                valid = false;
        }
        if(valid) {
            System.out.println("Result: " + result);
        }
        sc.close();
    }
}

// Save as ArithmeticOperation.java
// To run:
// 1. Compile: javac ArithmeticOperation.java
// 2. Run: java ArithmeticOperation
