// Jump Statements in Java
// Used to transfer control from one part of program to another
// break and continue statements

public class JumpStatements {
    public static void main(String[] args) {
        // break statement in loops
        System.out.println("--- break Statement in Loop ---");
        System.out.println("Finding first number divisible by 7:");
        for (int i = 1; i <= 20; i++) {
            if (i % 7 == 0) {
                System.out.println("Found: " + i);
                break; // exit the loop immediately
            }
            System.out.println("Checking: " + i);
        }
        System.out.println("Loop ended due to break");
        
        // break in while loop
        System.out.println("\n--- break in while Loop ---");
        int num = 1;
        while (true) { // infinite loop
            if (num > 5) {
                System.out.println("Breaking at num = " + num);
                break; // exit when num exceeds 5
            }
            System.out.println("num = " + num);
            num++;
        }
        
        // continue statement - skip current iteration
        System.out.println("\n--- continue Statement ---");
        System.out.println("Printing odd numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // skip even numbers
            }
            System.out.println("Odd number: " + i);
        }
        
        // continue in while loop
        System.out.println("\n--- continue in while Loop ---");
        System.out.println("Printing numbers except multiples of 3:");
        int count = 0;
        while (count < 10) {
            count++;
            if (count % 3 == 0) {
                continue; // skip multiples of 3
            }
            System.out.println("Number: " + count);
        }
        
        // break in nested loops
        System.out.println("\n--- break in Nested Loops ---");
        System.out.println("Finding first pair where i*j > 15:");
        outerLoop: // label for outer loop
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println("i=" + i + ", j=" + j + ", i*j=" + (i*j));
                if (i * j > 15) {
                    System.out.println("Breaking both loops");
                    break outerLoop; // break outer loop using label
                }
            }
        }
        
        // continue with label
        System.out.println("\n--- continue with Label ---");
        System.out.println("Skipping when i=3:");
        outer:
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 3) {
                    System.out.println("Skipping outer loop iteration i=" + i);
                    continue outer; // continue outer loop
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
        
        // Practical example: Search in array
        System.out.println("\n--- Array Search Example ---");
        int[] numbers = {5, 12, 8, 21, 16, 9, 14};
        int searchValue = 21;
        boolean found = false;
        
        System.out.println("Searching for " + searchValue + " in array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Checking index " + i + ": " + numbers[i]);
            if (numbers[i] == searchValue) {
                System.out.println("Found " + searchValue + " at index " + i);
                found = true;
                break; // stop searching once found
            }
        }
        
        if (!found) {
            System.out.println(searchValue + " not found in array");
        }
        
        // Menu system with break
        System.out.println("\n--- Menu System Example ---");
        int[] menuChoices = {1, 3, 5, 4}; // simulating user inputs
        
        for (int choice : menuChoices) {
            System.out.println("\nMenu Choice: " + choice);
            switch (choice) {
                case 1:
                    System.out.println("Opening File...");
                    break;
                case 2:
                    System.out.println("Saving File...");
                    break;
                case 3:
                    System.out.println("Printing...");
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break; // this breaks the switch, not the loop
                case 5:
                    System.out.println("Invalid choice, continuing...");
                    continue; // skip to next iteration
                default:
                    System.out.println("Unknown choice");
            }
            
            if (choice == 4) {
                System.out.println("Program terminated");
                break; // this breaks the for loop
            }
        }
        
        // Skip negative numbers example
        System.out.println("\n--- Skip Negative Numbers ---");
        int[] mixedNumbers = {1, -2, 3, -4, 5, -6, 7};
        int positiveSum = 0;
        
        System.out.println("Processing only positive numbers:");
        for (int number : mixedNumbers) {
            if (number < 0) {
                System.out.println("Skipping negative: " + number);
                continue; // skip negative numbers
            }
            System.out.println("Adding positive: " + number);
            positiveSum += number;
        }
        System.out.println("Sum of positive numbers: " + positiveSum);
        
        // Password attempts with break
        System.out.println("\n--- Password Attempts Example ---");
        String[] attempts = {"wrong1", "wrong2", "password123", "wrong3"};
        String correctPassword = "password123";
        int maxAttempts = 3;
        
        for (int attempt = 0; attempt < attempts.length && attempt < maxAttempts; attempt++) {
            System.out.println("Attempt " + (attempt + 1) + ": " + attempts[attempt]);
            
            if (attempts[attempt].equals(correctPassword)) {
                System.out.println("Access granted!");
                break; // successful login, exit loop
            } else {
                System.out.println("Incorrect password");
                if (attempt == maxAttempts - 1) {
                    System.out.println("Maximum attempts reached. Access denied!");
                }
            }
        }
    }
}

// Save as JumpStatements.java
// To run: java JumpStatements.java
