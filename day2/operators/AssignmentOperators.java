// Assignment Operators in Java
// Used to assign values to variables

public class AssignmentOperators {
    public static void main(String[] args) {
        // Simple assignment (=)
        int a = 10;
        System.out.println("Simple assignment: a = " + a);
        
        // Addition assignment (+=)
        a += 5; // equivalent to: a = a + 5
        System.out.println("After a += 5: a = " + a);
        
        // Subtraction assignment (-=)
        a -= 3; // equivalent to: a = a - 3
        System.out.println("After a -= 3: a = " + a);
        
        // Multiplication assignment (*=)
        a *= 2; // equivalent to: a = a * 2
        System.out.println("After a *= 2: a = " + a);
        
        // Division assignment (/=)
        a /= 4; // equivalent to: a = a / 4
        System.out.println("After a /= 4: a = " + a);
        
        // Modulus assignment (%=)
        a %= 3; // equivalent to: a = a % 3
        System.out.println("After a %= 3: a = " + a);
        
        // String concatenation assignment (+=)
        System.out.println("\n--- String Assignment ---");
        String name = "Java";
        System.out.println("Original string: " + name);
        
        name += " Programming"; // equivalent to: name = name + " Programming"
        System.out.println("After name += \" Programming\": " + name);
        
        // Multiple assignments
        System.out.println("\n--- Multiple Assignments ---");
        int x, y, z;
        x = y = z = 5; // assigns 5 to all three variables
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
        
        // Practical example
        System.out.println("\n--- Practical Example ---");
        int totalMarks = 0;
        totalMarks += 85; // First subject
        totalMarks += 90; // Second subject
        totalMarks += 78; // Third subject
        System.out.println("Total marks: " + totalMarks);
        
        double average = totalMarks;
        average /= 3; // Calculate average
        System.out.println("Average marks: " + average);
    }
}

// Save as AssignmentOperators.java
// To run: java AssignmentOperators.java
