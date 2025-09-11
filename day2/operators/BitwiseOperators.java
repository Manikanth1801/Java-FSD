// Bitwise Operators in Java
// Work on individual bits of integer numbers

public class BitwiseOperators {
    public static void main(String[] args) {
        // Initialize two numbers for bitwise operations
        int a = 12; // Binary: 1100
        int b = 10; // Binary: 1010
        
        System.out.println("Numbers: a = " + a + " (binary: " + Integer.toBinaryString(a) + ")");
        System.out.println("         b = " + b + " (binary: " + Integer.toBinaryString(b) + ")");
        System.out.println("--- Bitwise Operations ---");
        
        // Bitwise AND (&) - 1 only if both bits are 1
        int andResult = a & b;
        System.out.println(Integer.toBinaryString(a) + " & " + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(andResult));
        System.out.println("Bitwise AND: " + a + " & " + b + " = " + andResult + 
                          " (binary: " + Integer.toBinaryString(andResult) + ")");
        
        // Bitwise OR (|) - 1 if at least one bit is 1
        int orResult = a | b;
        System.out.println("Bitwise OR: " + a + " | " + b + " = " + orResult + 
                          " (binary: " + Integer.toBinaryString(orResult) + ")");
        
        // Bitwise XOR (^) - 1 if bits are different
        int xorResult = a ^ b;
        System.out.println("Bitwise XOR: " + a + " ^ " + b + " = " + xorResult + 
                          " (binary: " + Integer.toBinaryString(xorResult) + ")");
        
        // Bitwise NOT (~) - inverts all bits
        int notResult = ~a;
        System.out.println("Bitwise NOT: ~" + a + " = " + notResult);
        
        // Left shift (<<) - shifts bits to left
        System.out.println("\n--- Shift Operations ---");
        int leftShift = a << 2; // multiply by 2^2 = 4
        System.out.println("Left shift: " + a + " << 2 = " + leftShift + 
                          " (binary: " + Integer.toBinaryString(leftShift) + ")");
        
        // Right shift (>>) - shifts bits to right
        int rightShift = a >> 2; // divide by 2^2 = 4
        System.out.println("Right shift: " + a + " >> 2 = " + rightShift + 
                          " (binary: " + Integer.toBinaryString(rightShift) + ")");
        
        // Unsigned right shift (>>>) - fills with 0s
        int unsignedRightShift = a >>> 2;
        System.out.println("Unsigned right shift: " + a + " >>> 2 = " + unsignedRightShift +
                           " (binary: " + Integer.toBinaryString(unsignedRightShift) + ")");
        
        // Practical example: Checking even/odd using bitwise AND
        System.out.println("\n--- Practical Example ---");
        int number = 15;
        if ((number & 1) == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
        
        // Using bitwise operations for flags
        final int READ = 1;    // 001
        final int WRITE = 2;   // 010
        final int EXECUTE = 4; // 100
        
        int permissions = READ | WRITE; // Combine permissions
        System.out.println("\nPermissions example:");
        System.out.println("Has READ permission: " + ((permissions & READ) != 0));
        System.out.println("Has WRITE permission: " + ((permissions & WRITE) != 0));
        System.out.println("Has EXECUTE permission: " + ((permissions & EXECUTE) != 0));
    }
}

// Save as BitwiseOperators.java
// To run: java BitwiseOperators.java
