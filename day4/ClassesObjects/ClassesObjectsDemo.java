// Classes & Objects Demo - Understanding the Foundation of Java OOP
// This program demonstrates how to create classes and objects in Java
// Main class to demonstrate Classes and Objects
public class ClassesObjectsDemo {
    public static void main(String[] args) {
        System.out.println("=== CLASSES & OBJECTS DEMONSTRATION ===\n");
        
        // Creating objects (instances) of Student class
        // Object creation syntax: ClassName objectName = new ClassName();
        Student student1 = new Student();  // First student object
        Student student2 = new Student();  // Second student object
        Student student3 = new Student();  // Third student object
        
        // Setting values for first student object
        System.out.println("Setting data for Student 1...");
        student1.name = "Rajesh Kumar";
        student1.age = 20;
        student1.course = "Computer Science";
        student1.marks = 92.5;
        
        // Setting values for second student object
        System.out.println("Setting data for Student 2...");
        student2.name = "Priya Sharma";
        student2.age = 19;
        student2.course = "Information Technology";
        student2.marks = 78.0;
        
        // Setting values for third student object
        System.out.println("Setting data for Student 3...");
        student3.name = "Amit Singh";
        student3.age = 21;
        student3.course = "Electronics";
        student3.marks = 65.5;
        
        System.out.println("\n=== DISPLAYING STUDENT INFORMATION ===\n");
        
        // Calling methods on objects
        student1.displayInfo();
        student1.calculateGrade();
        if (student1.isEligibleForScholarship()) {
            System.out.println("🎉 Congratulations! Eligible for scholarship!\n");
        } else {
            System.out.println("Not eligible for scholarship this time.\n");
        }
        
        student2.displayInfo();
        student2.calculateGrade();
        if (student2.isEligibleForScholarship()) {
            System.out.println("🎉 Congratulations! Eligible for scholarship!\n");
        } else {
            System.out.println("Not eligible for scholarship this time.\n");
        }
        
        student3.displayInfo();
        student3.calculateGrade();
        if (student3.isEligibleForScholarship()) {
            System.out.println("🎉 Congratulations! Eligible for scholarship!\n");
        } else {
            System.out.println("Not eligible for scholarship this time.\n");
        }
        
        // Demonstrating that objects are independent
        System.out.println("=== DEMONSTRATING OBJECT INDEPENDENCE ===");
        System.out.println("Each object has its own copy of instance variables:");
        System.out.println("Student 1 name: " + student1.name);
        System.out.println("Student 2 name: " + student2.name);
        System.out.println("Student 3 name: " + student3.name);
        System.out.println("\nChanging student1's marks doesn't affect others:");
        student1.marks = 95.0;
        System.out.println("After changing student1's marks to 95:");
        System.out.println("Student 1 marks: " + student1.marks);
        System.out.println("Student 2 marks: " + student2.marks + " (unchanged)");
        System.out.println("Student 3 marks: " + student3.marks + " (unchanged)");
    }
}
// Class Definition - A blueprint for creating objects
class Student {
    // Instance variables (attributes/fields) - Data that each object will have
    String name;        // Student's name
    int age;           // Student's age
    String course;     // Student's course
    double marks;      // Student's marks
    
    // Instance method - Behavior that objects can perform
    void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks + "%");
        System.out.println("------------------------");
    }
    
    // Method to calculate grade based on marks
    void calculateGrade() {
        if (marks >= 90) {
            System.out.println("Grade: A+ (Excellent!)");
        } else if (marks >= 80) {
            System.out.println("Grade: A (Very Good!)");
        } else if (marks >= 70) {
            System.out.println("Grade: B (Good!)");
        } else if (marks >= 60) {
            System.out.println("Grade: C (Average)");
        } else {
            System.out.println("Grade: F (Need to work harder!)");
        }
    }
    
    // Method to check if student is eligible for scholarship
    boolean isEligibleForScholarship() {
        return marks >= 85;
    }
}



/*
=== DETAILED EXPLANATION OF CLASSES & OBJECTS ===

 WHAT HAPPENED IN THIS CODE:

1. CLASS DEFINITION:
   • We created a 'Student' class which serves as a blueprint
   • The class contains instance variables (name, age, course, marks)
   • The class contains methods (displayInfo, calculateGrade, isEligibleForScholarship)

2. OBJECT CREATION:
   • We created 3 different Student objects: student1, student2, student3
   • Each object is created using the 'new' keyword
   • Syntax: Student student1 = new Student();

3. SETTING OBJECT DATA:
   • We assigned different values to each object's instance variables
   • Each object has its own separate copy of the variables
   • student1.name is different from student2.name

4. CALLING METHODS:
   • We called methods on each object using dot notation
   • student1.displayInfo() displays information specific to student1
   • Methods can access the object's instance variables

5. OBJECT INDEPENDENCE:
   • Each object maintains its own state
   • Changing one object's data doesn't affect other objects
   • This demonstrates encapsulation at the object level

📚 KEY CONCEPTS LEARNED:

• Class: A blueprint or template for creating objects
• Object: An instance of a class with its own data and behavior
• Instance Variables: Data that belongs to each object individually
• Methods: Functions that define what objects can do
• Dot Notation: objectName.variableName or objectName.methodName()
• Object Independence: Each object has its own memory space

🎯 IMPORTANT POINTS FOR INDIAN STUDENTS:

• Think of a class like a form (जैसे admission form)
• Objects are like filled forms - each student fills their own details
• Each student (object) has their own name, age, marks (instance variables)
• All students can perform same actions like displayInfo (methods)
• Just like each student has separate mark sheets, each object has separate data

💡 REAL-WORLD ANALOGY:
• Class = Car blueprint/design
• Objects = Actual cars made from that blueprint
• Each car has its own color, speed, fuel level (instance variables)
• All cars can start, stop, accelerate (methods)

🔑 MEMORY CONCEPT:
• Class definition is stored once in memory
• Each object gets its own memory space for instance variables
• Methods are shared among all objects of the same class
*/
