/*
 * File Order: 3
 * Intent: Simple Student model class to demonstrate organizing data models in packages
 * 
 * This file shows:
 * - How to create a model class in a custom package (models)
 * - Encapsulation with private fields and public methods
 * - Constructor usage for object initialization
 * 
 * Key Learning Points:
 * 1. Model classes typically represent data entities
 * 2. Package organization helps group related classes
 * 3. Encapsulation protects data integrity
 */

package models; // Package declaration for models package

/**
 * Student class represents a student entity with basic information
 * This demonstrates how to organize model classes in packages
 */
public class Student {
    
    // Private fields to demonstrate encapsulation
    private String name;
    private int age;
    private String studentId;
    private String course;
    
    /**
     * Default constructor
     */
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.studentId = "N/A";
        this.course = "Not Assigned";
    }
    
    /**
     * Parameterized constructor to initialize student with values
     * @param name Student's name
     * @param age Student's age
     * @param studentId Student's ID
     * @param course Student's course
     */
    public Student(String name, int age, String studentId, String course) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.course = course;
    }
    
    // Getter methods (public access to private fields)
    
    /**
     * Gets the student's name
     * @return Student's name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Gets the student's age
     * @return Student's age
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Gets the student's ID
     * @return Student's ID
     */
    public String getStudentId() {
        return studentId;
    }
    
    /**
     * Gets the student's course
     * @return Student's course
     */
    public String getCourse() {
        return course;
    }
    
    // Setter methods (controlled access to modify private fields)
    
    /**
     * Sets the student's name
     * @param name New name for the student
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Sets the student's age with validation
     * @param age New age for the student
     */
    public void setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        } else {
            System.out.println("Invalid age! Age should be between 1 and 149.");
        }
    }
    
    /**
     * Sets the student's ID
     * @param studentId New student ID
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    /**
     * Sets the student's course
     * @param course New course for the student
     */
    public void setCourse(String course) {
        this.course = course;
    }
    
    /**
     * Returns a string representation of the student
     * @return Formatted string with student information
     */
    @Override
    public String toString() {
        return "Student [Name: " + name + ", Age: " + age + 
               ", ID: " + studentId + ", Course: " + course + "]";
    }
    
    /**
     * Displays student information in a formatted way
     */
    public void displayInfo() {
        System.out.println("=== Student Information ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
        System.out.println("========================");
    }
}
