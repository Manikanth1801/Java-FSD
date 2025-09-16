/*
 * Order: 3
 * Topic: Model Classes in Packages
 * Description: This file demonstrates how to create model classes
 *              that represent real-world entities in a package
 */

// This class belongs to the models package
package models;

/**
 * Student - A simple model class representing a student
 * Demonstrates how to organize related classes in packages
 */
public class Student {
    
    // Private fields (encapsulation)
    private String name;
    private int age;
    private String studentId;
    private String course;
    
    /**
     * Constructor to create a new Student
     * @param name student's name
     * @param age student's age
     * @param studentId unique student identifier
     * @param course course the student is enrolled in
     */
    public Student(String name, int age, String studentId, String course) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.course = course;
        System.out.println("New Student created: " + name);
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getStudentId() {
        return studentId;
    }
    
    public String getCourse() {
        return course;
    }
    
    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setCourse(String course) {
        this.course = course;
    }
    
    /**
     * Display student information
     */
    public void displayInfo() {
        System.out.println("=== Student Information ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
        System.out.println("==========================");
    }
    
    /**
     * Method to simulate student studying
     */
    public void study() {
        System.out.println(name + " is studying " + course);
    }
    
    /**
     * Override toString method for easy printing
     */
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + 
               ", studentId='" + studentId + "', course='" + course + "'}";
    }
}
