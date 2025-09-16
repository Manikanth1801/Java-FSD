/*
 * File Order: 4
 * Intent: Demonstrate how packages help organize code by using classes from different packages
 * 
 * This file shows:
 * - How to import classes from custom packages
 * - Using classes from utilities and models packages
 * - Benefits of code organization through packages
 * 
 * Key Learning Points:
 * 1. Import statements bring classes from other packages into scope
 * 2. Packages help organize related functionality
 * 3. Well-organized code is easier to maintain and understand
 */

// Import statements to use classes from our custom packages
import models.Student;  // Import Calculator from utilities package
import utilities.Calculator;        // Import Student from models package

/**
 * OrganizationDemo class demonstrates the benefits of organizing code using packages
 * Shows how to use classes from different packages together
 */
public class OrganizationDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Package Organization Demo ===");
        System.out.println("Demonstrating how packages help organize code\n");
        
        // Using Calculator class from utilities package
        System.out.println("1. Using Calculator from 'utilities' package:");
        System.out.println(Calculator.getInfo());
        
        // Perform some calculations
        int result1 = Calculator.add(10, 5);
        int result2 = Calculator.subtract(20, 8);
        int result3 = Calculator.multiply(6, 7);
        double result4 = Calculator.divide(15, 3);
        
        System.out.println("Addition result: " + result1);
        System.out.println("Subtraction result: " + result2);
        System.out.println("Multiplication result: " + result3);
        System.out.println("Division result: " + result4);
        
        System.out.println("\n" + "=".repeat(40));
        
        // Using Student class from models package
        System.out.println("2. Using Student from 'models' package:");
        
        // Create student objects using different constructors
        Student student1 = new Student(); // Default constructor
        Student student2 = new Student("Alice Johnson", 20, "STU001", "Computer Science");
        
        // Display default student
        System.out.println("Default student:");
        student1.displayInfo();
        
        // Modify default student using setter methods
        student1.setName("Bob Smith");
        student1.setAge(19);
        student1.setStudentId("STU002");
        student1.setCourse("Mathematics");
        
        System.out.println("Modified student:");
        student1.displayInfo();
        
        // Display parameterized student
        System.out.println("Parameterized student:");
        student2.displayInfo();
        
        System.out.println("\n" + "=".repeat(40));
        
        // Demonstrate practical usage combining both packages
        System.out.println("3. Practical Example - Grade Calculator:");
        
        // Calculate average grade for a student
        int exam1 = 85;
        int exam2 = 92;
        int exam3 = 78;
        
        System.out.println("Student: " + student2.getName());
        System.out.println("Exam 1: " + exam1);
        System.out.println("Exam 2: " + exam2);
        System.out.println("Exam 3: " + exam3);
        
        // Use Calculator to compute total and average
        int total = Calculator.add(Calculator.add(exam1, exam2), exam3);
        double average = Calculator.divide(total, 3);
        
        System.out.println("Total marks: " + total);
        System.out.println("Average: " + String.format("%.2f", average));
        
        System.out.println("\n=== Benefits of Package Organization ===");
        System.out.println("✓ Related classes are grouped together");
        System.out.println("✓ Code is easier to find and maintain");
        System.out.println("✓ Prevents naming conflicts");
        System.out.println("✓ Promotes reusability");
        System.out.println("✓ Makes large projects manageable");
        
        System.out.println("\n=== Demo Complete ===");
    }
}
