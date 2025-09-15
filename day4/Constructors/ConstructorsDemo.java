// Constructors Demo - Understanding Object Initialization in Java
// This program demonstrates different types of constructors and their usage

// Main class to demonstrate constructors
public class ConstructorsDemo {
    public static void main(String[] args) {
        System.out.println("=== CONSTRUCTORS DEMONSTRATION ===\n");
        
        // 1. Using DEFAULT CONSTRUCTOR
        System.out.println("1. Creating book with DEFAULT CONSTRUCTOR:");
        Book book1 = new Book();
        book1.displayBookInfo();
        
        // 2. Using PARAMETERIZED CONSTRUCTOR (3 parameters)
        System.out.println("2. Creating book with PARAMETERIZED CONSTRUCTOR (3 params):");
        Book book2 = new Book("Java: The Complete Reference", "Herbert Schildt", 850.0);
        book2.displayBookInfo();
        book2.calculateReadingTime();
        
        // 3. Using OVERLOADED CONSTRUCTOR (4 parameters)
        System.out.println("3. Creating book with OVERLOADED CONSTRUCTOR (4 params):");
        Book book3 = new Book("Effective Java", "Joshua Bloch", 650.0, 416);
        book3.displayBookInfo();
        book3.calculateReadingTime();
        
        // 4. Using FULLY PARAMETERIZED CONSTRUCTOR (5 parameters)
        System.out.println("4. Creating book with FULLY PARAMETERIZED CONSTRUCTOR:");
        Book book4 = new Book("Clean Code", "Robert Martin", 750.0, 464, "Pearson Education");
        book4.displayBookInfo();
        book4.calculateReadingTime();
        
        System.out.println("=== CONSTRUCTOR CHAINING DEMONSTRATION ===\n");
        
        // Demonstrating constructor chaining
        System.out.println("Creating mobile with constructor chaining:");
        Mobile mobile1 = new Mobile("Samsung", "Galaxy S21");
        mobile1.displayMobileInfo();
        
        // Show how constructor chaining works step by step
        System.out.println("Notice how constructor chaining worked:");
        System.out.println("1. Called Mobile(brand, model)");
        System.out.println("2. Which called Mobile(brand, model, price)");
        System.out.println("3. Which called Mobile(brand, model, price, storage)");
        System.out.println("4. Which called Mobile(brand, model, price, storage, color)");
        System.out.println("5. The main constructor initialized all values\n");
        
        // Creating another mobile with different constructor
        System.out.println("Creating mobile with 3 parameters:");
        Mobile mobile2 = new Mobile("iPhone", "13", 65000.0);
        mobile2.displayMobileInfo();
    }
}

// Class demonstrating various types of constructors
class Book {
    // Instance variables
    String title;
    String author;
    double price;
    int pages;
    String publisher;
    
    // 1. DEFAULT CONSTRUCTOR (No parameters)
    // Called when object is created without any arguments
    public Book() {
        System.out.println("📚 Default constructor called!");
        title = "Unknown Title";
        author = "Unknown Author";
        price = 0.0;
        pages = 0;
        publisher = "Unknown Publisher";
        System.out.println("Book object created with default values\n");
    }
    
    // 2. PARAMETERIZED CONSTRUCTOR (With parameters)
    // Called when object is created with arguments
    public Book(String bookTitle, String bookAuthor, double bookPrice) {
        System.out.println("📚 Parameterized constructor (3 parameters) called!");
        title = bookTitle;
        author = bookAuthor;
        price = bookPrice;
        pages = 300; // Default value
        publisher = "Standard Publisher"; // Default value
        System.out.println("Book object created with provided values\n");
    }
    
    // 3. OVERLOADED CONSTRUCTOR (Different number of parameters)
    // Constructor overloading - multiple constructors with different parameters
    public Book(String bookTitle, String bookAuthor, double bookPrice, int bookPages) {
        System.out.println("📚 Overloaded constructor (4 parameters) called!");
        title = bookTitle;
        author = bookAuthor;
        price = bookPrice;
        pages = bookPages;
        publisher = "Premium Publisher"; // Default value
        System.out.println("Book object created with 4 parameters\n");
    }
    
    // 4. FULLY PARAMETERIZED CONSTRUCTOR (All parameters)
    public Book(String bookTitle, String bookAuthor, double bookPrice, int bookPages, String bookPublisher) {
        System.out.println("📚 Fully parameterized constructor (5 parameters) called!");
        title = bookTitle;
        author = bookAuthor;
        price = bookPrice;
        pages = bookPages;
        publisher = bookPublisher;
        System.out.println("Book object created with all parameters\n");
    }
    
    // Method to display book information
    void displayBookInfo() {
        System.out.println("=== BOOK DETAILS ===");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("Pages: " + pages);
        System.out.println("Publisher: " + publisher);
        System.out.println("====================\n");
    }
    
