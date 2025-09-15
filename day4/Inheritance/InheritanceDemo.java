// Inheritance Demo - Understanding Parent-Child Relationship in Java
// This program demonstrates inheritance, method overriding, and super keyword

// PARENT CLASS (Super class / Base class)
class Vehicle {
    // Instance variables
    protected String brand;      // protected allows access in child classes
    protected String model;
    protected int year;
    protected double price;
    protected String fuelType;
    
    // Constructor
    public Vehicle(String brand, String model, int year, double price, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.fuelType = fuelType;
        System.out.println("🚗 Vehicle constructor called - Base object created");
    }
    
    // Parent class methods
    public void start() {
        System.out.println("🔑 " + brand + " " + model + " is starting...");
        System.out.println("Engine ignition successful!");
    }
    
    public void stop() {
        System.out.println("🛑 " + brand + " " + model + " is stopping...");
        System.out.println("Engine turned off safely!");
    }
    
    public void displayInfo() {
        System.out.println("=== VEHICLE INFORMATION ===");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: ₹" + price);
        System.out.println("Fuel Type: " + fuelType);
    }
    
    public void calculateAge() {
        int age = 2024 - year;
        System.out.println("Vehicle Age: " + age + " years");
    }
    
    // Method that will be overridden in child classes
    public void honk() {
        System.out.println("🔊 Generic vehicle horn sound: BEEP BEEP!");
    }
}

// CHILD CLASS 1 (Derived class) - Inherits from Vehicle
class Car extends Vehicle {
    // Additional properties specific to Car
    private int numberOfDoors;
    private String transmissionType;
    private boolean hasAirConditioning;
    
    // Constructor - must call parent constructor
    public Car(String brand, String model, int year, double price, String fuelType, 
               int numberOfDoors, String transmissionType, boolean hasAirConditioning) {
        // Call parent constructor using super()
        super(brand, model, year, price, fuelType);
        this.numberOfDoors = numberOfDoors;
        this.transmissionType = transmissionType;
        this.hasAirConditioning = hasAirConditioning;
        System.out.println("🚙 Car constructor called - Car object created\n");
    }
    
    // METHOD OVERRIDING - Providing specific implementation for Car
    @Override
    public void honk() {
        System.out.println("🚗 Car horn: HONK HONK! (Musical car horn)");
    }
    
    @Override
    public void displayInfo() {
        // Call parent method using super
        super.displayInfo();
        // Add car-specific information
        System.out.println("Doors: " + numberOfDoors);
        System.out.println("Transmission: " + transmissionType);
        System.out.println("Air Conditioning: " + (hasAirConditioning ? "Yes" : "No"));
        System.out.println("===============================\n");
    }
    
    // Car-specific methods
    public void openTrunk() {
        System.out.println("🎒 Car trunk opened - You can store luggage now!");
    }
    
    public void useAirConditioning() {
        if (hasAirConditioning) {
            System.out.println("❄️ Air conditioning turned ON - Cool and comfortable!");
        } else {
            System.out.println("❌ This car doesn't have air conditioning");
        }
    }
}

// CHILD CLASS 2 - Another type of Vehicle
class Motorcycle extends Vehicle {
    // Additional properties specific to Motorcycle
    private boolean hasSidecar;
    private int engineCapacity; // in CC
    
    // Constructor
    public Motorcycle(String brand, String model, int year, double price, String fuelType,
                     boolean hasSidecar, int engineCapacity) {
        super(brand, model, year, price, fuelType);
        this.hasSidecar = hasSidecar;
        this.engineCapacity = engineCapacity;
        System.out.println("🏍️ Motorcycle constructor called - Motorcycle object created\n");
    }
    
    // METHOD OVERRIDING
    @Override
    public void honk() {
        System.out.println("🏍️ Motorcycle horn: PEEEP PEEEP! (High-pitched bike horn)");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine Capacity: " + engineCapacity + " CC");
        System.out.println("Sidecar: " + (hasSidecar ? "Yes" : "No"));
        System.out.println("===============================\n");
    }
    
    // Motorcycle-specific methods
    public void wheelie() {
        System.out.println("🤸 Performing wheelie - Front wheel is up! Be careful!");
    }
    
