/*
 * Intent: Demonstrate the use of interfaces in Java
 * 
 * This file shows:
 * - How to define an interface
 * - How to implement an interface in a class
 * - Benefits of using interfaces for abstraction and polymorphism
 * 
 * Key Learning Points:
 * 1. Interfaces define a contract that implementing classes must follow
 * 2. Interfaces support multiple inheritance
 * 3. Interfaces enable polymorphism
 */

// Define an interface
interface Animal {
    // Abstract methods (no implementation)
    void eat();
    void sleep();
}

// Implement the interface in a class
class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("The dog is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("The dog is sleeping.");
    }
}

// Implement the interface in another class
class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("The cat is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("The cat is sleeping.");
    }
}

// Main class to demonstrate interface usage
public class InterfaceDemo {
    public static void main(String[] args) {
        System.out.println("=== Interface Demo ===");

        // Create objects of classes that implement the interface
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Call interface methods
        dog.eat();
        dog.sleep();

        cat.eat();
        cat.sleep();

        System.out.println("\nInterfaces enable abstraction and polymorphism!");
    }
}
