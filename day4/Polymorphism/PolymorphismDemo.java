// Polymorphism Demo - Understanding Method Overloading and Overriding
// This program demonstrates both compile-time and runtime polymorphism

// PART 1: METHOD OVERLOADING (Compile-time Polymorphism)
class Calculator {
    // Method overloading - same method name with different parameters
    
    // Addition with 2 integers
    public int add(int a, int b) {
        System.out.println("🔢 Adding two integers: " + a + " + " + b);
        return a + b;
    }
    
    // Addition with 3 integers
    public int add(int a, int b, int c) {
        System.out.println("🔢 Adding three integers: " + a + " + " + b + " + " + c);
        return a + b + c;
    }
    
    // Addition with 2 double values
    public double add(double a, double b) {
        System.out.println("🔢 Adding two doubles: " + a + " + " + b);
        return a + b;
    }
    
    // Addition with string concatenation
    public String add(String a, String b) {
        System.out.println("📝 Concatenating two strings: '" + a + "' + '" + b + "'");
        return a + b;
    }
    
    // Multiplication overloaded methods
    public int multiply(int a, int b) {
        System.out.println("✖️ Multiplying two integers: " + a + " × " + b);
        return a * b;
    }
    
    public double multiply(double a, double b) {
        System.out.println("✖️ Multiplying two doubles: " + a + " × " + b);
        return a * b;
    }
    
    public int multiply(int a, int b, int c) {
        System.out.println("✖️ Multiplying three integers: " + a + " × " + b + " × " + c);
        return a * b * c;
    }
}

// PART 2: METHOD OVERRIDING (Runtime Polymorphism)
// Parent class for demonstrating method overriding
class Animal {
    protected String name;
    protected int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method that will be overridden in child classes
    public void makeSound() {
        System.out.println("🐾 " + name + " makes a generic animal sound");
    }
    
    public void eat() {
        System.out.println("🍽️ " + name + " is eating food");
    }
    
    public void sleep() {
        System.out.println("😴 " + name + " is sleeping peacefully");
    }
    
    // Method that shows common behavior
    public void displayInfo() {
        System.out.println("Animal: " + name + ", Age: " + age + " years");
    }
}

// Child class 1
class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    
    // Method overriding - providing specific implementation
    @Override
    public void makeSound() {
        System.out.println("🐕 " + name + " barks: WOOF WOOF! BOW BOW!");
    }
    
    @Override
    public void eat() {
        System.out.println("🦴 " + name + " is eating dog food and bones");
    }
    
    // Dog-specific method
    public void wagTail() {
        System.out.println("🐕 " + name + " is wagging tail happily!");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
}

// Child class 2
class Cat extends Animal {
    private String color;
    
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
    
    @Override
    public void makeSound() {
        System.out.println("🐱 " + name + " meows: MEOW MEOW! MIAOW!");
    }
    
    @Override
    public void eat() {
        System.out.println("🐟 " + name + " is eating cat food and fish");
    }
    
    // Cat-specific method
    public void purr() {
        System.out.println("🐱 " + name + " is purring contentedly: purr purr...");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
    }
}

// Child class 3
class Bird extends Animal {
    private boolean canFly;
    
    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }
    
    @Override
    public void makeSound() {
        System.out.println("🐦 " + name + " chirps: CHIRP CHIRP! TWEET TWEET!");
    }
    
    @Override
    public void eat() {
        System.out.println("🌰 " + name + " is eating seeds and grains");
    }
    
    // Bird-specific method
    public void fly() {
        if (canFly) {
            System.out.println("🦅 " + name + " is flying high in the sky!");
        } else {
            System.out.println("🐧 " + name + " cannot fly but can run fast!");
        }
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Can fly: " + (canFly ? "Yes" : "No"));
    }
}

// PART 3: Constructor Overloading
class Student {
    private String name;
    private int age;
    private String course;
    private double fees;
    
    // Constructor overloading
    public Student(String name) {
        this(name, 18); // Calling another constructor
        System.out.println("📚 Student created with name only");
    }
    
    public Student(String name, int age) {
        this(name, age, "General"); // Calling another constructor
        System.out.println("📚 Student created with name and age");
    }
    
    public Student(String name, int age, String course) {
        this(name, age, course, 50000.0); // Calling another constructor
        System.out.println("📚 Student created with name, age, and course");
    }
    
