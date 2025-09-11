// String Methods in Java
// Comprehensive demonstration of important String methods

public class StringMethods {
    public static void main(String[] args) {
        // Sample strings for demonstration
        String text = "Java Programming Language";
        String name = "Alice";
        String email = "alice@example.com";
        String sentence = "  Hello World  ";
        
        // 1. length() - Returns the length of string
        System.out.println("--- length() Method ---");
        System.out.println("Text: \"" + text + "\"");
        System.out.println("Length: " + text.length());
        System.out.println("Empty string length: " + "".length());
        
        // 2. charAt() - Returns character at specified index
        System.out.println("\n--- charAt() Method ---");
        System.out.println("Character at index 0: " + text.charAt(0)); // J
        System.out.println("Character at index 5: " + text.charAt(5)); // P
        System.out.println("Last character: " + text.charAt(text.length() - 1)); // e
        
        // 3. substring() - Extracts part of string
        System.out.println("\n--- substring() Method ---");
        System.out.println("Original: " + text);
        System.out.println("substring(5): " + text.substring(5)); // "Programming Language"
        System.out.println("substring(5, 16): " + text.substring(5, 16)); // "Programming"
        System.out.println("substring(0, 4): " + text.substring(0, 4)); // "Java"
        
        // 4. indexOf() and lastIndexOf() - Find position of character/substring
        System.out.println("\n--- indexOf() and lastIndexOf() Methods ---");
        System.out.println("Text: " + text);
        System.out.println("indexOf('a'): " + text.indexOf('a')); // First 'a' at index 1
        System.out.println("lastIndexOf('a'): " + text.lastIndexOf('a')); // Last 'a' at index 21
        System.out.println("indexOf('Programming'): " + text.indexOf("Programming")); // 5
        System.out.println("indexOf('Python'): " + text.indexOf("Python")); // -1 (not found)
        
        // 5. contains() - Check if string contains substring
        System.out.println("\n--- contains() Method ---");
        System.out.println("Contains 'Java': " + text.contains("Java")); // true
        System.out.println("Contains 'Python': " + text.contains("Python")); // false
        System.out.println("Contains 'JAVA': " + text.contains("JAVA")); // false (case sensitive)
        
        // 6. equals() and equalsIgnoreCase() - Compare strings
        System.out.println("\n--- equals() and equalsIgnoreCase() Methods ---");
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "Hello";
        
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // false
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true
        System.out.println("str1.equalsIgnoreCase(str2): " + str1.equalsIgnoreCase(str2)); // true
        
        // 7. compareTo() - Compare strings lexicographically
        System.out.println("\n--- compareTo() Method ---");
        String word1 = "apple";
        String word2 = "banana";
        String word3 = "apple";
        
        System.out.println("apple.compareTo(banana): " + word1.compareTo(word2)); // negative
        System.out.println("banana.compareTo(apple): " + word2.compareTo(word1)); // positive
        System.out.println("apple.compareTo(apple): " + word1.compareTo(word3)); // 0
        
        // 8. startsWith() and endsWith()
        System.out.println("\n--- startsWith() and endsWith() Methods ---");
        String filename = "document.pdf";
        System.out.println("Filename: " + filename);
        System.out.println("Starts with 'doc': " + filename.startsWith("doc")); // true
        System.out.println("Ends with '.pdf': " + filename.endsWith(".pdf")); // true
        System.out.println("Ends with '.txt': " + filename.endsWith(".txt")); // false
        
        // 9. toUpperCase() and toLowerCase()
        System.out.println("\n--- toUpperCase() and toLowerCase() Methods ---");
        String mixedCase = "Java Programming";
        System.out.println("Original: " + mixedCase);
        System.out.println("Upper case: " + mixedCase.toUpperCase());
        System.out.println("Lower case: " + mixedCase.toLowerCase());
        
        // 10. trim() - Remove leading and trailing spaces
        System.out.println("\n--- trim() Method ---");
        System.out.println("Original with spaces: \"" + sentence + "\"");
        System.out.println("After trim: \"" + sentence.trim() + "\"");
        System.out.println("Original length: " + sentence.length());
        System.out.println("Trimmed length: " + sentence.trim().length());
        
        // 11. replace() - Replace characters or substrings
        System.out.println("\n--- replace() Method ---");
        String phrase = "Java is fun, Java is powerful";
        System.out.println("Original: " + phrase);
        System.out.println("Replace 'Java' with 'Python': " + phrase.replace("Java", "Python"));
        System.out.println("Replace 'a' with '@': " + phrase.replace('a', '@'));
        
        // 12. replaceFirst() and replaceAll()
        System.out.println("\n--- replaceFirst() and replaceAll() Methods ---");
        String text2 = "cat and dog and cat";
        System.out.println("Original: " + text2);
        System.out.println("Replace first 'cat': " + text2.replaceFirst("cat", "bird"));
        System.out.println("Replace all 'and': " + text2.replaceAll("and", "or"));
        
        // 13. split() - Split string into array
        System.out.println("\n--- split() Method ---");
        String csvData = "apple,banana,orange,grape";
        String[] fruits = csvData.split(",");
        System.out.println("Original: " + csvData);
        System.out.println("After split:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("  [" + i + "]: " + fruits[i]);
        }
        
        // Split with multiple delimiters
        String sentence2 = "Java is great! Python is also good.";
        String[] words = sentence2.split("[ !.]"); // Split by space, !, or .
        System.out.println("\nSplit by multiple delimiters:");
        for (String word : words) {
            if (!word.isEmpty()) { // Skip empty strings
                System.out.println("  " + word);
            }
        }
        
        // 14. concat() - Concatenate strings
        System.out.println("\n--- concat() Method ---");
        String first = "Hello";
        String second = " World";
        String result = first.concat(second);
        System.out.println("first.concat(second): " + result);
        
        // Multiple concatenations
        String greeting = "Hello".concat(" ").concat("Java").concat(" World");
        System.out.println("Multiple concat: " + greeting);
        
        // 15. isEmpty() and isBlank()
        System.out.println("\n--- isEmpty() and isBlank() Methods ---");
        String empty = "";
        String spaces = "   ";
        String content = "Hello";
        
        System.out.println("Empty string isEmpty(): " + empty.isEmpty());
        System.out.println("Spaces string isEmpty(): " + spaces.isEmpty());
        System.out.println("Spaces string isBlank(): " + spaces.isBlank());
        System.out.println("Content string isEmpty(): " + content.isEmpty());
        
        // 16. intern() - String interning
        System.out.println("\n--- intern() Method ---");
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        String s3 = s1.intern();
        String s4 = "Hello";
        
        System.out.println("s1 == s2: " + (s1 == s2)); // false
        System.out.println("s3 == s4: " + (s3 == s4)); // true (both from string pool)
        
        // 17. valueOf() - Convert other types to string
        System.out.println("\n--- valueOf() Method ---");
        int num = 42;
        double pi = 3.14159;
        boolean flag = true;
        char ch = 'X';
        
        System.out.println("String.valueOf(42): " + String.valueOf(num));
        System.out.println("String.valueOf(3.14159): " + String.valueOf(pi));
        System.out.println("String.valueOf(true): " + String.valueOf(flag));
        System.out.println("String.valueOf('X'): " + String.valueOf(ch));
        
        // 18. format() - Formatted strings
        System.out.println("\n--- format() Method ---");
        String formatted = String.format("Name: %s, Age: %d, Score: %.2f", 
                                        "John", 25, 87.456);
        System.out.println("Formatted string: " + formatted);
        
        // 19. Method chaining
        System.out.println("\n--- Method Chaining ---");
        String input = "  JAVA programming is FUN  ";
        String processed = input.trim()
                               .toLowerCase()
                               .replace("java", "python")
                               .substring(0, 20);
        System.out.println("Original: \"" + input + "\"");
        System.out.println("Processed: \"" + processed + "\"");
    }
}

// Save as StringMethods.java
// To run: java StringMethods.java
