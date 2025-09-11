// String Basics in Java
// Strings are objects that represent sequences of characters

public class StringBasics {
    public static void main(String[] args) {
        // String Creation Methods
        System.out.println("--- String Creation ---");
        
        // Method 1: String literal (most common)
        String str1 = "Hello World";
        
        // Method 2: Using new keyword
        String str2 = new String("Hello World");
        
        // Method 3: From character array
        char[] charArray = {'J', 'a', 'v', 'a'};
        String str3 = new String(charArray);
        
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);
        
        // String Length
        System.out.println("\n--- String Length ---");
        String message = "Java Programming";
        System.out.println("String: \"" + message + "\"");
        System.out.println("Length: " + message.length()); // returns 16
        
        // Character Access
        System.out.println("\n--- Character Access ---");
        System.out.println("First character: " + message.charAt(0)); // J
        System.out.println("Last character: " + message.charAt(message.length() - 1)); // g
        System.out.println("Character at index 5: " + message.charAt(5)); // P
        
        // String Indexing Examples
        System.out.println("\n--- String Indexing ---");
        String word = "Programming";
        System.out.println("String: " + word);
        for (int i = 0; i < word.length(); i++) {
            System.out.println("Index " + i + ": " + word.charAt(i));
        }
        
        // String Immutability Demonstration
        System.out.println("\n--- String Immutability ---");
        String original = "Java";
        System.out.println("Original string: " + original);
        
        String modified = original.concat(" Programming");
        System.out.println("After concat operation:");
        System.out.println("Original: " + original); // Still "Java"
        System.out.println("Modified: " + modified); // "Java Programming"
        System.out.println("Original string remains unchanged - this shows immutability");
        
        // String Pool Concept
        System.out.println("\n--- String Pool ---");
        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");
        
        System.out.println("a == b: " + (a == b)); // true (same reference in pool)
        System.out.println("a == c: " + (a == c)); // false (different objects)
        System.out.println("a.equals(c): " + a.equals(c)); // true (same content)
        
        // Empty and Null Strings
        System.out.println("\n--- Empty and Null Strings ---");
        String emptyString = "";
        String nullString = null;
        String spaceString = " ";
        
        System.out.println("Empty string length: " + emptyString.length());
        System.out.println("Empty string is empty: " + emptyString.isEmpty());
        System.out.println("Space string is empty: " + spaceString.isEmpty());
        System.out.println("Space string is blank: " + spaceString.isBlank()); // Java 11+
        
        // Null check is important to avoid NullPointerException
        if (nullString == null) {
            System.out.println("Null string is null");
        } else {
            System.out.println("Null string length: " + nullString.length());
        }
        
        // String Conversion from other types
        System.out.println("\n--- String Conversion ---");
        int number = 123;
        double price = 99.99;
        boolean flag = true;
        char character = 'A';
        
        String numStr = String.valueOf(number);
        String priceStr = String.valueOf(price);
        String flagStr = String.valueOf(flag);
        String charStr = String.valueOf(character);
        
        System.out.println("Number to string: " + numStr);
        System.out.println("Price to string: " + priceStr);
        System.out.println("Boolean to string: " + flagStr);
        System.out.println("Character to string: " + charStr);
        
        // Alternative conversion methods
        String numStr2 = Integer.toString(number);
        String priceStr2 = Double.toString(price);
        System.out.println("Alternative number conversion: " + numStr2);
        System.out.println("Alternative price conversion: " + priceStr2);
        
        // String concatenation with different types
        System.out.println("\n--- String Concatenation with Numbers ---");
        String result = "The price is $" + price + " for " + number + " items";
        System.out.println(result);
        
        // Escape sequences in strings
        System.out.println("\n--- Escape Sequences ---");
        System.out.println("Newline example:\nSecond line");
        System.out.println("Tab example:\tTabbed text");
        System.out.println("Quote example: \"Hello World\"");
        System.out.println("Backslash example: C:\\Program Files\\Java");
        System.out.println("Unicode example: \u0041"); // Prints 'A'
        
        // Multi-line strings (Text Blocks - Java 15+)
        System.out.println("\n--- Multi-line Text ---");
        String multiLine = "Line 1\n" +
                          "Line 2\n" +
                          "Line 3";
        System.out.println(multiLine);
    }
}

// Save as StringBasics.java
// To run: java StringBasics.java
