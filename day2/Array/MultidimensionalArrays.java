// Multidimensional Arrays in Java
// Arrays with more than one dimension (array of arrays)

public class MultidimensionalArrays {
    public static void main(String[] args) {
        // 2D Array Declaration and Initialization
        System.out.println("--- 2D Array Basics ---");
        
        // Method 1: Declare and initialize with size
        int[][] matrix = new int[3][4]; // 3 rows, 4 columns
        
        // Method 2: Direct initialization with values
        int[][] numbers = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        
        // Method 3: Initialize row by row
        String[][] students = new String[2][3];
        students[0][0] = "Alice"; students[0][1] = "Bob"; students[0][2] = "Charlie";
        students[1][0] = "David"; students[1][1] = "Eve"; students[1][2] = "Frank";
        
        // Accessing 2D array elements
        System.out.println("--- Accessing 2D Array Elements ---");
        System.out.println("Element at row 1, column 2: " + numbers[1][2]); // prints 7
        System.out.println("First student: " + students[0][0]); // prints Alice
        
        // Array dimensions
        System.out.println("Number of rows: " + numbers.length);
        System.out.println("Number of columns in row 0: " + numbers[0].length);
        
        // Printing 2D array using nested loops
        System.out.println("\n--- Printing 2D Array ---");
        System.out.println("Numbers matrix:");
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                System.out.print(numbers[row][col] + "\t"); // \t for tab space
            }
            System.out.println(); // new line after each row
        }
        
        // Enhanced for loop for 2D arrays
        System.out.println("\n--- Enhanced for Loop with 2D Array ---");
        System.out.println("Students list:");
        for (String[] row : students) {
            for (String student : row) {
                System.out.print(student + "\t");
            }
            System.out.println();
        }
        
        // Practical Example: Grade Sheet
        System.out.println("\n--- Grade Sheet Example ---");
        // Rows: Students, Columns: Subjects (Math, Science, English)
        int[][] grades = {
            {85, 90, 78}, // Student 1
            {92, 88, 85}, // Student 2
            {78, 85, 92}, // Student 3
            {95, 87, 89}  // Student 4
        };
        
        String[] studentNames = {"Alice", "Bob", "Charlie", "David"};
        String[] subjects = {"Math", "Science", "English"};
        
        // Print header
        System.out.print("Student\t\t");
        for (String subject : subjects) {
            System.out.print(subject + "\t");
        }
        System.out.println("Average");
        
        // Print grades and calculate averages
        for (int i = 0; i < grades.length; i++) {
            System.out.print(studentNames[i] + "\t\t");
            int sum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + "\t");
                sum += grades[i][j];
            }
            double average = (double) sum / grades[i].length;
            System.out.printf("%.1f%n", average);
        }
        
        // Calculate subject averages
        System.out.println("\nSubject Averages:");
        for (int j = 0; j < subjects.length; j++) {
            int sum = 0;
            for (int i = 0; i < grades.length; i++) {
                sum += grades[i][j];
            }
            double average = (double) sum / grades.length;
            System.out.printf("%s: %.1f%n", subjects[j], average);
        }
        
        // Jagged Arrays (arrays with different row lengths)
        System.out.println("\n--- Jagged Arrays ---");
        int[][] jaggedArray = new int[3][]; // 3 rows, columns not specified
        jaggedArray[0] = new int[4]; // first row has 4 columns
        jaggedArray[1] = new int[2]; // second row has 2 columns
        jaggedArray[2] = new int[3]; // third row has 3 columns
        
        // Initialize jagged array
        jaggedArray[0] = new int[]{1, 2, 3, 4};
        jaggedArray[1] = new int[]{5, 6};
        jaggedArray[2] = new int[]{7, 8, 9};
        
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.print("Row " + i + ": ");
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        
        // 3D Array Example
        System.out.println("\n--- 3D Array Example ---");
        // Think of it as: Building -> Floor -> Room
        int[][][] building = new int[2][3][4]; // 2 floors, 3 rooms per floor, 4 values per room
        
        // Initialize some values
        building[0][0][0] = 101; // Floor 0, Room 0, Position 0
        building[0][1][2] = 205; // Floor 0, Room 1, Position 2
        building[1][2][1] = 312; // Floor 1, Room 2, Position 1
        
        System.out.println("3D Array dimensions:");
        System.out.println("Floors: " + building.length);
        System.out.println("Rooms per floor: " + building[0].length);
        System.out.println("Positions per room: " + building[0][0].length);
        
        // Matrix operations example
        System.out.println("\n--- Matrix Addition ---");
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        int[][] matrixB = {
            {7, 8, 9},
            {10, 11, 12}
        };
        
        int[][] result = new int[matrixA.length][matrixA[0].length];
        
        // Add corresponding elements
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        
        System.out.println("Matrix A + Matrix B:");
        for (int[] row : result) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
        
        // Searching in 2D array
        System.out.println("\n--- Searching in 2D Array ---");
        int searchValue = 6;
        boolean found = false;
        int foundRow = -1, foundCol = -1;
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == searchValue) {
                    found = true;
                    foundRow = i;
                    foundCol = j;
                    break;
                }
            }
            if (found) break;
        }
        
        if (found) {
            System.out.println("Value " + searchValue + " found at position [" + foundRow + "][" + foundCol + "]");
        } else {
            System.out.println("Value " + searchValue + " not found");
        }
    }
}

// Save as MultidimensionalArrays.java
// To run: java MultidimensionalArrays.java
