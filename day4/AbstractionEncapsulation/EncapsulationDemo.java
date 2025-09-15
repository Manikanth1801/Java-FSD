// Encapsulation Demo - Understanding Data Hiding and Access Control
// This program demonstrates encapsulation using private variables and public methods

// Class demonstrating proper encapsulation
class BankAccount {
    // PRIVATE INSTANCE VARIABLES - Cannot be accessed directly from outside
    private String accountNumber;      // Account number
    private String accountHolderName;  // Account holder's name
    private double balance;            // Account balance
    private String accountType;       // Account type (Savings/Current)
    private boolean isActive;         // Account status
    private int pin;                  // Secret PIN
    
    // CONSTRUCTOR - Initialize object with validation
    public BankAccount(String accountNumber, String accountHolderName, 
                      String accountType, double initialBalance, int pin) {
        // Validation before setting values
        if (accountNumber == null || accountNumber.length() < 8) {
            throw new IllegalArgumentException("Account number must be at least 8 characters");
        }
        if (accountHolderName == null || accountHolderName.trim().isEmpty()) {
            throw new IllegalArgumentException("Account holder name cannot be empty");
        }
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        if (pin < 1000 || pin > 9999) {
            throw new IllegalArgumentException("PIN must be 4 digits");
        }
        
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = initialBalance;
        this.pin = pin;
        this.isActive = true;
        
        System.out.println("🏦 Bank Account created successfully!");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Initial Balance: ₹" + initialBalance);
        System.out.println("Account Status: Active\n");
    }
    
    // GETTER METHODS (PUBLIC) - Controlled access to private data
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountHolderName() {
        return accountHolderName;
    }
    
    public String getAccountType() {
        return accountType;
    }
    
    public boolean isAccountActive() {
        return isActive;
    }
    
    // CONTROLLED GETTER for balance - requires PIN verification
    public double getBalance(int enteredPin) {
        if (verifyPin(enteredPin)) {
            System.out.println("✅ PIN verified. Showing balance...");
            return balance;
        } else {
            System.out.println("❌ Invalid PIN! Balance access denied.");
            return -1; // Indicates error
        }
    }
    
    // SETTER METHODS (PUBLIC) - Controlled modification of private data
    public void setAccountHolderName(String newName) {
        if (newName != null && !newName.trim().isEmpty()) {
            this.accountHolderName = newName;
            System.out.println("✅ Account holder name updated to: " + newName);
        } else {
            System.out.println("❌ Invalid name! Name update failed.");
        }
    }
    
    public void setAccountType(String newType) {
        if (newType.equals("Savings") || newType.equals("Current")) {
            this.accountType = newType;
            System.out.println("✅ Account type updated to: " + newType);
        } else {
            System.out.println("❌ Invalid account type! Must be 'Savings' or 'Current'");
        }
    }
    
    // PRIVATE HELPER METHOD - Internal validation
    private boolean verifyPin(int enteredPin) {
        return this.pin == enteredPin;
    }
    
