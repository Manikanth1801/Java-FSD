// Array Algorithms and Operations in Java
// Common algorithms and operations performed on arrays

public class ArrayAlgorithms {
    public static void main(String[] args) {
        // Sample array for demonstrations
        int[] numbers = {64, 25, 12, 22, 11, 90, 88, 76, 50, 42};
        
        System.out.println("--- Original Array ---");
        printArray(numbers);
        
        // 1. BUBBLE SORT - Simple sorting algorithm
        System.out.println("\n--- Bubble Sort ---");
        int[] bubbleArray = numbers.clone(); // create a copy
        bubbleSort(bubbleArray);
        System.out.print("After Bubble Sort: ");
        printArray(bubbleArray);
        
        // 2. SELECTION SORT - Find minimum and swap
        System.out.println("\n--- Selection Sort ---");
        int[] selectionArray = numbers.clone();
        selectionSort(selectionArray);
        System.out.print("After Selection Sort: ");
        printArray(selectionArray);
        
        // 3. INSERTION SORT - Insert elements in correct position
        System.out.println("\n--- Insertion Sort ---");
        int[] insertionArray = numbers.clone();
        insertionSort(insertionArray);
        System.out.print("After Insertion Sort: ");
        printArray(insertionArray);
        
        // 4. LINEAR SEARCH - Search element one by one
        System.out.println("\n--- Linear Search ---");
        int searchValue = 22;
        int position = linearSearch(numbers, searchValue);
        if (position != -1) {
            System.out.println("Value " + searchValue + " found at index " + position);
        } else {
            System.out.println("Value " + searchValue + " not found");
        }
        
        // 5. BINARY SEARCH - Search in sorted array (faster)
        System.out.println("\n--- Binary Search ---");
        int[] sortedArray = {11, 12, 22, 25, 42, 50, 64, 76, 88, 90};
        System.out.print("Sorted Array: ");
        printArray(sortedArray);
        
        int binaryResult = binarySearch(sortedArray, searchValue);
        if (binaryResult != -1) {
            System.out.println("Value " + searchValue + " found at index " + binaryResult);
        } else {
            System.out.println("Value " + searchValue + " not found");
        }
        
        // 6. ARRAY REVERSAL
        System.out.println("\n--- Array Reversal ---");
        int[] reverseArray = numbers.clone();
        System.out.print("Before reversal: ");
        printArray(reverseArray);
        reverseArray(reverseArray);
        System.out.print("After reversal: ");
        printArray(reverseArray);
        
        // 7. ARRAY ROTATION
        System.out.println("\n--- Array Rotation ---");
        int[] rotateArray = {1, 2, 3, 4, 5, 6, 7};
        System.out.print("Original: ");
        printArray(rotateArray);
        
        rotateLeft(rotateArray, 3); // rotate left by 3 positions
        System.out.print("After rotating left by 3: ");
        printArray(rotateArray);
        
        // 8. FIND DUPLICATES
        System.out.println("\n--- Find Duplicates ---");
        int[] duplicateArray = {1, 2, 3, 2, 4, 5, 3, 6, 1};
        System.out.print("Array: ");
        printArray(duplicateArray);
        System.out.print("Duplicates found: ");
        findDuplicates(duplicateArray);
        
        // 9. MERGE TWO SORTED ARRAYS
        System.out.println("\n--- Merge Sorted Arrays ---");
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {2, 4, 6, 8, 10, 12};
        System.out.print("Array 1: ");
        printArray(array1);
        System.out.print("Array 2: ");
        printArray(array2);
        
        int[] mergedArray = mergeSortedArrays(array1, array2);
        System.out.print("Merged Array: ");
        printArray(mergedArray);
        
        // 10. STATISTICAL OPERATIONS
        System.out.println("\n--- Statistical Operations ---");
        int[] statsArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.print("Array: ");
        printArray(statsArray);
        
        System.out.println("Sum: " + calculateSum(statsArray));
        System.out.println("Average: " + calculateAverage(statsArray));
        System.out.println("Maximum: " + findMaximum(statsArray));
        System.out.println("Minimum: " + findMinimum(statsArray));
        System.out.println("Second Largest: " + findSecondLargest(statsArray));
        
        // 11. ARRAY FREQUENCY COUNT
        System.out.println("\n--- Frequency Count ---");
        int[] freqArray = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        System.out.print("Array: ");
        printArray(freqArray);
        countFrequency(freqArray);
    }
    
    // Helper method to print array
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    // BUBBLE SORT: Compare adjacent elements and swap if needed
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    // SELECTION SORT: Find minimum element and place at beginning
    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap minimum element with first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    // INSERTION SORT: Insert each element in its correct position
    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            // Move elements greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    
    // LINEAR SEARCH: Search element sequentially
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // return index if found
            }
        }
        return -1; // return -1 if not found
    }
    
    // BINARY SEARCH: Search in sorted array (divide and conquer)
    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    
    // REVERSE ARRAY: Reverse elements in place
    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    // ROTATE LEFT: Move elements to left by k positions
    static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // handle k > n
        
        // Store first k elements
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        
        // Shift remaining elements
        for (int i = 0; i < n - k; i++) {
            arr[i] = arr[i + k];
        }
        
        // Place stored elements at end
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
    }
    
    // FIND DUPLICATES: Find and print duplicate elements
    static void findDuplicates(int[] arr) {
        boolean foundDuplicate = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    foundDuplicate = true;
                    break; // avoid printing same duplicate multiple times
                }
            }
        }
        if (!foundDuplicate) {
            System.out.print("No duplicates");
        }
        System.out.println();
    }
    
    // MERGE SORTED ARRAYS: Combine two sorted arrays into one
    static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        
        // Compare and merge elements
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }
        
        // Copy remaining elements
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }
        
        return result;
    }
    
    // STATISTICAL OPERATIONS
    static int calculateSum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }
    
    static double calculateAverage(int[] arr) {
        return (double) calculateSum(arr) / arr.length;
    }
    
    static int findMaximum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    
    static int findSecondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    
    // FREQUENCY COUNT: Count occurrence of each element
    static void countFrequency(int[] arr) {
        boolean[] visited = new boolean[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        visited[j] = true;
                        count++;
                    }
                }
                System.out.println(arr[i] + " appears " + count + " time(s)");
            }
        }
    }
}

// Save as ArrayAlgorithms.java
// To run: java ArrayAlgorithms.java