    public void kickStart() {
        System.out.println("🦵 Kick starting the motorcycle - VROOM VROOM!");
    }
}

// GRANDCHILD CLASS - Multi-level inheritance
class SportsCar extends Car {
    private int topSpeed;
    private boolean hasTurbo;
    
    public SportsCar(String brand, String model, int year, double price, String fuelType,
                    int numberOfDoors, String transmissionType, boolean hasAirConditioning,
                    int topSpeed, boolean hasTurbo) {
        super(brand, model, year, price, fuelType, numberOfDoors, transmissionType, hasAirConditioning);
        this.topSpeed = topSpeed;
        this.hasTurbo = hasTurbo;
        System.out.println("🏎️ SportsCar constructor called - Sports car object created\n");
    }
    
    @Override
    public void honk() {
        System.out.println("🏎️ Sports car horn: VROOOM BEEP! (Aggressive sports horn)");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Top Speed: " + topSpeed + " km/h");
        System.out.println("Turbo: " + (hasTurbo ? "Yes" : "No"));
        System.out.println("===============================\n");
    }
    
    public void raceMode() {
        System.out.println("🏁 RACE MODE ACTIVATED! Maximum performance unleashed!");
        if (hasTurbo) {
            System.out.println("💨 TURBO BOOST ENGAGED! Extra power activated!");
        }
    }
}

// Main class to demonstrate inheritance
public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== INHERITANCE DEMONSTRATION ===\n");
        
        // Creating parent class object
        System.out.println("1. Creating a basic Vehicle:");
        Vehicle vehicle1 = new Vehicle("Generic", "BasicVehicle", 2020, 500000, "Petrol");
        vehicle1.displayInfo();
        vehicle1.start();
        vehicle1.honk();
        vehicle1.calculateAge();
        vehicle1.stop();
        System.out.println();
        
        // Creating child class object (Car)
        System.out.println("2. Creating a Car (inherits from Vehicle):");
        Car car1 = new Car("Maruti", "Swift", 2022, 800000, "Petrol", 5, "Manual", true);
        car1.displayInfo();
        car1.start();        // Inherited method
        car1.honk();         // Overridden method
        car1.openTrunk();    // Car-specific method
        car1.useAirConditioning(); // Car-specific method
        car1.calculateAge(); // Inherited method
        car1.stop();         // Inherited method
        System.out.println();
        
        // Creating another child class object (Motorcycle)
        System.out.println("3. Creating a Motorcycle (inherits from Vehicle):");
        Motorcycle bike1 = new Motorcycle("Royal Enfield", "Classic 350", 2023, 200000, "Petrol", false, 350);
        bike1.displayInfo();
        bike1.kickStart();   // Motorcycle-specific method
        bike1.start();       // Inherited method
        bike1.honk();        // Overridden method
        bike1.wheelie();     // Motorcycle-specific method
        bike1.calculateAge(); // Inherited method
        bike1.stop();        // Inherited method
        System.out.println();
        
        // Creating grandchild class object (Multi-level inheritance)
        System.out.println("4. Creating a Sports Car (Multi-level inheritance):");
        SportsCar sportsCar1 = new SportsCar("Ferrari", "F8 Tributo", 2023, 5000000, "Petrol", 
                                           2, "Automatic", true, 340, true);
        sportsCar1.displayInfo();
        sportsCar1.start();      // Inherited from Vehicle
        sportsCar1.honk();       // Overridden in SportsCar
        sportsCar1.openTrunk();  // Inherited from Car
        sportsCar1.raceMode();   // SportsCar-specific method
        sportsCar1.useAirConditioning(); // Inherited from Car
        sportsCar1.stop();       // Inherited from Vehicle
        System.out.println();
        
        // Demonstrating polymorphism with inheritance
        System.out.println("5. Demonstrating Polymorphism with Inheritance:");
        System.out.println("Creating array of Vehicle references pointing to different objects:");
        
        Vehicle[] vehicles = {
            new Vehicle("Tata", "Nexon", 2021, 1200000, "Electric"),
            new Car("Honda", "City", 2022, 1500000, "Petrol", 4, "CVT", true),
            new Motorcycle("Yamaha", "R15", 2023, 180000, "Petrol", false, 155),
            new SportsCar("Lamborghini", "Huracan", 2023, 8000000, "Petrol", 2, "Automatic", true, 325, true)
        };
        
        System.out.println("\nCalling honk() method on all vehicles:");
        for (int i = 0; i < vehicles.length; i++) {
            System.out.print("Vehicle " + (i + 1) + ": ");
            vehicles[i].honk(); // Runtime polymorphism - appropriate method called
        }
        
        System.out.println("\nAll vehicles starting:");
        for (Vehicle v : vehicles) {
            v.start();
        }
    }
}

