// Logical Operators in Java
// Used to combine multiple boolean expressions

public class LogicalOperators {
    public static void main(String[] args) {
        // Initialize boolean variables
        boolean x = true;
        boolean y = false;
        boolean z = true;
        
        System.out.println("Boolean values: x = " + x + ", y = " + y + ", z = " + z);
        System.out.println("--- Logical Operations ---");
        
        // Logical AND (&&) - true only if both operands are true
        boolean andResult = x && z;
        System.out.println("Logical AND: " + x + " && " + z + " = " + andResult);
        
        boolean andResult2 = x && y;
        System.out.println("Logical AND: " + x + " && " + y + " = " + andResult2);
        
        // Logical OR (||) - true if at least one operand is true
        boolean orResult = x || y;
        System.out.println("Logical OR: " + x + " || " + y + " = " + orResult);
        
        boolean orResult2 = y || false;
        System.out.println("Logical OR: " + y + " || false = " + orResult2);
        
        // Logical NOT (!) - reverses the boolean value
        boolean notResult = !x;
        System.out.println("Logical NOT: !" + x + " = " + notResult);
        
        boolean notResult2 = !y;
        System.out.println("Logical NOT: !" + y + " = " + notResult2);
        
        // Practical example with conditions
        System.out.println("\n--- Practical Example ---");
        int age = 20;
        boolean hasLicense = true;
        boolean canDrive = (age >= 18) && hasLicense;
        System.out.println("Age: " + age + ", Has License: " + hasLicense);
        System.out.println("Can drive? " + canDrive);
        
        // Complex logical expression
        int marks = 85;
        boolean isPass = (marks >= 35) && ((marks >= 80) || (marks >= 60));
        System.out.println("Marks: " + marks + ", Pass? " + isPass);
    }
}

// Save as LogicalOperators.java
// To run: java LogicalOperators.java