    // PUBLIC METHODS for account operations with validation
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("❌ Invalid amount! Deposit amount must be positive.");
            return;
        }
        if (!isActive) {
            System.out.println("❌ Account is inactive! Cannot perform deposit.");
            return;
        }
        
        balance += amount;
        System.out.println("💰 ₹" + amount + " deposited successfully!");
        System.out.println("💳 New balance: ₹" + balance);
    }
    
    public void withdraw(double amount, int enteredPin) {
        // Multiple validations
        if (!verifyPin(enteredPin)) {
            System.out.println("❌ Invalid PIN! Withdrawal denied.");
            return;
        }
        if (amount <= 0) {
            System.out.println("❌ Invalid amount! Withdrawal amount must be positive.");
            return;
        }
        if (!isActive) {
            System.out.println("❌ Account is inactive! Cannot perform withdrawal.");
            return;
        }
        if (amount > balance) {
            System.out.println("❌ Insufficient balance! Current balance: ₹" + balance);
            return;
        }
        
        balance -= amount;
        System.out.println("💸 ₹" + amount + " withdrawn successfully!");
        System.out.println("💳 Remaining balance: ₹" + balance);
    }
    
    public void changePin(int oldPin, int newPin) {
        if (!verifyPin(oldPin)) {
            System.out.println("❌ Invalid old PIN! PIN change failed.");
            return;
        }
        if (newPin < 1000 || newPin > 9999) {
            System.out.println("❌ New PIN must be 4 digits!");
            return;
        }
        
        this.pin = newPin;
        System.out.println("🔐 PIN changed successfully!");
    }
    
    public void deactivateAccount(int enteredPin) {
        if (verifyPin(enteredPin)) {
            this.isActive = false;
            System.out.println("🔒 Account deactivated successfully!");
        } else {
            System.out.println("❌ Invalid PIN! Account deactivation failed.");
        }
    }
    
    public void activateAccount(int enteredPin) {
        if (verifyPin(enteredPin)) {
            this.isActive = true;
            System.out.println("🔓 Account activated successfully!");
        } else {
            System.out.println("❌ Invalid PIN! Account activation failed.");
        }
    }
    
    // PUBLIC METHOD to display account information
    public void displayAccountInfo() {
        System.out.println("=== ACCOUNT INFORMATION ===");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Status: " + (isActive ? "Active" : "Inactive"));
        System.out.println("Balance: [Protected - PIN required]");
        System.out.println("============================");
    }
    
    // Method to transfer money to another account
    public void transferMoney(BankAccount targetAccount, double amount, int senderPin) {
        if (!verifyPin(senderPin)) {
            System.out.println("❌ Invalid PIN! Transfer denied.");
            return;
        }
        if (amount <= 0) {
            System.out.println("❌ Invalid transfer amount!");
            return;
        }
        if (amount > balance) {
            System.out.println("❌ Insufficient balance for transfer!");
            return;
        }
        if (!isActive || !targetAccount.isAccountActive()) {
            System.out.println("❌ One or both accounts are inactive!");
            return;
        }
        
        // Perform transfer
        this.balance -= amount;
        targetAccount.balance += amount; // Direct access within same class
        
        System.out.println("💸 ₹" + amount + " transferred successfully!");
        System.out.println("From: " + this.accountHolderName + " (" + this.accountNumber + ")");
        System.out.println("To: " + targetAccount.accountHolderName + " (" + targetAccount.accountNumber + ")");
        System.out.println("Your remaining balance: ₹" + this.balance);
    }
}

// Class demonstrating poor encapsulation (for comparison)
class BadBankAccount {
    // PUBLIC VARIABLES - Can be accessed and modified directly (BAD PRACTICE)
    public String accountNumber;
    public String accountHolderName;
    public double balance;
    public int pin;
    
    public BadBankAccount(String accountNumber, String accountHolderName, double balance, int pin) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.pin = pin;
    }
}

// Class demonstrating encapsulation with a different example
class Student {
    // Private variables
    private String studentId;
    private String name;
    private int age;
    private double[] marks;
    private double gpa;
    
    public Student(String studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.marks = new double[5]; // 5 subjects
        this.gpa = 0.0;
    }
    
    // Getters
    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getGpa() { return gpa; }
    
    // Controlled setter for age
    public void setAge(int age) {
        if (age >= 5 && age <= 100) {
            this.age = age;
            System.out.println("✅ Age updated to: " + age);
        } else {
            System.out.println("❌ Invalid age! Age must be between 5 and 100.");
        }
    }
    
    // Method to add marks with validation
    public void addMarks(int subject, double marks) {
        if (subject < 0 || subject >= 5) {
            System.out.println("❌ Invalid subject number! Must be 0-4");
            return;
        }
        if (marks < 0 || marks > 100) {
            System.out.println("❌ Invalid marks! Must be 0-100");
            return;
        }
        
        this.marks[subject] = marks;
        calculateGPA(); // Automatically recalculate GPA
        System.out.println("✅ Marks added for subject " + (subject + 1) + ": " + marks);
    }
    
    // Private method to calculate GPA
    private void calculateGPA() {
        double total = 0;
        int count = 0;
        for (double mark : marks) {
            if (mark > 0) {
                total += mark;
                count++;
            }
        }
        this.gpa = count > 0 ? total / count : 0.0;
    }
    
    public void displayTranscript() {
        System.out.println("=== STUDENT TRANSCRIPT ===");
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > 0) {
                System.out.println("  Subject " + (i + 1) + ": " + marks[i]);
            }
        }
        System.out.println("GPA: " + String.format("%.2f", gpa));
        System.out.println("===========================");
    }
}

