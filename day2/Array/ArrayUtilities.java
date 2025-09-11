// Array Utility Methods and Advanced Operations
// Useful methods for working with arrays in practical applications

import java.util.Scanner;

public class ArrayUtilities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. DYNAMIC ARRAY INPUT
        System.out.println("--- Dynamic Array Input ---");
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] userArray = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            userArray[i] = scanner.nextInt();
        }
        
        System.out.print("Your array: ");
        printArray(userArray);
        
        // 2. ARRAY TO STRING CONVERSION
        System.out.println("\n--- Array to String ---");
        String arrayString = arrayToString(userArray);
        System.out.println("Array as string: " + arrayString);
        
        // 3. ARRAY COMPARISON
        System.out.println("\n--- Array Comparison ---");
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {5, 4, 3, 2, 1};
        
        System.out.print("Array 1: ");
        printArray(array1);
        System.out.print("Array 2: ");
        printArray(array2);
        System.out.print("Array 3: ");
        printArray(array3);
        
        System.out.println("Array 1 equals Array 2: " + arraysEqual(array1, array2));
        System.out.println("Array 1 equals Array 3: " + arraysEqual(array1, array3));
        
        // 4. ARRAY RESIZING
        System.out.println("\n--- Array Resizing ---");
        int[] originalArray = {10, 20, 30};
        System.out.print("Original array: ");
        printArray(originalArray);
        
        int[] resizedArray = resizeArray(originalArray, 6);
        resizedArray[3] = 40;
        resizedArray[4] = 50;
        resizedArray[5] = 60;
        System.out.print("Resized array: ");
        printArray(resizedArray);
        
        // 5. REMOVE ELEMENT BY VALUE
        System.out.println("\n--- Remove Element ---");
        int[] numbersArray = {10, 20, 30, 20, 40, 20, 50};
        System.out.print("Original: ");
        printArray(numbersArray);
        
        int[] afterRemoval = removeElement(numbersArray, 20);
        System.out.print("After removing 20: ");
        printArray(afterRemoval);
        
        // 6. INSERT ELEMENT AT POSITION
        System.out.println("\n--- Insert Element ---");
        int[] baseArray = {1, 2, 4, 5};
        System.out.print("Original: ");
        printArray(baseArray);
        
        int[] afterInsertion = insertElement(baseArray, 2, 3); // insert 3 at index 2
        System.out.print("After inserting 3 at index 2: ");
        printArray(afterInsertion);
        
        // 7. ARRAY SUBSET CHECK
        System.out.println("\n--- Subset Check ---");
        int[] mainArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] subset1 = {3, 5, 7};
        int[] subset2 = {2, 11, 8};
        
        System.out.print("Main array: ");
        printArray(mainArray);
        System.out.print("Subset 1: ");
        printArray(subset1);
        System.out.print("Subset 2: ");
        printArray(subset2);
        
        System.out.println("Is subset1 a subset of main array: " + isSubset(mainArray, subset1));
        System.out.println("Is subset2 a subset of main array: " + isSubset(mainArray, subset2));
        
        // 8. ARRAY INTERSECTION
        System.out.println("\n--- Array Intersection ---");
        int[] setA = {1, 2, 3, 4, 5};
        int[] setB = {3, 4, 5, 6, 7};
        
        System.out.print("Set A: ");
        printArray(setA);
        System.out.print("Set B: ");
        printArray(setB);
        
        int[] intersection = findIntersection(setA, setB);
        System.out.print("Intersection: ");
        printArray(intersection);
        
        // 9. ARRAY UNION
        System.out.println("\n--- Array Union ---");
        int[] union = findUnion(setA, setB);
        System.out.print("Union: ");
        printArray(union);
        
        // 10. PALINDROME ARRAY CHECK
        System.out.println("\n--- Palindrome Array Check ---");
        int[] palindromeArray1 = {1, 2, 3, 2, 1};
        int[] palindromeArray2 = {1, 2, 3, 4, 5};
        
        System.out.print("Array 1: ");
        printArray(palindromeArray1);
        System.out.println("Is palindrome: " + isPalindrome(palindromeArray1));
        
        System.out.print("Array 2: ");
        printArray(palindromeArray2);
        System.out.println("Is palindrome: " + isPalindrome(palindromeArray2));
        
        // 11. MATRIX TRANSPOSE
        System.out.println("\n--- Matrix Transpose ---");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        int[][] transposed = transposeMatrix(matrix);
        System.out.println("Transposed Matrix:");
        printMatrix(transposed);
        
        // 12. ARRAY SHUFFLING
        System.out.println("\n--- Array Shuffling ---");
        int[] shuffleArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Original: ");
        printArray(shuffleArray);
        
        shuffleArray(shuffleArray);
        System.out.print("Shuffled: ");
        printArray(shuffleArray);
        
        scanner.close();
    }
    
    // Helper method to print array
    static void printArray(int[] arr) {
        if (arr.length == 0) {
            System.out.println("[]");
            return;
        }
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    // Helper method to print 2D array
    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
    
    // Convert array to string representation
    static String arrayToString(int[] arr) {
        if (arr.length == 0) return "[]";
        
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    // Check if two arrays are equal
    static boolean arraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    
    // Resize array to new size
    static int[] resizeArray(int[] arr, int newSize) {
        int[] newArray = new int[newSize];
        int copyLength = Math.min(arr.length, newSize);
        
        for (int i = 0; i < copyLength; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }
    
    // Remove all occurrences of an element
    static int[] removeElement(int[] arr, int element) {
        // Count elements to remove
        int count = 0;
        for (int value : arr) {
            if (value != element) {
                count++;
            }
        }
        
        // Create new array and copy elements
        int[] result = new int[count];
        int index = 0;
        for (int value : arr) {
            if (value != element) {
                result[index++] = value;
            }
        }
        return result;
    }
    
    // Insert element at specific position
    static int[] insertElement(int[] arr, int position, int element) {
        int[] result = new int[arr.length + 1];
        
        // Copy elements before insertion point
        for (int i = 0; i < position; i++) {
            result[i] = arr[i];
        }
        
        // Insert new element
        result[position] = element;
        
        // Copy remaining elements
        for (int i = position; i < arr.length; i++) {
            result[i + 1] = arr[i];
        }
        
        return result;
    }
    
    // Check if one array is subset of another
    static boolean isSubset(int[] mainArray, int[] subset) {
        for (int subsetElement : subset) {
            boolean found = false;
            for (int mainElement : mainArray) {
                if (subsetElement == mainElement) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }
    
    // Find intersection of two arrays
    static int[] findIntersection(int[] arr1, int[] arr2) {
        int[] temp = new int[Math.min(arr1.length, arr2.length)];
        int count = 0;
        
        for (int element1 : arr1) {
            for (int element2 : arr2) {
                if (element1 == element2) {
                    // Check if already added
                    boolean alreadyAdded = false;
                    for (int i = 0; i < count; i++) {
                        if (temp[i] == element1) {
                            alreadyAdded = true;
                            break;
                        }
                    }
                    if (!alreadyAdded) {
                        temp[count++] = element1;
                    }
                    break;
                }
            }
        }
        
        // Create result array with exact size
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        return result;
    }
    
    // Find union of two arrays
    static int[] findUnion(int[] arr1, int[] arr2) {
        int[] temp = new int[arr1.length + arr2.length];
        int count = 0;
        
        // Add all elements from first array
        for (int element : arr1) {
            temp[count++] = element;
        }
        
        // Add elements from second array if not already present
        for (int element : arr2) {
            boolean exists = false;
            for (int i = 0; i < count; i++) {
                if (temp[i] == element) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                temp[count++] = element;
            }
        }
        
        // Create result array with exact size
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        return result;
    }
    
    // Check if array is palindrome
    static boolean isPalindrome(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    // Transpose a square matrix
    static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
    
    // Simple array shuffle (Fisher-Yates algorithm)
    static void shuffleArray(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int randomIndex = (int) (Math.random() * (i + 1));
            
            // Swap elements
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
    }
}

// Save as ArrayUtilities.java
// To run: java ArrayUtilities.java
