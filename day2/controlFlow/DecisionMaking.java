// Decision Making Statements in Java
// Used to make decisions based on conditions

public class DecisionMaking {
    public static void main(String[] args) {
        // Simple if statement
        System.out.println("--- Simple if Statement ---");
        int number = 10;
        if (number > 0) {
            System.out.println(number + " is positive");
        }
        
        // if-else statement
        System.out.println("\n--- if-else Statement ---");
        int age = 17;
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
        
        // if-else if-else ladder
        System.out.println("\n--- if-else if-else Ladder ---");
        int marks = 85;
        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 35) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F (Fail)");
        }
        
        // Nested if statements
        System.out.println("\n--- Nested if Statements ---");
        int salary = 50000;
        int experience = 3;
        if (salary > 40000) {
            System.out.println("Good salary package");
            if (experience > 2) {
                System.out.println("Experienced candidate");
                if (experience > 5) {
                    System.out.println("Senior level position");
                }
            } else {
                System.out.println("Entry level position");
            }
        } else {
            System.out.println("Low salary package");
        }
        
        // Multiple conditions with logical operators
        System.out.println("\n--- Multiple Conditions ---");
        int temp = 25;
        boolean isSunny = true;
        if (temp > 20 && temp < 30 && isSunny) {
            System.out.println("Perfect weather for outdoor activities!");
        } else if (temp > 30 || temp < 10) {
            System.out.println("Extreme weather conditions");
        } else {
            System.out.println("Moderate weather");
        }
        
        // Practical example: ATM withdrawal
        System.out.println("\n--- ATM Withdrawal Example ---");
        double accountBalance = 5000.0;
        double withdrawAmount = 2000.0;
        if (withdrawAmount <= accountBalance) {
            if (withdrawAmount > 0) {
                accountBalance -= withdrawAmount;
                System.out.println("Withdrawal successful!");
                System.out.println("Remaining balance: $" + accountBalance);
            } else {
                System.out.println("Invalid withdrawal amount");
            }
        } else {
            System.out.println("Insufficient balance");
        }
        
        // Character validation
        System.out.println("\n--- Character Validation ---");
        char ch = 'A';
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase letter");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase letter");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a digit");
        } else {
            System.out.println(ch + " is a special character");
        }
    }
}

// Save as DecisionMaking.java
// To run: java DecisionMaking.java
