// Abstraction Demo - Understanding Abstract Classes and Methods
// This program demonstrates abstraction using abstract classes and methods

// ABSTRACT PARENT CLASS - Cannot be instantiated directly
abstract class Shape {
    // Instance variables
    protected String name;
    protected String color;
    
    // Constructor for abstract class
    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
        System.out.println("🔷 Shape constructor called for: " + name);
    }
    
    // ABSTRACT METHODS - Must be implemented by child classes
    // No implementation in abstract class
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public abstract void draw();
    
    // CONCRETE METHODS - Can have implementation in abstract class
    public void displayInfo() {
        System.out.println("=== SHAPE INFORMATION ===");
        System.out.println("Shape: " + name);
        System.out.println("Color: " + color);
        System.out.println("Area: " + calculateArea() + " sq units");
        System.out.println("Perimeter: " + calculatePerimeter() + " units");
        System.out.println("==========================");
    }
    
    public void changeColor(String newColor) {
        System.out.println("🎨 Changing " + name + " color from " + color + " to " + newColor);
        this.color = newColor;
    }
    
    // Template method - uses abstract methods
    public void createShape() {
        System.out.println("🏗️ Creating a " + color + " " + name + "...");
        draw();
        System.out.println("✅ Shape created successfully!");
        displayInfo();
    }
}

// CONCRETE CHILD CLASS 1 - Must implement all abstract methods
class Circle extends Shape {
    private double radius;
    
    public Circle(String color, double radius) {
        super("Circle", color);
        this.radius = radius;
        System.out.println("🔵 Circle constructor called with radius: " + radius);
    }
    
    // Implementation of abstract method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    // Implementation of abstract method
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    
    // Implementation of abstract method
    @Override
    public void draw() {
        System.out.println("🔵 Drawing a circle with radius " + radius);
        System.out.println("   ⭕ Using compass and pencil");
    }
    
    // Circle-specific method
    public void rollCircle() {
        System.out.println("🔄 Rolling the circle... round and round!");
    }
}

// CONCRETE CHILD CLASS 2
class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(String color, double length, double width) {
        super("Rectangle", color);
        this.length = length;
        this.width = width;
        System.out.println("🔲 Rectangle constructor called with dimensions: " + length + " x " + width);
    }
    
    @Override
    public double calculateArea() {
        return length * width;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    
    @Override
    public void draw() {
        System.out.println("🔲 Drawing a rectangle with dimensions " + length + " x " + width);
        System.out.println("   📐 Using ruler and pencil");
    }
    
    // Rectangle-specific method
    public void foldRectangle() {
        System.out.println("📄 Folding the rectangle into smaller parts");
    }
}

// CONCRETE CHILD CLASS 3
class Triangle extends Shape {
    private double side1, side2, side3;
    