/*
=== DETAILED EXPLANATION OF INHERITANCE ===

🔍 WHAT HAPPENED IN THIS CODE:

1. INHERITANCE HIERARCHY:
   • Vehicle (Parent/Super class)
   • Car extends Vehicle (Child/Sub class)
   • Motorcycle extends Vehicle (Child/Sub class)
   • SportsCar extends Car (Grandchild - Multi-level inheritance)

2. INHERITANCE SYNTAX:
   • class Child extends Parent { }
   • Child class inherits all non-private members of parent
   • Child can add its own members and override parent methods

3. SUPER KEYWORD:
   • super() - calls parent constructor
   • super.methodName() - calls parent method
   • Must be first statement in constructor

4. METHOD OVERRIDING:
   • Child class provides specific implementation of parent method
   • @Override annotation ensures correct overriding
   • Same method signature as parent method

5. PROTECTED ACCESS MODIFIER:
   • protected members accessible in child classes
   • More access than private, less than public
   • Good for inheritance hierarchies

6. POLYMORPHISM WITH INHERITANCE:
   • Vehicle[] array can hold Car, Motorcycle, SportsCar objects
   • Runtime decides which method to call (dynamic method dispatch)
   • Same method call produces different behavior

📚 KEY CONCEPTS LEARNED:

• Inheritance: IS-A relationship (Car IS-A Vehicle)
• Code Reusability: Child inherits parent's functionality
• Method Overriding: Child customizes parent's behavior
• Super keyword: Access parent class members
• Multi-level inheritance: Chain of inheritance
• Polymorphism: One interface, multiple implementations

🎯 IMPORTANT POINTS FOR INDIAN STUDENTS:

• Inheritance = वंशावली (family tree)
• Parent class = माता-पिता (parents give traits to children)
• Child class = बच्चे (children inherit traits but can be different)
• Method overriding = बच्चे अपना तरीका अपनाते हैं (children develop their own ways)
• Super keyword = माता-पिता से मदद लेना (taking help from parents)

💡 REAL-WORLD ANALOGY:

• Vehicle = General concept of transportation
• Car = Specific type with 4 wheels, doors, trunk
• Motorcycle = Specific type with 2 wheels, different features
• SportsCar = Special car with racing features
• All inherit basic vehicle properties but have unique features

🔑 INHERITANCE BENEFITS:

• Code Reusability: Write once, use in multiple child classes
• Method Overriding: Customize behavior in child classes
• Hierarchical Organization: Logical structure of related classes
• Polymorphism: Treat different objects uniformly
• Extensibility: Easy to add new types without changing existing code

⚠️ IMPORTANT RULES:

• Java supports single inheritance only (one direct parent)
• Child inherits all non-private members
• Constructor is not inherited but can be called using super()
• Method overriding requires same signature
• Cannot override static, final, or private methods

🎭 INHERITANCE vs COMPOSITION:

• Inheritance: IS-A relationship (Car IS-A Vehicle)
• Composition: HAS-A relationship (Car HAS-A Engine)
• Inheritance: Tight coupling, compile-time relationship
• Composition: Loose coupling, runtime relationship

🔄 METHOD RESOLUTION:

• Child object calls method
• First check in child class
• If not found, check in parent class
• Continue up the hierarchy until found
• If @Override, child version is called

🌟 BEST PRACTICES:

• Use inheritance for IS-A relationships
• Keep parent classes general, child classes specific
• Override methods to provide specialized behavior
• Use super() in child constructors
• Document inheritance relationships clearly
*/
