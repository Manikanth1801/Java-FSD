// String Manipulation and Utilities in Java
// Advanced string operations and practical applications

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. String Concatenation Methods
        System.out.println("--- String Concatenation ---");
        String firstName = "John";
        String lastName = "Doe";
        
        // Method 1: Using + operator
        String fullName1 = firstName + " " + lastName;
        System.out.println("Using + operator: " + fullName1);
        
        // Method 2: Using concat() method
        String fullName2 = firstName.concat(" ").concat(lastName);
        System.out.println("Using concat(): " + fullName2);
        
        // Method 3: Using StringBuilder (efficient for multiple concatenations)
        StringBuilder sb = new StringBuilder();
        sb.append(firstName).append(" ").append(lastName);
        String fullName3 = sb.toString();
        System.out.println("Using StringBuilder: " + fullName3);
        
        // Method 4: Using String.join()
        String fullName4 = String.join(" ", firstName, lastName);
        System.out.println("Using String.join(): " + fullName4);
        
        // 2. String Splitting and Joining
        System.out.println("\n--- String Split and Join ---");
        String sentence = "Java is a powerful programming language";
        String[] words = sentence.split(" ");
        
        System.out.println("Original: " + sentence);
        System.out.println("Split into words:");
        for (int i = 0; i < words.length; i++) {
            System.out.println("  Word " + (i + 1) + ": " + words[i]);
        }
        
        // Join back with different separator
        String joined = String.join("-", words);
        System.out.println("Joined with '-': " + joined);
        
        // Split CSV data
        String csvData = "apple,banana,orange,grape,mango";
        String[] fruits = csvData.split(",");
        System.out.println("\nCSV data: " + csvData);
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println("  - " + fruit);
        }
        
        // 3. String Replacement Operations
        System.out.println("\n--- String Replacement ---");
        String text = "The quick brown fox jumps over the lazy dog";
        System.out.println("Original: " + text);
        
        // Replace single word
        String replaced1 = text.replace("fox", "cat");
        System.out.println("Replace 'fox' with 'cat': " + replaced1);
        
        // Replace all occurrences
        String text2 = "Java Java everywhere, Java is fun";
        String replaced2 = text2.replace("Java", "Python");
        System.out.println("Replace all 'Java': " + replaced2);
        
        // Replace first occurrence only
        String replaced3 = text2.replaceFirst("Java", "Python");
        System.out.println("Replace first 'Java': " + replaced3);
        
        // Replace using regex
        String phoneNumber = "123-456-7890";
        String cleanPhone = phoneNumber.replaceAll("[^\\d]", "");
        System.out.println("Phone: " + phoneNumber + " -> Clean: " + cleanPhone);
        
        // 4. String Case Conversion and Formatting
        System.out.println("\n--- Case Conversion ---");
        String mixedText = "jAvA pRoGrAmMiNg";
        System.out.println("Original: " + mixedText);
        System.out.println("Upper case: " + mixedText.toUpperCase());
        System.out.println("Lower case: " + mixedText.toLowerCase());
        
        // Title case (capitalize first letter of each word)
        String titleCase = toTitleCase(mixedText);
        System.out.println("Title case: " + titleCase);
        
        // 5. String Padding and Alignment
        System.out.println("\n--- String Padding ---");
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        System.out.println("Name alignment:");
        for (String name : names) {
            System.out.println(padRight(name, 10) + " | Length: " + name.length());
        }
        
        // 6. String Validation
        System.out.println("\n--- String Validation ---");
        String email = "user@example.com";
        String invalidEmail = "invalid.email";
        
        System.out.println("Email validation:");
        System.out.println(email + " is valid: " + isValidEmail(email));
        System.out.println(invalidEmail + " is valid: " + isValidEmail(invalidEmail));
        
        // Password strength check
        String[] passwords = {"weak", "StrongPass123", "PASSWORD", "Pass1"};
        System.out.println("\nPassword strength check:");
        for (String pass : passwords) {
            System.out.println("\"" + pass + "\" strength: " + getPasswordStrength(pass));
        }
        
        // 7. String Reversal
        System.out.println("\n--- String Reversal ---");
        String word = "Programming";
        String reversed = reverseString(word);
        System.out.println("Original: " + word);
        System.out.println("Reversed: " + reversed);
        
        // Check palindrome
        String[] testWords = {"madam", "hello", "racecar", "java"};
        System.out.println("\nPalindrome check:");
        for (String testWord : testWords) {
            System.out.println("\"" + testWord + "\" is palindrome: " + isPalindrome(testWord));
        }
        
        // 8. Character Frequency Count
        System.out.println("\n--- Character Frequency ---");
        String sample = "programming";
        System.out.println("Character frequency in \"" + sample + "\":");
        countCharacterFrequency(sample);
        
        // 9. String Searching and Pattern Matching
        System.out.println("\n--- String Searching ---");
        String document = "Java is object-oriented. Java is platform-independent. Java is robust.";
        String searchTerm = "Java";
        
        System.out.println("Document: " + document);
        System.out.println("Searching for: " + searchTerm);
        
        int[] positions = findAllOccurrences(document, searchTerm);
        System.out.println("Found at positions: ");
        for (int pos : positions) {
            System.out.print(pos + " ");
        }
        System.out.println("\nTotal occurrences: " + positions.length);
        
        // 10. String Formatting
        System.out.println("\n--- String Formatting ---");
        String name = "Alice";
        int age = 25;
        double salary = 50000.75;
        
        // Using String.format()
        String formatted = String.format("Name: %s, Age: %d, Salary: $%.2f", name, age, salary);
        System.out.println("Formatted: " + formatted);
        
        // Using printf-style formatting
        System.out.printf("Employee: %-10s | Age: %3d | Salary: $%,10.2f%n", name, age, salary);
        
        // 11. String Cleaning and Normalization
        System.out.println("\n--- String Cleaning ---");
        String dirtyText = "  Hello    World  \n\t Java   Programming  ";
        System.out.println("Dirty text: \"" + dirtyText + "\"");
        
        String cleaned = cleanText(dirtyText);
        System.out.println("Cleaned text: \"" + cleaned + "\"");
        
        // 12. Interactive String Operations
        System.out.println("\n--- Interactive Demo ---");
        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();
        
        System.out.println("\nAnalysis of your input:");
        System.out.println("Length: " + userInput.length());
        System.out.println("Word count: " + countWords(userInput));
        System.out.println("Uppercase letters: " + countUppercase(userInput));
        System.out.println("Lowercase letters: " + countLowercase(userInput));
        System.out.println("Digits: " + countDigits(userInput));
        System.out.println("First word: " + getFirstWord(userInput));
        System.out.println("Last word: " + getLastWord(userInput));
        
        scanner.close();
    }
    
    // Helper method: Convert to title case
    static String toTitleCase(String input) {
        String[] words = input.toLowerCase().split("\\s+");
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                result.append(Character.toUpperCase(words[i].charAt(0)))
                      .append(words[i].substring(1));
                if (i < words.length - 1) {
                    result.append(" ");
                }
            }
        }
        return result.toString();
    }
    
    // Helper method: Pad string to right
    static String padRight(String str, int length) {
        return String.format("%-" + length + "s", str);
    }
    
    // Helper method: Simple email validation
    static boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.contains(".") 
               && email.indexOf("@") > 0 && email.lastIndexOf(".") > email.indexOf("@");
    }
    
    // Helper method: Password strength check
    static String getPasswordStrength(String password) {
        if (password.length() < 6) return "Very Weak";
        
        boolean hasUpper = !password.equals(password.toLowerCase());
        boolean hasLower = !password.equals(password.toUpperCase());
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSpecial = password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*");
        
        int score = 0;
        if (hasUpper) score++;
        if (hasLower) score++;
        if (hasDigit) score++;
        if (hasSpecial) score++;
        
        switch (score) {
            case 0: case 1: return "Weak";
            case 2: return "Fair";
            case 3: return "Good";
            case 4: return "Strong";
            default: return "Unknown";
        }
    }
    
    // Helper method: Reverse string
    static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    
    // Helper method: Check palindrome
    static boolean isPalindrome(String str) {
        String cleaned = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        return cleaned.equals(reverseString(cleaned));
    }
    
    // Helper method: Count character frequency
    static void countCharacterFrequency(String str) {
        int[] freq = new int[256]; // ASCII characters
        
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println("'" + (char)i + "': " + freq[i]);
            }
        }
    }
    
    // Helper method: Find all occurrences
    static int[] findAllOccurrences(String text, String pattern) {
        java.util.List<Integer> positions = new java.util.ArrayList<>();
        int index = text.indexOf(pattern);
        
        while (index != -1) {
            positions.add(index);
            index = text.indexOf(pattern, index + 1);
        }
        
        return positions.stream().mapToInt(i -> i).toArray();
    }
    
    // Helper method: Clean text
    static String cleanText(String text) {
        return text.trim().replaceAll("\\s+", " ");
    }
    
    // Helper method: Count words
    static int countWords(String text) {
        if (text == null || text.trim().isEmpty()) return 0;
        return text.trim().split("\\s+").length;
    }
    
    // Helper method: Count uppercase letters
    static int countUppercase(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) count++;
        }
        return count;
    }
    
    // Helper method: Count lowercase letters
    static int countLowercase(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (Character.isLowerCase(c)) count++;
        }
        return count;
    }
    
    // Helper method: Count digits
    static int countDigits(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) count++;
        }
        return count;
    }
    
    // Helper method: Get first word
    static String getFirstWord(String text) {
        String[] words = text.trim().split("\\s+");
        return words.length > 0 ? words[0] : "";
    }
    
    // Helper method: Get last word
    static String getLastWord(String text) {
        String[] words = text.trim().split("\\s+");
        return words.length > 0 ? words[words.length - 1] : "";
    }
}

// Save as StringManipulation.java
// To run: java StringManipulation.java
