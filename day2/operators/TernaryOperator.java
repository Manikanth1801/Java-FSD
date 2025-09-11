// Ternary (Conditional) Operator in Java
// Shorthand for if-else statements
// Syntax: condition ? value_if_true : value_if_false

public class TernaryOperator {
    public static void main(String[] args) {
        // Basic ternary operator example
        int a = 10;
        int b = 5;
        
        // Find maximum using ternary operator
        int max = (a > b) ? a : b;
        System.out.println("Numbers: a = " + a + ", b = " + b);
        System.out.println("Maximum using ternary: " + max);
        
        // Equivalent if-else statement for comparison
        int maxUsingIf;
        if (a > b) {
            maxUsingIf = a;
        } else {
            maxUsingIf = b;
        }
        System.out.println("Maximum using if-else: " + maxUsingIf);
        
        // Check even or odd
        System.out.println("\n--- Even/Odd Check ---");
        int number = 7;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number " + number + " is: " + result);
        
        // Age category determination
        System.out.println("\n--- Age Category ---");
        int age = 20;
        String category = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Age " + age + " is: " + category);
        
        // Grade assignment
        System.out.println("\n--- Grade Assignment ---");
        int marks = 85;
        String grade = (marks >= 90) ? "A" : (marks >= 80) ? "B" : (marks >= 70) ? "C" : "F";
        System.out.println("Marks: " + marks + ", Grade: " + grade);
        
        // Absolute value using ternary
        System.out.println("\n--- Absolute Value ---");
        int num = -15;
        int absolute = (num < 0) ? -num : num;
        System.out.println("Absolute value of " + num + " is: " + absolute);
        
        // Discount calculation
        System.out.println("\n--- Discount Calculation ---");
        double price = 1200;
        double discount = (price >= 1000) ? price * 0.1 : 0;
        double finalPrice = price - discount;
        System.out.println("Original price: $" + price);
        System.out.println("Discount: $" + discount);
        System.out.println("Final price: $" + finalPrice);
        
        // String operations with ternary
        System.out.println("\n--- String Operations ---");
        String name = "";
        String message = name.isEmpty() ? "Name is empty" : "Hello, " + name;
        System.out.println(message);
        
        name = "Java Student";
        message = name.isEmpty() ? "Name is empty" : "Hello, " + name;
        System.out.println(message);
        
        // Nested ternary (use carefully - can reduce readability)
        System.out.println("\n--- Temperature Category ---");
        int temperature = 25;
        String tempCategory = (temperature > 30) ? "Hot" : 
                             (temperature > 20) ? "Warm" : 
                             (temperature > 10) ? "Cool" : "Cold";
        System.out.println("Temperature " + temperature + "°C is: " + tempCategory);
    }
}

// Save as TernaryOperator.java
// To run: java TernaryOperator.java