    // Method to calculate reading time (assuming 1 page = 2 minutes)
    void calculateReadingTime() {
        int readingTime = pages * 2;
        System.out.println("⏰ Estimated reading time: " + readingTime + " minutes");
        System.out.println("   (" + (readingTime / 60) + " hours " + (readingTime % 60) + " minutes)\n");
    }
}

// Class to demonstrate constructor chaining using 'this' keyword
class Mobile {
    String brand;
    String model;
    double price;
    int storage;
    String color;
    
    // Constructor with minimum parameters
    public Mobile(String brand, String model) {
        // Calling another constructor using 'this'
        this(brand, model, 15000.0); // Default price
        System.out.println("🔗 Constructor chaining: Basic constructor called\n");
    }
    
    // Constructor with 3 parameters
    public Mobile(String brand, String model, double price) {
        // Calling another constructor using 'this'
        this(brand, model, price, 64); // Default storage
        System.out.println("🔗 Constructor chaining: 3-parameter constructor called\n");
    }
    
    // Constructor with 4 parameters
    public Mobile(String brand, String model, double price, int storage) {
        // Calling another constructor using 'this'
        this(brand, model, price, storage, "Black"); // Default color
        System.out.println("🔗 Constructor chaining: 4-parameter constructor called\n");
    }
    
    // Main constructor with all parameters
    public Mobile(String brand, String model, double price, int storage, String color) {
        System.out.println("📱 Main constructor called with all parameters!");
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.storage = storage;
        this.color = color;
        System.out.println("Mobile object fully initialized\n");
    }
    
    void displayMobileInfo() {
        System.out.println("=== MOBILE DETAILS ===");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Color: " + color);
        System.out.println("=======================\n");
    }
}

/*
=== DETAILED EXPLANATION OF CONSTRUCTORS ===

🔍 WHAT HAPPENED IN THIS CODE:

1. DEFAULT CONSTRUCTOR:
   • Constructor with no parameters: public Book()
   • Called when: Book book1 = new Book();
   • Sets default values to all instance variables
   • Every class has a default constructor (implicit or explicit)

2. PARAMETERIZED CONSTRUCTOR:
   • Constructor with parameters: public Book(String title, String author, double price)
   • Called when: Book book2 = new Book("Java", "Herbert", 850.0);
   • Allows initialization with specific values during object creation
   • More efficient than creating object and then setting values

3. CONSTRUCTOR OVERLOADING:
   • Multiple constructors with different parameter lists
   • Same constructor name but different signatures
   • Provides flexibility in object creation
   • Example: Book(title, author, price) vs Book(title, author, price, pages)

4. CONSTRUCTOR CHAINING:
   • One constructor calling another using 'this()'
   • Must be the first statement in constructor
   • Helps avoid code duplication
   • Creates a chain of constructor calls

5. 'this' KEYWORD:
   • this.brand = brand; (differentiates parameter from instance variable)
   • this(); (calls another constructor)
   • Refers to the current object

📚 KEY CONCEPTS LEARNED:

• Constructor: Special method that initializes objects
• Constructor name must match class name exactly
• Constructors don't have return type (not even void)
• Called automatically when object is created with 'new'
• Can be overloaded like regular methods
• Constructor chaining using this()

🎯 IMPORTANT POINTS FOR INDIAN STUDENTS:

• Constructor = घर बनाने का नक्शा (blueprint for building house)
• Default constructor = basic घर (basic house with standard features)
• Parameterized constructor = customized घर (house with your specifications)
• Constructor overloading = different house models (1BHK, 2BHK, 3BHK)
• Constructor chaining = step-by-step house building process

💡 REAL-WORLD ANALOGY:

• Think of constructors like different ways to order food:
  - Default constructor = Standard thali (fixed items)
  - Parameterized constructor = Custom order (you specify items)
  - Overloaded constructors = Different meal combos (breakfast, lunch, dinner)
  - Constructor chaining = Kitchen preparation steps (one step leads to another)

🔑 MEMORY CONCEPT:

• Constructor runs once when object is created
• Sets up initial state of the object
• Memory is allocated first, then constructor initializes values
• Without constructor, variables have default values (null, 0, false)

⚠️ IMPORTANT RULES:

• Constructor cannot be static, final, or abstract
• If you don't write any constructor, Java provides default constructor
• If you write any constructor, Java doesn't provide default constructor
• Constructor chaining call this() must be first statement
• Can have any access modifier (public, private, protected)

🎭 CONSTRUCTOR vs METHOD:

• Constructor: Called automatically during object creation
• Method: Called manually when needed
• Constructor: No return type
• Method: Has return type
• Constructor: Name = Class name
• Method: Can have any name
*/
