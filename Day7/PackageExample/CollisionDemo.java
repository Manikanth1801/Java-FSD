/*
 * File Order: 6
 * Intent: Demonstrate how packages prevent name collisions between custom and built-in classes
 * 
 * This file shows:
 * - Using both java.util.List and our custom mypackage.List in the same program
 * - How packages distinguish between classes with the same name
 * - Practical example of name collision avoidance
 * 
 * Key Learning Points:
 * 1. Packages allow classes with identical names to coexist
 * 2. Full package names (Fully Qualified Names) prevent conflicts
 * 3. Import statements bring specific classes into scope
 * 4. This is crucial for large projects with many developers
 */

// Import statements for both List classes
import java.util.List;        // Java's built-in List interface
import java.util.ArrayList;   // Java's ArrayList implementation
import mypackage.List;        // Our custom List class

/**
 * CollisionDemo class demonstrates how packages prevent naming conflicts
 * Shows usage of both Java's List and our custom List in the same program
 */
public class CollisionDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Name Collision Avoidance Demo ===");
        System.out.println("Using both Java's List and our custom List\n");
        
        // Section 1: Using Java's built-in List
        System.out.println("1. Using Java's built-in List (java.util.List):");
        System.out.println("   - This is an interface from Java's standard library");
        System.out.println("   - We'll use ArrayList as the implementation\n");
        
        // Create Java's List using ArrayList implementation
        List<String> javaList = new ArrayList<>();
        
        // Add items to Java's List
        javaList.add("Apple");
        javaList.add("Banana");
        javaList.add("Cherry");
        
        System.out.println("Java List contents:");
        for (int i = 0; i < javaList.size(); i++) {
            System.out.println("  [" + i + "] " + javaList.get(i));
        }
        System.out.println("Java List size: " + javaList.size());
        
        System.out.println("\n" + "=".repeat(50));
        
        // Section 2: Using our custom List
        System.out.println("2. Using our custom List (mypackage.List):");
        System.out.println("   - This is our own implementation");
        System.out.println("   - Same class name but different package\n");
        
        // Create our custom List
        mypackage.List customList = new mypackage.List(5);
        
        // Add items to our custom List
        customList.add("Dog");
        customList.add("Cat");
        customList.add("Bird");
        
        // Display our custom List
        customList.display();
        
        System.out.println("\n" + "=".repeat(50));
        
        // Section 3: Demonstrating the difference
        System.out.println("3. Key Differences and Benefits:");
        
        System.out.println("\nJava's List Features:");
        System.out.println("  ✓ Interface with multiple implementations");
        System.out.println("  ✓ Generic support (List<String>, List<Integer>, etc.)");
        System.out.println("  ✓ Part of Collections Framework");
        System.out.println("  ✓ Rich set of methods and features");
        
        System.out.println("\nOur Custom List Features:");
        System.out.println("  ✓ Simple array-based implementation");
        System.out.println("  ✓ Custom behavior and methods");
        System.out.println("  ✓ Educational/learning purpose");
        System.out.println("  ✓ Demonstrates basic data structure concepts");
        
        System.out.println("\n" + "=".repeat(50));
        
        // Section 4: Avoiding confusion with Fully Qualified Names
        System.out.println("4. Using Fully Qualified Names (Alternative approach):");
        System.out.println("   - Instead of import statements, use full package names");
        
        // Create instances using fully qualified names (no import needed)
        java.util.List<String> fullyQualifiedJavaList = new java.util.ArrayList<>();
        mypackage.List fullyQualifiedCustomList = new mypackage.List();
        
        fullyQualifiedJavaList.add("Fully Qualified Java List Item");
        fullyQualifiedCustomList.add("Fully Qualified Custom List Item");
        
        System.out.println("Fully qualified Java List: " + fullyQualifiedJavaList.get(0));
        System.out.println("Fully qualified Custom List: " + fullyQualifiedCustomList.get(0));
        
        System.out.println("\n=== Benefits of Package-based Name Collision Avoidance ===");
        System.out.println("✓ Multiple classes can have the same name");
        System.out.println("✓ No conflicts between different libraries");
        System.out.println("✓ Clear organization and namespace separation");
        System.out.println("✓ Enables large-scale software development");
        System.out.println("✓ Multiple teams can work without naming conflicts");
        
        System.out.println("\n=== Demo Complete ===");
        System.out.println("Packages successfully prevented name collisions!");
    }
}
