// Simple Inheritance Example in Java
// Real-life example: Animal hierarchy with Dog and Cat

// Parent class (Superclass) - Animal
class Animal {
    // Instance variables common to all animals
    protected String name;
    protected int age;
    
    // Constructor for Animal class
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal constructor called");
    }
    
    // Method that will be overridden by child classes
    public void makeSound() {
        System.out.println(name + " makes some sound");
    }
    
    // Common method for all animals
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
    
    // Method to display basic animal info
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + " years");
    }
}

// Child class (Subclass) - Dog inherits from Animal
class Dog extends Animal {
    // Additional instance variable specific to Dog
    private String breed;
    
    // Constructor for Dog class
    public Dog(String name, int age, String breed) {
        // Call parent class constructor using super()
        super(name, age);
        this.breed = breed;
        System.out.println("Dog constructor called");
    }
    
    // Override the makeSound method - polymorphism in action
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }
    
    // Dog-specific method
    public void wagTail() {
        System.out.println(name + " is wagging tail happily!");
    }
    
    // Override displayInfo to include breed information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Breed: " + breed);
    }
}

// Child class (Subclass) - Cat inherits from Animal
class Cat extends Animal {
    // Additional instance variable specific to Cat
    private String color;
    
    // Constructor for Cat class
    public Cat(String name, int age, String color) {
        // Call parent class constructor using super()
        super(name, age);
        this.color = color;
        System.out.println("Cat constructor called");
    }
    
    // Override the makeSound method - polymorphism in action
    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow! Meow!");
    }
    
    // Cat-specific method
    public void purr() {
        System.out.println(name + " is purring contentedly");
    }
    
    // Override displayInfo to include color information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Color: " + color);
    }
}

// Main class to demonstrate inheritance
public class InheritanceExample {
    public static void main(String[] args) {
        System.out.println("=== Creating Animal Objects ===");
        
        // Create a Dog object
        System.out.println("\n--- Creating a Dog ---");
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");
        
        // Create a Cat object
        System.out.println("\n--- Creating a Cat ---");
        Cat myCat = new Cat("Whiskers", 2, "Orange");
        
        System.out.println("\n=== Demonstrating Inheritance ===");
        
        // Dog using inherited and overridden methods
        System.out.println("\n--- Dog Behavior ---");
        myDog.displayInfo();        // Overridden method
        myDog.makeSound();          // Overridden method
        myDog.sleep();              // Inherited method
        myDog.wagTail();            // Dog-specific method
        
        // Cat using inherited and overridden methods
        System.out.println("\n--- Cat Behavior ---");
        myCat.displayInfo();        // Overridden method
        myCat.makeSound();          // Overridden method
        myCat.sleep();              // Inherited method
        myCat.purr();               // Cat-specific method
        
        System.out.println("\n=== Demonstrating Polymorphism ===");
        
        // Polymorphism: Animal reference pointing to Dog and Cat objects
        Animal animal1 = new Dog("Rex", 5, "German Shepherd");
        Animal animal2 = new Cat("Fluffy", 1, "White");
        
        System.out.println("\n--- Polymorphic Behavior ---");
        // Same method call, different behavior based on actual object type
        animal1.makeSound();        // Calls Dog's makeSound()
        animal2.makeSound();        // Calls Cat's makeSound()
        
        // Array of Animal references containing different animal types
        System.out.println("\n--- Animals in Array ---");
        Animal[] animals = {
            new Dog("Max", 4, "Labrador"),
            new Cat("Shadow", 3, "Black"),
            new Dog("Luna", 2, "Poodle")
        };
        
        // Loop through animals and call makeSound() - each behaves differently
        for (Animal animal : animals) {
            animal.makeSound();
        }
        
        System.out.println("\n=== Key Inheritance Concepts Demonstrated ===");
        System.out.println("1. Inheritance: Dog and Cat inherit from Animal");
        System.out.println("2. super(): Used to call parent constructor and methods");
        System.out.println("3. @Override: Method overriding for specialized behavior");
        System.out.println("4. Polymorphism: Same method, different behavior");
        System.out.println("5. Code Reuse: Common code in parent class");
    }
}

/*
Key Inheritance Concepts Explained:

1. INHERITANCE (extends keyword):
   - Dog and Cat inherit properties and methods from Animal
   - Child classes get all public/protected members of parent class
   - Promotes code reuse and establishes "is-a" relationship

2. CONSTRUCTOR CHAINING (super keyword):
   - Child class constructor calls parent constructor using super()
   - Must be first statement in child constructor
   - Ensures proper initialization of parent class

3. METHOD OVERRIDING (@Override annotation):
   - Child classes provide specific implementation of parent methods
   - Same method signature but different behavior
   - Runtime polymorphism in action

4. POLYMORPHISM:
   - Same method call produces different results based on object type
   - Animal reference can point to Dog or Cat objects
   - Method called depends on actual object type, not reference type

5. ACCESS MODIFIERS:
   - protected: Accessible to child classes
   - private: Not accessible to child classes
   - public: Accessible everywhere

Real-life Benefits:
- Code reusability: Common animal behaviors defined once
- Maintainability: Changes to Animal class affect all subclasses
- Extensibility: Easy to add new animal types
- Polymorphism: Treat different animals uniformly when needed
*/

// Save as InheritanceExample.java
// To run: java InheritanceExample.java
