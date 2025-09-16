/*
 * Order: 2
 * Topic: String Utility Functions
 * Description: Another utility class showing how multiple classes 
 *              can exist in the same package
 */

// This class also belongs to the utils package
package utils;

/**
 * StringHelper - A utility class for common string operations
 * Demonstrates having multiple classes in the same package
 */
public class StringHelper {
    
    /**
     * Reverses a given string
     * @param str input string
     * @return reversed string
     */
    public static String reverse(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        
        System.out.println("StringHelper.reverse() called with: " + str);
        
        // Simple way to reverse a string
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        
        System.out.println("Result: " + reversed);
        return reversed;
    }
    
    /**
     * Counts the number of words in a string
     * @param str input string
     * @return number of words
     */
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        
        System.out.println("StringHelper.countWords() called with: " + str);
        
        // Split by spaces and count
        String[] words = str.trim().split("\\s+");
        int count = words.length;
        
        System.out.println("Word count: " + count);
        return count;
    }
    
    /**
     * Converts string to uppercase
     * @param str input string
     * @return uppercase string
     */
    public static String toUpperCase(String str) {
        if (str == null) {
            return null;
        }
        
        System.out.println("StringHelper.toUpperCase() called with: " + str);
        String result = str.toUpperCase();
        System.out.println("Result: " + result);
        return result;
    }
}
