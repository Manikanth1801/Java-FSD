package day2;
// Example 1: Instance Variable
// Each object has its own copy of instance variables
public class InstanceVariableDemo {
    int value = 10; // instance variable

    public static void main(String[] args) {
        InstanceVariableDemo obj1 = new InstanceVariableDemo();
        InstanceVariableDemo obj2 = new InstanceVariableDemo();
        obj2.value = 20; // change value for obj2 only
        System.out.println("obj1 value: " + obj1.value); // prints 10
        System.out.println("obj2 value: " + obj2.value); // prints 20
    }
}
/* difference b/w static and instance variable is that static 
variable is shared by all objects of the class whereas
 instance variable is unique to each object.*/

// Save as InstanceVariableDemo.java
// To run:
// 1. Compile: javac InstanceVariableDemo.java
// 2. Run: java InstanceVariableDemo
