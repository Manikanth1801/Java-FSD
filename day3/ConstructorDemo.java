package day3;

public class ConstructorDemo {
    int id;
    String name;

    // Default Constructor
    ConstructorDemo() {
        this.id = 0; //The this keyword in Java refers to the current object instance
        this.name = "Unknown";
    }
    // Parameterized Constructor
    ConstructorDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
    public static void main(String[] args) {
        System.out.println("=== CONSTRUCTOR DEMONSTRATION ===\n");
        // Using default constructor
        ConstructorDemo obj1 = new ConstructorDemo();
        // Using parameterized constructor
        ConstructorDemo obj2 = new ConstructorDemo(1, "Alice");
        // Displaying object details
        obj1.display(); // prints ID: 0, Name: Unknown
        obj2.display(); // prints ID: 1, Name: Alice
    }
}