    public Triangle(String color, double side1, double side2, double side3) {
        super("Triangle", color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        System.out.println("🔺 Triangle constructor called with sides: " + side1 + ", " + side2 + ", " + side3);
    }
    
    @Override
    public double calculateArea() {
        // Using Heron's formula
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
    
    @Override
    public void draw() {
        System.out.println("🔺 Drawing a triangle with sides " + side1 + ", " + side2 + ", " + side3);
        System.out.println("   📐 Using protractor and ruler");
    }
    
    // Triangle-specific method
    public void checkTriangleType() {
        if (side1 == side2 && side2 == side3) {
            System.out.println("🔺 This is an Equilateral Triangle (all sides equal)");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("🔺 This is an Isosceles Triangle (two sides equal)");
        } else {
            System.out.println("🔺 This is a Scalene Triangle (all sides different)");
        }
    }
}

// Another abstract class demonstrating multi-level abstraction
abstract class Vehicle {
    protected String brand;
    protected int maxSpeed;
    
    public Vehicle(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }
    
    // Abstract methods
    public abstract void start();
    public abstract void accelerate();
    public abstract void brake();
    
    // Concrete method
    public void displaySpecs() {
        System.out.println("Brand: " + brand + ", Max Speed: " + maxSpeed + " km/h");
    }
}

class Car extends Vehicle {
    private int numberOfDoors;
    
    public Car(String brand, int maxSpeed, int numberOfDoors) {
        super(brand, maxSpeed);
        this.numberOfDoors = numberOfDoors;
    }
    
    @Override
    public void start() {
        System.out.println("🚗 " + brand + " car engine started with key ignition");
    }
    
    @Override
    public void accelerate() {
        System.out.println("🚗 " + brand + " car accelerating smoothly with gear shift");
    }
    
    @Override
    public void brake() {
        System.out.println("🚗 " + brand + " car braking with disc brakes");
    }
}

// Main class to demonstrate abstraction
public class AbstractionDemo {
    public static void main(String[] args) {
        System.out.println("=== ABSTRACTION DEMONSTRATION ===\n");
        
        // Cannot create object of abstract class
        // Shape shape = new Shape("Generic", "White"); // This will cause error
        
        System.out.println("🎯 PART 1: Creating Different Shapes\n");
        
        // Creating concrete objects
        Circle circle1 = new Circle("Red", 5.0);
        System.out.println();
        
        Rectangle rectangle1 = new Rectangle("Blue", 10.0, 6.0);
        System.out.println();
        
        Triangle triangle1 = new Triangle("Green", 3.0, 4.0, 5.0);
        System.out.println();
        
        System.out.println("🎯 PART 2: Using Template Method (createShape)\n");
        
        // Using template method from abstract class
        circle1.createShape();
        System.out.println();
        
        rectangle1.createShape();
        System.out.println();
        
        triangle1.createShape();
        System.out.println();
        
        System.out.println("🎯 PART 3: Demonstrating Polymorphism with Abstraction\n");
        
        // Array of abstract class references
        Shape[] shapes = {
            new Circle("Yellow", 7.0),
            new Rectangle("Purple", 8.0, 4.0),
            new Triangle("Orange", 6.0, 8.0, 10.0),
            new Circle("Pink", 3.5),
            new Rectangle("Black", 12.0, 5.0)
        };
        
        System.out.println("Processing all shapes using polymorphism:");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("\n--- Shape " + (i + 1) + " ---");
            shapes[i].draw(); // Abstract method implementation called
            System.out.println("Area: " + String.format("%.2f", shapes[i].calculateArea()));
            System.out.println("Perimeter: " + String.format("%.2f", shapes[i].calculatePerimeter()));
        }
        System.out.println();
        
        System.out.println("🎯 PART 4: Shape-Specific Operations\n");
        
        // Accessing specific methods
        circle1.rollCircle();
        rectangle1.foldRectangle();
        triangle1.checkTriangleType();
        System.out.println();
        
        System.out.println("🎯 PART 5: Color Changing Operation\n");
        
        circle1.changeColor("Silver");
        circle1.displayInfo();
        System.out.println();
        
        System.out.println("🎯 PART 6: Vehicle Abstraction Example\n");
        
        Car car1 = new Car("Toyota", 180, 4);
        car1.displaySpecs();
        car1.start();
        car1.accelerate();
        car1.brake();
        System.out.println();
        
        // Demonstrating instanceof with abstract classes
        System.out.println("🔍 PART 7: Type Checking with Abstract Classes\n");
        
        Shape someShape = new Circle("White", 4.0);
        
        if (someShape instanceof Circle) {
            System.out.println("✅ someShape is a Circle");
            ((Circle) someShape).rollCircle();
        }
        
        if (someShape instanceof Shape) {
            System.out.println("✅ someShape is a Shape (abstract class reference)");
        }
        
        System.out.println("\n🎯 CALCULATING TOTAL AREA OF ALL SHAPES:");
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        System.out.println("Total area of all shapes: " + String.format("%.2f", totalArea) + " sq units");
    }
}

/*
=== DETAILED EXPLANATION OF ABSTRACTION ===

🔍 WHAT HAPPENED IN THIS CODE:

1. ABSTRACT CLASS DEFINITION:
   • abstract class Shape { } - Cannot be instantiated
   • Contains both abstract and concrete methods
   • Provides common functionality and enforces contracts

2. ABSTRACT METHODS:
   • public abstract double calculateArea(); - No implementation
   • Must be implemented by all child classes
   • Enforces a contract - all shapes must have area calculation

3. CONCRETE METHODS IN ABSTRACT CLASS:
   • displayInfo(), changeColor() - Have implementations
   • Can be used directly by child objects
   • Provide common functionality

4. TEMPLATE METHOD PATTERN:
   • createShape() method uses abstract methods
   • Defines algorithm structure, child classes provide specific steps
   • Demonstrates abstraction in action

5. INHERITANCE WITH ABSTRACTION:
   • Circle, Rectangle, Triangle extend Shape
   • Must implement all abstract methods
   • Can add their own specific methods

6. POLYMORPHISM WITH ABSTRACTION:
   • Shape[] array holds different shape objects
   • Abstract method calls resolve to specific implementations
   • Runtime polymorphism with abstract classes

📚 KEY CONCEPTS LEARNED:

• Abstraction: Hiding implementation details, showing only functionality
• Abstract Class: Class that cannot be instantiated directly
• Abstract Method: Method without implementation in parent class
• Template Method: Abstract class method using abstract methods
• Contract: Abstract methods define what child classes must implement
• Code Reusability: Common code in abstract class, specific code in children

🎯 IMPORTANT POINTS FOR INDIAN STUDENTS:

• Abstraction = सार (essence without details)
• Abstract class = खाका (blueprint that cannot be used directly)
• Like having a plan for building houses but need specific designs
• Abstract methods = नियम (rules that must be followed)
• Like exam syllabus - topics are defined, but each student studies differently

💡 REAL-WORLD ANALOGY:

• Abstract Class = Vehicle (concept)
  - You cannot drive a "Vehicle" directly
  - But you can drive Car, Bike, Bus (concrete implementations)

• Abstract Methods = Actions all vehicles must do
  - start(), stop(), accelerate() (every vehicle does these differently)

• Concrete Methods = Common features
  - displayInfo() (all vehicles can show their specifications)

🔑 ABSTRACTION BENEFITS:

• Code Organization: Common functionality in abstract class
• Enforcement: Child classes must implement abstract methods
• Polymorphism: Treat different objects uniformly
• Template Methods: Define algorithm structure once
• Maintenance: Changes in abstract class affect all children
• Security: Hide implementation details

⚠️ IMPORTANT RULES:

ABSTRACT CLASS:
• Cannot be instantiated with 'new' keyword
• Can have both abstract and concrete methods
• Can have constructors (called by child classes)
• Can have instance variables
• Can extend only one abstract class (single inheritance)

ABSTRACT METHOD:
• Must be declared with 'abstract' keyword
• Cannot have implementation in abstract class
• Must be implemented in concrete child classes
• Cannot be static, final, or private

🎭 ABSTRACT CLASS vs INTERFACE:

ABSTRACT CLASS:
• Can have both abstract and concrete methods
• Can have instance variables
• Single inheritance (extends one class)
• Can have constructors
• Can have any access modifiers

INTERFACE:
• All methods are abstract by default (until Java 8)
• Only constants (public static final variables)
• Multiple inheritance (implements multiple interfaces)
• No constructors
• All methods are public by default

🌟 WHEN TO USE ABSTRACTION:

• When you have related classes sharing common code
• When you want to enforce certain methods in child classes
• When you need template methods
• When you want to provide partial implementation
• When you have a group of classes with similar responsibilities

🔄 ABSTRACTION LEVELS:

1. DATA ABSTRACTION:
   • Hide internal data representation
   • Provide public methods to access data

2. PROCEDURAL ABSTRACTION:
   • Hide implementation details of methods
   • Provide interface to use functionality

3. CLASS ABSTRACTION:
   • Abstract classes define common interface
   • Hide specific implementation in child classes

💡 PRACTICAL APPLICATIONS:

• GUI Frameworks: Abstract Window class, specific Button, TextField
• Database Access: Abstract Database class, specific MySQL, Oracle
• File Systems: Abstract File class, specific TextFile, ImageFile
• Game Development: Abstract Character class, specific Player, Enemy

🔍 DESIGN PATTERNS USING ABSTRACTION:

• Template Method Pattern: Algorithm structure in abstract class
• Factory Method Pattern: Abstract creator with concrete products
• Strategy Pattern: Abstract strategy with concrete implementations
• Command Pattern: Abstract command with specific command classes
*/