    public Student(String name, int age, String course, double fees) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.fees = fees;
        System.out.println("📚 Student created with all parameters");
    }
    
    public void displayStudent() {
        System.out.println("=== STUDENT INFO ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Fees: ₹" + fees);
        System.out.println("====================\n");
    }
}

// Main class to demonstrate polymorphism
public class PolymorphismDemo {
    public static void main(String[] args) {
        System.out.println("=== POLYMORPHISM DEMONSTRATION ===\n");
        
        // PART 1: METHOD OVERLOADING DEMO
        System.out.println("🎯 PART 1: METHOD OVERLOADING (Compile-time Polymorphism)\n");
        
        Calculator calc = new Calculator();
        
        // Same method name 'add' but different parameters
        System.out.println("Result: " + calc.add(10, 20));
        System.out.println("Result: " + calc.add(10, 20, 30));
        System.out.println("Result: " + calc.add(10.5, 20.7));
        System.out.println("Result: " + calc.add("Hello", "World"));
        System.out.println();
        
        // Same method name 'multiply' but different parameters
        System.out.println("Result: " + calc.multiply(5, 4));
        System.out.println("Result: " + calc.multiply(2.5, 3.0));
        System.out.println("Result: " + calc.multiply(2, 3, 4));
        System.out.println();
        
        // PART 2: CONSTRUCTOR OVERLOADING
        System.out.println("🎯 PART 2: CONSTRUCTOR OVERLOADING\n");
        
        Student student1 = new Student("Rahul");
        student1.displayStudent();
        
        Student student2 = new Student("Priya", 20);
        student2.displayStudent();
        
        Student student3 = new Student("Amit", 22, "Computer Science");
        student3.displayStudent();
        
        Student student4 = new Student("Sneha", 19, "Electronics", 75000.0);
        student4.displayStudent();
        
        // PART 3: METHOD OVERRIDING DEMO
        System.out.println("🎯 PART 3: METHOD OVERRIDING (Runtime Polymorphism)\n");
        
        // Creating objects of different classes
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 2, "Orange");
        Bird bird = new Bird("Tweety", 1, true);
        Bird penguin = new Bird("Pingu", 5, false);
        
        System.out.println("Individual animal behaviors:");
        dog.displayInfo();
        dog.makeSound();
        dog.eat();
        dog.wagTail();
        System.out.println();
        
        cat.displayInfo();
        cat.makeSound();
        cat.eat();
        cat.purr();
        System.out.println();
        
        bird.displayInfo();
        bird.makeSound();
        bird.eat();
        bird.fly();
        System.out.println();
        
        penguin.displayInfo();
        penguin.makeSound();
        penguin.eat();
        penguin.fly();
        System.out.println();
        
        // PART 4: RUNTIME POLYMORPHISM WITH ARRAY
        System.out.println("🎯 PART 4: RUNTIME POLYMORPHISM WITH ARRAYS\n");
        
        // Array of Animal references pointing to different objects
        Animal[] animals = {
            new Dog("Max", 4, "German Shepherd"),
            new Cat("Luna", 3, "Black"),
            new Bird("Parrot", 2, true),
            new Dog("Rocky", 5, "Bulldog"),
            new Cat("Mittens", 1, "White")
        };
        
        System.out.println("All animals making sounds (Runtime Polymorphism):");
        for (int i = 0; i < animals.length; i++) {
            System.out.print("Animal " + (i + 1) + ": ");
            animals[i].makeSound(); // Runtime decides which method to call
        }
        System.out.println();
        
        System.out.println("All animals eating (Runtime Polymorphism):");
        for (Animal animal : animals) {
            animal.eat(); // Runtime decides which method to call
        }
        System.out.println();
        
        System.out.println("All animals sleeping (Common method):");
        for (Animal animal : animals) {
            animal.sleep(); // Same method for all
        }
        System.out.println();
        
        // Demonstrating instanceof operator
        System.out.println("🔍 Checking object types with instanceof:");
        for (int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];
            System.out.print("Animal " + (i + 1) + " is a: ");
            
