// String Comparison in Java
// Different ways to compare strings and their use cases

public class StringComparison {
    public static void main(String[] args) {
        // Sample strings for comparison
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = "hello";
        String str5 = "World";
        String str6 = null;
        
        System.out.println("--- String References ---");
        System.out.println("str1: " + str1 + " (string literal)");
        System.out.println("str2: " + str2 + " (string literal)");
        System.out.println("str3: " + str3 + " (new String object)");
        System.out.println("str4: " + str4 + " (different case)");
        System.out.println("str5: " + str5 + " (different content)");
        System.out.println("str6: " + str6 + " (null reference)");
        
        // 1. == Operator - Reference Comparison
        System.out.println("\n--- == Operator (Reference Comparison) ---");
        System.out.println("str1 == str2: " + (str1 == str2)); // true - same reference in string pool
        System.out.println("str1 == str3: " + (str1 == str3)); // false - different objects
        System.out.println("str1 == str4: " + (str1 == str4)); // false - different content
        System.out.println("str1 == str5: " + (str1 == str5)); // false - different content
        
        // 2. equals() Method - Content Comparison
        System.out.println("\n--- equals() Method (Content Comparison) ---");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true
        System.out.println("str1.equals(str4): " + str1.equals(str4)); // false - case sensitive
        System.out.println("str1.equals(str5): " + str1.equals(str5)); // false
        
        // Safe null comparison
        System.out.println("\n--- Null-Safe Comparison ---");
        System.out.println("Using equals() safely:");
        System.out.println("\"Hello\".equals(str6): " + "Hello".equals(str6)); // Safe - no exception
        
        // This would throw NullPointerException:
        // System.out.println("str6.equals(str1): " + str6.equals(str1));
        
        // Using Objects.equals() for null-safe comparison
        System.out.println("null == null: " + (str6 == null));
        
        // 3. equalsIgnoreCase() - Case-Insensitive Comparison
        System.out.println("\n--- equalsIgnoreCase() Method ---");
        String upper = "HELLO";
        String lower = "hello";
        String mixed = "HeLLo";
        
        System.out.println("\"HELLO\".equalsIgnoreCase(\"hello\"): " + upper.equalsIgnoreCase(lower));
        System.out.println("\"hello\".equalsIgnoreCase(\"HeLLo\"): " + lower.equalsIgnoreCase(mixed));
        System.out.println("\"Hello\".equalsIgnoreCase(\"HELLO\"): " + str1.equalsIgnoreCase(upper));
        
        // 4. compareTo() Method - Lexicographic Comparison
        System.out.println("\n--- compareTo() Method ---");
        String word1 = "apple";
        String word2 = "banana";
        String word3 = "apple";
        String word4 = "Apple";
        
        System.out.println("Lexicographic comparison results:");
        System.out.println("\"apple\".compareTo(\"banana\"): " + word1.compareTo(word2)); // negative
        System.out.println("\"banana\".compareTo(\"apple\"): " + word2.compareTo(word1)); // positive
        System.out.println("\"apple\".compareTo(\"apple\"): " + word1.compareTo(word3)); // 0
        System.out.println("\"apple\".compareTo(\"Apple\"): " + word1.compareTo(word4)); // positive (lowercase > uppercase)
        
        // Understanding compareTo() results
        System.out.println("\nUnderstanding compareTo() results:");
        int result = word1.compareTo(word2);
        if (result < 0) {
            System.out.println("\"" + word1 + "\" comes before \"" + word2 + "\" alphabetically");
        } else if (result > 0) {
            System.out.println("\"" + word1 + "\" comes after \"" + word2 + "\" alphabetically");
        } else {
            System.out.println("\"" + word1 + "\" is equal to \"" + word2 + "\"");
        }
        
        // 5. compareToIgnoreCase() - Case-Insensitive Lexicographic Comparison
        System.out.println("\n--- compareToIgnoreCase() Method ---");
        System.out.println("\"apple\".compareToIgnoreCase(\"Apple\"): " + word1.compareToIgnoreCase(word4));
        System.out.println("\"Apple\".compareToIgnoreCase(\"banana\"): " + word4.compareToIgnoreCase(word2));
        
        // 6. startsWith() and endsWith() - Prefix/Suffix Comparison
        System.out.println("\n--- startsWith() and endsWith() Methods ---");
        String filename = "document.pdf";
        String url = "https://www.example.com";
        
        System.out.println("Filename: " + filename);
        System.out.println("Starts with 'doc': " + filename.startsWith("doc"));
        System.out.println("Starts with 'DOC': " + filename.startsWith("DOC")); // case sensitive
        System.out.println("Ends with '.pdf': " + filename.endsWith(".pdf"));
        System.out.println("Ends with '.txt': " + filename.endsWith(".txt"));
        
        System.out.println("\nURL: " + url);
        System.out.println("Starts with 'https': " + url.startsWith("https"));
        System.out.println("Ends with '.com': " + url.endsWith(".com"));
        
        // 7. matches() - Regular Expression Matching
        System.out.println("\n--- matches() Method (Regex) ---");
        String email1 = "user@example.com";
        String email2 = "invalid-email";
        String phone = "123-456-7890";
        
        // Simple email pattern (not comprehensive)
        String emailPattern = "\\w+@\\w+\\.\\w+";
        System.out.println("Email validation:");
        System.out.println(email1 + " matches email pattern: " + email1.matches(emailPattern));
        System.out.println(email2 + " matches email pattern: " + email2.matches(emailPattern));
        
        // Phone number pattern
        String phonePattern = "\\d{3}-\\d{3}-\\d{4}";
        System.out.println("\nPhone validation:");
        System.out.println(phone + " matches phone pattern: " + phone.matches(phonePattern));
        
        // 8. regionMatches() - Compare Regions of Strings
        System.out.println("\n--- regionMatches() Method ---");
        String text1 = "Java Programming";
        String text2 = "JavaScript";
        
        // Check if first 4 characters match
        boolean regionMatch = text1.regionMatches(0, text2, 0, 4);
        System.out.println("First 4 characters of \"" + text1 + "\" match \"" + text2 + "\": " + regionMatch);
        
        // Case-insensitive region matching
        boolean regionMatchIgnoreCase = text1.regionMatches(true, 0, "JAVA", 0, 4);
        System.out.println("Case-insensitive match with 'JAVA': " + regionMatchIgnoreCase);
        
        // 9. Practical Examples
        System.out.println("\n--- Practical Examples ---");
        
        // Password validation example
        String password = "MySecurePass123";
        System.out.println("Password validation for: " + password);
        System.out.println("Length >= 8: " + (password.length() >= 8));
        System.out.println("Contains uppercase: " + !password.equals(password.toLowerCase()));
        System.out.println("Contains lowercase: " + !password.equals(password.toUpperCase()));
        System.out.println("Contains digit: " + password.matches(".*\\d.*"));
        
        // File extension checker
        String[] files = {"image.jpg", "document.pdf", "program.java", "data.txt"};
        String[] allowedExtensions = {".jpg", ".png", ".pdf"};
        
        System.out.println("\nFile extension validation:");
        for (String file : files) {
            boolean allowed = false;
            for (String ext : allowedExtensions) {
                if (file.toLowerCase().endsWith(ext)) {
                    allowed = true;
                    break;
                }
            }
            System.out.println(file + " is " + (allowed ? "allowed" : "not allowed"));
        }
        
        // Sorting strings example
        System.out.println("\n--- String Sorting Example ---");
        String[] names = {"Charlie", "Alice", "Bob", "David"};
        
        System.out.println("Original order:");
        for (String name : names) {
            System.out.println("  " + name);
        }
        
        // Simple bubble sort using compareTo()
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 0; j < names.length - 1 - i; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    // Swap
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Sorted order:");
        for (String name : names) {
            System.out.println("  " + name);
        }
    }
}

// Save as StringComparison.java
// To run: java StringComparison.java
