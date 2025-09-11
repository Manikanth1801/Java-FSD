// Loop Statements in Java
// Used to execute a block of code repeatedly

public class LoopStatements {
    public static void main(String[] args) {
        // while loop - checks condition first, then executes
        System.out.println("--- while Loop ---");
        int i = 1;
        System.out.println("Counting from 1 to 5:");
        while (i <= 5) {
            System.out.println("Count: " + i);
            i++; // increment to avoid infinite loop
        }
        
        // Sum of numbers using while loop
        System.out.println("\n--- Sum using while Loop ---");
        int num = 1;
        int sum = 0;
        while (num <= 10) {
            sum += num;
            num++;
        }
        System.out.println("Sum of numbers 1 to 10: " + sum);
        
        // do-while loop - executes at least once, then checks condition
        System.out.println("\n--- do-while Loop ---");
        int j = 1;
        System.out.println("do-while counting:");
        do {
            System.out.println("Count: " + j);
            j++;
        } while (j <= 3);
        
        // do-while with false condition (still executes once)
        System.out.println("\n--- do-while with false condition ---");
        int k = 10;
        do {
            System.out.println("This executes at least once: " + k);
            k++;
        } while (k < 10); // condition is false, but block executes once
        
        // for loop - initialization, condition, increment/decrement
        System.out.println("\n--- for Loop ---");
        System.out.println("Multiplication table of 5:");
        for (int m = 1; m <= 10; m++) {
            System.out.println("5 x " + m + " = " + (5 * m));
        }
        
        // for loop with different increments
        System.out.println("\n--- for Loop with different increments ---");
        System.out.println("Even numbers from 2 to 10:");
        for (int even = 2; even <= 10; even += 2) {
            System.out.println(even);
        }
        
        // Reverse counting with for loop
        System.out.println("\n--- Reverse counting ---");
        System.out.println("Countdown:");
        for (int countdown = 5; countdown >= 1; countdown--) {
            System.out.println(countdown);
        }
        System.out.println("Blast off!");
        
        // for-each loop (enhanced for loop) - for arrays/collections
        System.out.println("\n--- for-each Loop ---");
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.println("Element: " + number);
        }
        
        // for-each with String array
        System.out.println("\n--- for-each with String array ---");
        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }
        
        // Nested loops
        System.out.println("\n--- Nested Loops ---");
        System.out.println("Pattern printing:");
        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println(); // new line after each row
        }
        
        // Finding prime numbers
        System.out.println("\n--- Prime Numbers (1 to 20) ---");
        for (int n = 2; n <= 20; n++) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= n/2; divisor++) {
                if (n % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
        
        // Factorial calculation
        System.out.println("\n--- Factorial Calculation ---");
        int factorialNum = 5;
        long factorial = 1;
        for (int f = 1; f <= factorialNum; f++) {
            factorial *= f;
        }
        System.out.println("Factorial of " + factorialNum + " is: " + factorial);
        
        // Infinite loop prevention example
        System.out.println("\n--- Loop Safety Example ---");
        int counter = 0;
        int maxIterations = 5;
        while (true) { // potentially infinite loop
            System.out.println("Iteration: " + (counter + 1));
            counter++;
            if (counter >= maxIterations) {
                System.out.println("Breaking to prevent infinite loop");
                break; // exit the loop
            }
        }
    }
}

// Save as LoopStatements.java
// To run: java LoopStatements.java
