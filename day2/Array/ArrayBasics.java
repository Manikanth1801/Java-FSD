// Array Basics in Java
// Arrays are used to store multiple values of the same type

public class ArrayBasics {
    public static void main(String[] args) {
        // Array Declaration and Initialization
        System.out.println("--- Array Declaration and Initialization ---");
        
        // Method 1: Declare and initialize separately
        int[] numbers; // declaration
        numbers = new int[5]; // initialization with size 5
        
        // Method 2: Declare and initialize together
        int[] scores = new int[3]; // array of size 3, all elements are 0 by default
        
        // Method 3: Declare and initialize with values
        int[] marks = {85, 90, 78, 92, 88}; // direct initialization
        
        // Method 4: Using new keyword with values
        String[] names = new String[]{"Alice", "Bob", "Charlie"};
        
        // Accessing array elements using index (starts from 0)
        System.out.println("\n--- Accessing Array Elements ---");
        System.out.println("First mark: " + marks[0]); // index 0
        System.out.println("Second mark: " + marks[1]); // index 1
        System.out.println("Last mark: " + marks[4]); // index 4
        
        // Array length property
        System.out.println("Array length: " + marks.length);
        
        // Assigning values to array elements
        System.out.println("\n--- Assigning Values ---");
        scores[0] = 95;
        scores[1] = 87;
        scores[2] = 91;
        
        System.out.println("scores[0] = " + scores[0]);
        System.out.println("scores[1] = " + scores[1]);
        System.out.println("scores[2] = " + scores[2]);
        
        // Printing all array elements using for loop
        System.out.println("\n--- Printing Array using for Loop ---");
        System.out.print("marks array: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        
        // Printing all array elements using enhanced for loop
        System.out.println("\n--- Printing Array using Enhanced for Loop ---");
        System.out.print("names array: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
        
        // Finding sum and average
        System.out.println("\n--- Sum and Average ---");
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double average = (double) sum / marks.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        
        // Finding maximum and minimum
        System.out.println("\n--- Maximum and Minimum ---");
        int max = marks[0];
        int min = marks[0];
        
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
            if (marks[i] < min) {
                min = marks[i];
            }
        }
        System.out.println("Maximum mark: " + max);
        System.out.println("Minimum mark: " + min);
        
        // Array of different data types
        System.out.println("\n--- Arrays of Different Types ---");
        boolean[] flags = {true, false, true, false};
        char[] letters = {'A', 'B', 'C', 'D', 'E'};
        double[] prices = {10.5, 20.75, 15.25, 30.0};
        
        System.out.print("Boolean array: ");
        for (boolean flag : flags) {
            System.out.print(flag + " ");
        }
        System.out.println();
        
        System.out.print("Character array: ");
        for (char letter : letters) {
            System.out.print(letter + " ");
        }
        System.out.println();
        
        System.out.print("Double array: ");
        for (double price : prices) {
            System.out.print("$" + price + " ");
        }
        System.out.println();
        
        // Common array operations
        System.out.println("\n--- Common Array Operations ---");
        
        // 1. Searching for an element
        int searchValue = 90;
        boolean found = false;
        int position = -1;
        
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == searchValue) {
                found = true;
                position = i;
                break;
            }
        }
        
        if (found) {
            System.out.println("Value " + searchValue + " found at index " + position);
        } else {
            System.out.println("Value " + searchValue + " not found");
        }
        
        // 2. Counting occurrences
        int[] data = {1, 2, 3, 2, 1, 2, 4, 2};
        int target = 2;
        int count = 0;
        
        for (int value : data) {
            if (value == target) {
                count++;
            }
        }
        System.out.println("Number " + target + " appears " + count + " times");
        
        // 3. Copying array elements
        System.out.println("\n--- Array Copying ---");
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = new int[original.length];
        
        // Manual copying
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        
        System.out.print("Original: ");
        for (int val : original) {
            System.out.print(val + " ");
        }
        System.out.println();
        
        System.out.print("Copy: ");
        for (int val : copy) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

// Save as ArrayBasics.java
// To run: java ArrayBasics.java
