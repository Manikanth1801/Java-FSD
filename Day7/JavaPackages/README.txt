/*
 * JAVA PACKAGES TUTORIAL - README
 * ===============================
 * 
 * This folder contains simple examples demonstrating Java packages.
 * 
 * WHAT YOU WILL LEARN:
 * -------------------
 * 1. How to create packages using the 'package' keyword
 * 2. How to organize related classes in packages
 * 3. How to import classes from other packages
 * 4. How to use imported classes in your code
 * 
 * FILE STRUCTURE:
 * --------------
 * JavaPackages/
 * ├── README.txt (this file)
 * ├── PackageDemo.java (main class - run this one)
 * ├── utils/
 * │   ├── Calculator.java (basic math operations)
 * │   └── StringHelper.java (string utility functions)
 * └── models/
 *     ├── Student.java (student model class)
 *     └── Book.java (book model class)
 * 
 * HOW TO COMPILE AND RUN:
 * ----------------------
 * 
 * STEP 1: Open Command Prompt/Terminal
 * Navigate to the JavaPackages directory:
 * cd "C:\Manii\Training\temp\Day7\JavaPackages"
 * 
 * STEP 2: Compile all Java files
 * Copy and paste this command:
 * javac PackageDemo.java utils\*.java models\*.java
 * 
 * STEP 3: Run the main program
 * java PackageDemo
 * 
 * ALTERNATIVE COMPILATION (if above doesn't work):
 * javac *.java
 * javac utils/*.java
 * javac models/*.java
 * java PackageDemo
 * 
 * WHAT EACH FILE DOES:
 * -------------------
 * 
 * Order 1 - Calculator.java:
 * - Shows basic package creation with 'package utils;'
 * - Contains static methods for math operations
 * - Demonstrates utility class pattern
 * 
 * Order 2 - StringHelper.java:
 * - Another class in the same utils package
 * - Shows multiple classes can exist in one package
 * - Contains string manipulation methods
 * 
 * Order 3 - Student.java:
 * - Model class in the models package
 * - Shows how to create data classes with constructors
 * - Demonstrates encapsulation with private fields
 * 
 * Order 4 - Book.java:
 * - Another model class in the models package
 * - Shows object state management (available/borrowed)
 * - Demonstrates business logic in model classes
 * 
 * Order 5 - PackageDemo.java:
 * - Main class that imports and uses all other classes
 * - Shows import statements for different packages
 * - Demonstrates how packages work together
 * 
 * KEY CONCEPTS DEMONSTRATED:
 * -------------------------
 * 
 * 1. PACKAGE DECLARATION:
 *    - Must be the first non-comment line
 *    - Format: package packageName;
 *    - Example: package utils;
 * 
 * 2. IMPORT STATEMENTS:
 *    - Come after package declaration, before class declaration
 *    - Format: import packageName.ClassName;
 *    - Example: import utils.Calculator;
 * 
 * 3. PACKAGE ORGANIZATION:
 *    - Related classes grouped together
 *    - utils: Utility/helper classes
 *    - models: Data/entity classes
 * 
 * 4. USING IMPORTED CLASSES:
 *    - After importing, use class name directly
 *    - Static methods: Calculator.add(5, 3)
 *    - Instance methods: student.displayInfo()
 * 
 * EXPECTED OUTPUT:
 * ---------------
 * When you run the program, you should see:
 * - Calculator operations with results
 * - String manipulation examples
 * - Student and Book object creation and usage
 * - Demonstration of how packages work together
 * 
 * TROUBLESHOOTING:
 * ---------------
 * If you get compilation errors:
 * 1. Make sure you're in the JavaPackages directory
 * 2. Check that all .java files exist
 * 3. Try compiling each package separately:
 *    javac utils/*.java
 *    javac models/*.java
 *    javac PackageDemo.java
 * 4. Then run: java PackageDemo
 * 
 * PACKAGE BENEFITS:
 * ----------------
 * - Organizes related classes together
 * - Prevents naming conflicts
 * - Controls access with access modifiers
 * - Makes code more maintainable
 * - Follows industry standards
 */
