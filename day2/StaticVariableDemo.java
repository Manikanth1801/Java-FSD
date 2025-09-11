package day2;
// Example 2: Static Variable
// Shared by all objects of the class
public class StaticVariableDemo {
    static int count = 0; // static variable

    StaticVariableDemo() {
        count++; // increases for every object created
    }

    public static void main(String[] args) {
        StaticVariableDemo obj1 = new StaticVariableDemo();
        StaticVariableDemo obj2 = new StaticVariableDemo();
        StaticVariableDemo obj3 = new StaticVariableDemo();
        // obj1.count = 10; // change count using obj1
        System.out.println("Total objects created: " + StaticVariableDemo.count); // prints 3
        
        // This would cause a compilation error - cannot access static variable from non-static context
        // System.out.println("Count: " + this.count); // Error: non-static variable this cannot be referenced from a static context
    }
}

// Save as StaticVariableDemo.java
// To run:
// 1. Compile: javac StaticVariableDemo.java
// 2. Run: java StaticVariableDemo