// Main class to demonstrate encapsulation
public class EncapsulationDemo {
    public static void main(String[] args) {
        System.out.println("=== ENCAPSULATION DEMONSTRATION ===\n");
        
        // PART 1: Proper Encapsulation Example
        System.out.println("🎯 PART 1: Creating Bank Accounts with Proper Encapsulation\n");
        
        BankAccount account1 = new BankAccount("ACC12345", "Rajesh Kumar", "Savings", 50000.0, 1234);
        BankAccount account2 = new BankAccount("ACC67890", "Priya Sharma", "Current", 75000.0, 5678);
        
        // PART 2: Accessing data through getters
        System.out.println("🎯 PART 2: Accessing Account Information Safely\n");
        
        System.out.println("Account holder: " + account1.getAccountHolderName());
        System.out.println("Account type: " + account1.getAccountType());
        System.out.println("Is active: " + account1.isAccountActive());
        
        // Cannot access private variables directly
        // System.out.println(account1.balance); // This would cause compilation error
        // System.out.println(account1.pin);     // This would cause compilation error
        
        // Must use getter with PIN verification
        System.out.println("Balance: ₹" + account1.getBalance(1234)); // Correct PIN
        account1.getBalance(9999); // Wrong PIN
        System.out.println();
        
        // PART 3: Modifying data through setters with validation
        System.out.println("🎯 PART 3: Modifying Data Safely Through Setters\n");
        
        account1.setAccountHolderName("Rajesh Kumar Singh");
        account1.setAccountType("Current");
        account1.setAccountType("Invalid"); // Should fail
        System.out.println();
        
        // PART 4: Account operations with validation
        System.out.println("🎯 PART 4: Performing Account Operations\n");
        
        account1.deposit(10000);
        account1.deposit(-500); // Should fail
        System.out.println();
        
        account1.withdraw(5000, 1234); // Correct PIN
        account1.withdraw(3000, 9999); // Wrong PIN
        account1.withdraw(100000, 1234); // Insufficient balance
        System.out.println();
        
        // PART 5: PIN management
        System.out.println("🎯 PART 5: PIN Management\n");
        
        account1.changePin(1234, 4321);
        account1.changePin(1234, 4567); // Old PIN is wrong now
        account1.changePin(4321, 123);  // Invalid new PIN
        System.out.println();
        
        // PART 6: Money transfer between accounts
        System.out.println("🎯 PART 6: Money Transfer Between Accounts\n");
        
        System.out.println("Before transfer:");
        System.out.println("Account 1 balance: ₹" + account1.getBalance(4321));
        System.out.println("Account 2 balance: ₹" + account2.getBalance(5678));
        System.out.println();
        
        account1.transferMoney(account2, 15000, 4321);
        System.out.println();
        
        System.out.println("After transfer:");
        System.out.println("Account 1 balance: ₹" + account1.getBalance(4321));
        System.out.println("Account 2 balance: ₹" + account2.getBalance(5678));
        System.out.println();
        
        // PART 7: Account deactivation/activation
        System.out.println("🎯 PART 7: Account Status Management\n");
        
        account1.deactivateAccount(4321);
        account1.deposit(1000); // Should fail - account inactive
        account1.activateAccount(4321);
        account1.deposit(1000); // Should work now
        System.out.println();
        
        // PART 8: Student class example
        System.out.println("🎯 PART 8: Student Class Encapsulation Example\n");
        
        Student student1 = new Student("STU001", "Amit Singh", 20);
        
        student1.addMarks(0, 85.5); // Subject 1
        student1.addMarks(1, 92.0); // Subject 2
        student1.addMarks(2, 78.5); // Subject 3
        student1.addMarks(3, 88.0); // Subject 4
        student1.addMarks(4, 95.5); // Subject 5
        
        student1.addMarks(5, 90.0); // Invalid subject
        student1.addMarks(1, 105.0); // Invalid marks
        
        student1.setAge(25);
        student1.setAge(150); // Invalid age
        
        System.out.println();
        student1.displayTranscript();
        System.out.println();
        
        // PART 9: Demonstrating problems without encapsulation
        System.out.println("🎯 PART 9: Problems Without Encapsulation (Bad Example)\n");
        
        BadBankAccount badAccount = new BadBankAccount("BAD123", "Test User", 10000, 1111);
        
        System.out.println("😈 DANGER: Direct access to sensitive data!");
        System.out.println("Anyone can access PIN: " + badAccount.pin);
        System.out.println("Anyone can modify balance directly:");
        
        badAccount.balance = 1000000; // Direct modification - VERY DANGEROUS!
        System.out.println("Balance illegally changed to: ₹" + badAccount.balance);
        
        badAccount.pin = 0000; // PIN compromised!
        System.out.println("PIN illegally changed to: " + badAccount.pin);
        
        System.out.println("\n❌ This is why encapsulation is essential!");
        
        System.out.println("\n=== DEMONSTRATION COMPLETE ===");
    }
}