            if (animal instanceof Dog) {
                System.out.println("Dog 🐕");
                ((Dog) animal).wagTail(); // Type casting to access Dog-specific method
            } else if (animal instanceof Cat) {
                System.out.println("Cat 🐱");
                ((Cat) animal).purr(); // Type casting to access Cat-specific method
            } else if (animal instanceof Bird) {
                System.out.println("Bird 🐦");
                ((Bird) animal).fly(); // Type casting to access Bird-specific method
            }
        }
    }
}

/*
=== DETAILED EXPLANATION OF POLYMORPHISM ===

🔍 WHAT HAPPENED IN THIS CODE:

1. METHOD OVERLOADING (Compile-time Polymorphism):
   • Same method name with different parameters
   • Compiler decides which method to call based on arguments
   • Examples: add(int, int), add(int, int, int), add(double, double)
   • Also called static polymorphism

2. CONSTRUCTOR OVERLOADING:
   • Multiple constructors with different parameter lists
   • Provides flexibility in object creation
   • Uses constructor chaining with this()

3. METHOD OVERRIDING (Runtime Polymorphism):
   • Child class provides specific implementation of parent method
   • Same method signature as parent
   • Runtime decides which method to call based on object type
   • Also called dynamic polymorphism

4. RUNTIME POLYMORPHISM WITH ARRAYS:
   • Animal[] array can hold Dog, Cat, Bird objects
   • animal.makeSound() calls appropriate method based on actual object
   • Enables treating different objects uniformly

5. TYPE CASTING AND INSTANCEOF:
   • instanceof checks object type at runtime
   • Type casting allows access to child-specific methods
   • Safe way to access specialized functionality

📚 KEY CONCEPTS LEARNED:

• Polymorphism: One interface, multiple implementations
• Method Overloading: Same name, different parameters
• Method Overriding: Same signature, different implementation
• Runtime Polymorphism: Method resolution at runtime
• Compile-time Polymorphism: Method resolution at compile time
• Type Casting: Converting reference types safely

🎯 IMPORTANT POINTS FOR INDIAN STUDENTS:

• Polymorphism = बहुरूपता (one thing in many forms)
• Method overloading = एक ही नाम, अलग तरीके (same name, different ways)
• Method overriding = बच्चे अपना तरीका अपनाते हैं (children adopt their own ways)
• Runtime polymorphism = समय पर फैसला (decision at runtime)
• Like one remote control working with different devices

💡 REAL-WORLD ANALOGY:

• Method Overloading:
  - Calculator app: + button works for numbers, strings, dates
  - Same button, different operations based on input type

• Method Overriding:
  - Animals making sounds: All animals can makeSound()
  - But dogs bark, cats meow, birds chirp (different implementations)

🔑 TYPES OF POLYMORPHISM:

1. COMPILE-TIME POLYMORPHISM:
   • Method Overloading
   • Constructor Overloading
   • Operator Overloading (not in Java)
   • Decision made at compile time

2. RUNTIME POLYMORPHISM:
   • Method Overriding
   • Interface implementation
   • Decision made at runtime
   • Uses dynamic method dispatch

⚠️ IMPORTANT RULES:

METHOD OVERLOADING:
• Different parameter list (number, type, order)
• Same method name
• Return type can be different
• Access modifier can be different

METHOD OVERRIDING:
• Same method signature (name + parameters)
• Same or covariant return type
• Same or more accessible access modifier
• Cannot override static, final, private methods

🎭 OVERLOADING vs OVERRIDING:

OVERLOADING:
• Compile-time polymorphism
• Same class or inheritance hierarchy
• Different method signatures
• No @Override annotation

OVERRIDING:
• Runtime polymorphism
• Inheritance hierarchy required
• Same method signature
• Uses @Override annotation

🌟 BENEFITS OF POLYMORPHISM:

• Code Flexibility: Same interface, different implementations
• Code Reusability: Write once, use with many types
• Maintainability: Easy to add new types
• Extensibility: Add new behaviors without changing existing code
• Abstraction: Hide implementation details behind common interface

🔄 DYNAMIC METHOD DISPATCH:

• JVM determines which method to call at runtime
• Based on actual object type, not reference type
• Enables runtime polymorphism
• Foundation of many design patterns

💡 PRACTICAL APPLICATIONS:

• GUI frameworks: Different components handle events differently
• Database drivers: Same interface, different database implementations
• File systems: Same operations, different file types
• Payment systems: Same interface, different payment methods
*/