/*
=== DETAILED EXPLANATION OF ENCAPSULATION ===

🔍 WHAT HAPPENED IN THIS CODE:

1. PRIVATE VARIABLES:
   • private String accountNumber, accountHolderName, etc.
   • Cannot be accessed directly from outside the class
   • Hidden from external manipulation

2. PUBLIC GETTER METHODS:
   • getAccountNumber(), getAccountHolderName(), etc.
   • Controlled read access to private data
   • Can include validation or conditions

3. PUBLIC SETTER METHODS:
   • setAccountHolderName(), setAccountType(), etc.
   • Controlled write access to private data
   • Include validation before setting values

4. PRIVATE HELPER METHODS:
   • verifyPin(), calculateGPA()
   • Internal methods not exposed to outside world
   • Used internally by public methods

5. DATA VALIDATION:
   • All setter methods validate input before setting
   • Prevents invalid data from corrupting object state
   • Ensures data integrity

6. CONTROLLED ACCESS:
   • getBalance() requires PIN verification
   • withdraw() requires PIN and sufficient balance
   • Operations have multiple security checks

📚 KEY CONCEPTS LEARNED:

• Encapsulation: Bundling data and methods together
• Data Hiding: Making variables private
• Access Control: Using getters and setters
• Validation: Checking data before setting
• Security: Protecting sensitive information
• Data Integrity: Ensuring data remains valid

🎯 IMPORTANT POINTS FOR INDIAN STUDENTS:

• Encapsulation = डेटा सुरक्षा (data security)
• Private variables = व्यक्तिगत जानकारी (personal information)
• Public methods = दरवाजे (doors to access data)
• Getters = देखने की अनुमति (permission to view)
• Setters = बदलने की अनुमति (permission to change)
• Like keeping money in bank locker with controlled access

💡 REAL-WORLD ANALOGY:

• Bank Account = Your house
• Private variables = Personal belongings inside house
• Public methods = Doors and windows (controlled entry points)
• Getters = Windows (you can see through them)
• Setters = Doors (you can enter through them)
• PIN verification = Keys/locks for security

🔑 ENCAPSULATION BENEFITS:

• DATA SECURITY: Private variables cannot be accessed directly
• VALIDATION: Control what values can be set
• MAINTENANCE: Change internal implementation without affecting users
• DEBUGGING: Easy to track where data is modified
• FLEXIBILITY: Can add validation, logging, or security later
• ABSTRACTION: Hide complex internal details

⚠️ ACCESS MODIFIERS:

• PRIVATE: Accessible only within same class
• PUBLIC: Accessible from anywhere
• PROTECTED: Accessible in same package and subclasses
• DEFAULT: Accessible within same package

🎭 GETTER vs SETTER RULES:

GETTER METHODS:
• Usually public
• Return type matches variable type
• Name starts with 'get' (e.g., getName())
• No parameters (usually)
• Read-only access

SETTER METHODS:
• Usually public
• Return type is void (usually)
• Name starts with 'set' (e.g., setName())
• Takes one parameter
• Write access with validation

🌟 ENCAPSULATION BEST PRACTICES:

• Make instance variables private
• Provide public getters for read access
• Provide public setters for write access (with validation)
• Use private helper methods for internal operations
• Validate all input in setters
• Consider immutable objects for sensitive data

🔄 ENCAPSULATION vs OTHER CONCEPTS:

ENCAPSULATION vs ABSTRACTION:
• Encapsulation: Data hiding and access control
• Abstraction: Hiding implementation complexity

ENCAPSULATION vs INHERITANCE:
• Encapsulation: Within single class (data + methods)
• Inheritance: Between multiple classes (parent-child)

🛡️ SECURITY ASPECTS:

• PIN PROTECTION: Sensitive operations require authentication
• VALIDATION: Prevent invalid data entry
• ACCESS CONTROL: Different levels of access to different data
• AUDIT TRAIL: Can add logging to track all changes
• STATE CONSISTENCY: Object always remains in valid state

💡 PRACTICAL APPLICATIONS:

• Banking Systems: Account details and transactions
• User Management: Login credentials and profile data
• E-commerce: Shopping cart and payment information
• Medical Records: Patient data with controlled access
• Employee Management: Salary and personal information

🔍 COMMON MISTAKES TO AVOID:

• Making variables public unnecessarily
• Not validating input in setters
• Forgetting to make helper methods private
• Not handling null values in setters
• Exposing mutable objects through getters
• Not documenting access restrictions
*/
