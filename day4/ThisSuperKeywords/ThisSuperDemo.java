// This and Super Keywords Demo - Understanding Self and Parent References
// This program demonstrates the usage of 'this' and 'super' keywords

// PARENT CLASS demonstrating 'super' usage
class Person {
    protected String name;
    protected int age;
    protected String address;
    
    // Parent constructor
    public Person(String name, int age, String address) {
        this.name = name;     // 'this' refers to current object
        this.age = age;       // 'this' distinguishes parameter from instance variable
        this.address = address;
        System.out.println("👤 Person constructor called for: " + name);
    }
    
    // Parent methods
    public void introduce() {
        System.out.println("🙋 Hi! I'm " + this.name + ", " + this.age + " years old");
        System.out.println("📍 I live at: " + this.address);
    }
    
    public void celebrate() {
        System.out.println("🎉 " + this.name + " is celebrating!");
    }
    
    public void work() {
        System.out.println("💼 " + this.name + " is working");
    }
    
    public void displayPersonInfo() {
        System.out.println("=== PERSON INFORMATION ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

// CHILD CLASS demonstrating 'this' and 'super' keywords
class Student extends Person {
    private String studentId;
    private String course;
    private double gpa;
    private String university;
    
    // Constructor using 'super' to call parent constructor
    public Student(String name, int age, String address, String studentId, String course, String university) {
        // 'super' MUST be the first statement in child constructor
        super(name, age, address);  // Calling parent constructor
        
        // 'this' refers to current Student object
        this.studentId = studentId;
        this.course = course;
        this.university = university;
        this.gpa = 0.0;
        
        System.out.println("🎓 Student constructor called for: " + name);
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Course: " + this.course);
        System.out.println("University: " + this.university + "\n");
    }
    
    // Method overriding with 'super' usage
    @Override
    public void introduce() {
        // Calling parent's introduce method using 'super'
        super.introduce();
        // Adding student-specific information
        System.out.println("🎓 I'm a student at " + this.university);
        System.out.println("📚 Studying " + this.course);
        System.out.println("🏆 Current GPA: " + this.gpa);
    }
    
    @Override
    public void celebrate() {
        // Calling parent's celebrate method
        super.celebrate();
        // Adding student-specific celebration
        System.out.println("🎊 Celebrating academic achievements!");
    }
    
    @Override
    public void work() {
        // Completely overriding parent's work method
        System.out.println("📖 " + this.name + " is studying hard for exams");
        System.out.println("💻 Working on assignments and projects");
    }
    
    // Method demonstrating 'this' for method chaining
    public Student setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
            System.out.println("✅ GPA updated to: " + this.gpa);
        } else {
            System.out.println("❌ Invalid GPA! Must be between 0.0 and 4.0");
        }
        return this;  // Returning 'this' for method chaining
    }
    
    public Student setCourse(String course) {
        this.course = course;
        System.out.println("✅ Course updated to: " + this.course);
        return this;  // Method chaining
    }
    
    // Method using 'this' to call another method in same class
    public void displayCompleteInfo() {
        System.out.println("\n=== COMPLETE STUDENT INFORMATION ===");
        
        // Using 'super' to call parent method
        super.displayPersonInfo();
        
        // Adding student-specific information
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Course: " + this.course);
        System.out.println("University: " + this.university);
        System.out.println("GPA: " + this.gpa);
        System.out.println("====================================\n");
        
        // Using 'this' to call another method in same class
        this.displayStudentStats();
    }
    
    private void displayStudentStats() {
        System.out.println("📊 ACADEMIC STATS:");
        if (this.gpa >= 3.5) {
            System.out.println("🌟 Excellent performance!");
        } else if (this.gpa >= 3.0) {
            System.out.println("👍 Good performance!");
        } else if (this.gpa >= 2.0) {
            System.out.println("📈 Need improvement!");
        } else {
            System.out.println("⚠️ Academic probation!");
        }
    }
    
    // Method demonstrating 'this' as parameter
    public void compareWith(Student other) {
        System.out.println("\n🔍 COMPARING STUDENTS:");
        System.out.println("This student: " + this.name + " (GPA: " + this.gpa + ")");
        System.out.println("Other student: " + other.name + " (GPA: " + other.gpa + ")");
        
        if (this.gpa > other.gpa) {
            System.out.println("✅ " + this.name + " has better GPA");
        } else if (this.gpa < other.gpa) {
            System.out.println("✅ " + other.name + " has better GPA");
        } else {
            System.out.println("🤝 Both students have same GPA");
        }
    }
}

// GRANDCHILD CLASS demonstrating multi-level inheritance with 'super'
class GraduateStudent extends Student {
    private String researchTopic;
    private String advisor;
    private String thesis;
    
    public GraduateStudent(String name, int age, String address, String studentId, 
                          String course, String university, String researchTopic, String advisor) {
        // Calling parent (Student) constructor using 'super'
        super(name, age, address, studentId, course, university);
        
        this.researchTopic = researchTopic;
        this.advisor = advisor;
        this.thesis = "In Progress";
        
        System.out.println("🎯 Graduate Student constructor called");
        System.out.println("Research Topic: " + this.researchTopic);
        System.out.println("Advisor: " + this.advisor + "\n");
    }
    
    @Override
    public void introduce() {
        // Calling grandparent method through parent
        super.introduce();  // This calls Student's introduce(), which calls Person's introduce()
        
        // Adding graduate-specific information
        System.out.println("🔬 Research Topic: " + this.researchTopic);
        System.out.println("👨‍🏫 Research Advisor: " + this.advisor);
        System.out.println("📋 Thesis Status: " + this.thesis);
    }
    
    @Override
    public void work() {
        // Calling parent's work method
        super.work();
        // Adding graduate-specific work
        System.out.println("🔬 Conducting research on: " + this.researchTopic);
        System.out.println("📝 Writing thesis under guidance of: " + this.advisor);
    }
    
    public void submitThesis() {
        this.thesis = "Submitted";
        System.out.println("📄 Thesis submitted successfully!");
        System.out.println("🎉 " + this.name + " has completed graduate requirements!");
    }
}

// Class demonstrating constructor chaining with 'this'
class Rectangle {
    private double length;
    private double width;
    private String color;
    private boolean filled;
    
    // Constructor 1: Only dimensions
    public Rectangle(double length, double width) {
        this(length, width, "White");  // Calls constructor 2
        System.out.println("🔲 Rectangle created with dimensions only");
    }
    
    // Constructor 2: Dimensions and color
    public Rectangle(double length, double width, String color) {
        this(length, width, color, false);  // Calls constructor 3
        System.out.println("🔲 Rectangle created with dimensions and color");
    }
    
    // Constructor 3: All parameters (main constructor)
    public Rectangle(double length, double width, String color, boolean filled) {
        this.length = length;
        this.width = width;
        this.color = color;
        this.filled = filled;
        System.out.println("🔲 Rectangle created with all parameters");
        System.out.println("Dimensions: " + length + " x " + width);
        System.out.println("Color: " + color);
        System.out.println("Filled: " + filled + "\n");
    }
    
    // Method demonstrating 'this' for returning current object
    public Rectangle setColor(String color) {
        this.color = color;
        return this;  // Returns current object for method chaining
    }
    
    public Rectangle setFilled(boolean filled) {
        this.filled = filled;
        return this;  // Method chaining
    }
    
    public void displayRectangle() {
        System.out.println("Rectangle Info: " + this.length + " x " + this.width + 
                          ", Color: " + this.color + ", Filled: " + this.filled);
    }
    
    // Method showing 'this' to resolve name conflicts
    public void updateDimensions(double length, double width) {
        // Without 'this', these would refer to parameters
        this.length = length;  // this.length = instance variable
        this.width = width;    // width = parameter
        System.out.println("✅ Dimensions updated to: " + this.length + " x " + this.width);
    }
}

// Main class to demonstrate 'this' and 'super'
public class ThisSuperDemo {
    public static void main(String[] args) {
        System.out.println("=== THIS AND SUPER KEYWORDS DEMONSTRATION ===\n");
        
        // PART 1: Basic inheritance with 'super' constructor call
        System.out.println("🎯 PART 1: Creating Student (demonstrates 'super' in constructor)\n");
        
        Student student1 = new Student("Rahul Sharma", 20, "123 Delhi Street", 
                                     "STU001", "Computer Science", "IIT Delhi");
        
        // PART 2: Method overriding with 'super' method calls
        System.out.println("🎯 PART 2: Method Overriding with 'super' calls\n");
        
        System.out.println("--- Student Introduction (uses 'super') ---");
        student1.introduce();
        System.out.println();
        
        System.out.println("--- Student Celebration (uses 'super') ---");
        student1.celebrate();
        System.out.println();
        
        System.out.println("--- Student Work (completely overridden) ---");
        student1.work();
        System.out.println();
        
        // PART 3: Method chaining using 'this'
        System.out.println("🎯 PART 3: Method Chaining with 'this'\n");
        
        student1.setGpa(3.8).setCourse("Data Science");
        System.out.println();
        
        // PART 4: Using 'this' to call other methods
        System.out.println("🎯 PART 4: Complete Info (uses 'this' and 'super')\n");
        
        student1.displayCompleteInfo();
        
        // PART 5: Creating another student for comparison
        System.out.println("🎯 PART 5: Student Comparison (demonstrates 'this' as parameter)\n");
        
        Student student2 = new Student("Priya Singh", 19, "456 Mumbai Road", 
                                     "STU002", "Electronics", "IIT Bombay");
        student2.setGpa(3.9);
        
        student1.compareWith(student2);
        System.out.println();
        
        // PART 6: Multi-level inheritance with Graduate Student
        System.out.println("🎯 PART 6: Graduate Student (Multi-level 'super' usage)\n");
        
        GraduateStudent gradStudent = new GraduateStudent(
            "Dr. Amit Kumar", 25, "789 Chennai Avenue", "GRAD001", 
            "PhD Computer Science", "IIT Madras", 
            "Machine Learning in Healthcare", "Prof. Rajesh"
        );
        
        System.out.println("--- Graduate Student Introduction ---");
        gradStudent.introduce();
        System.out.println();
        
        System.out.println("--- Graduate Student Work ---");
        gradStudent.work();
        System.out.println();
        
        gradStudent.submitThesis();
        System.out.println();
        
        // PART 7: Constructor chaining with 'this'
        System.out.println("🎯 PART 7: Constructor Chaining with 'this'\n");
        
        System.out.println("Creating rectangles with different constructors:");
        
        Rectangle rect1 = new Rectangle(5.0, 3.0);  // Calls constructor chain
        Rectangle rect2 = new Rectangle(8.0, 4.0, "Blue");  // Calls constructor chain
        Rectangle rect3 = new Rectangle(10.0, 6.0, "Red", true);  // Direct call
        
        // PART 8: Method chaining with Rectangle
        System.out.println("🎯 PART 8: Method Chaining with Rectangle\n");
        
        rect1.setColor("Green").setFilled(true);
        rect1.displayRectangle();
        System.out.println();
        
        // PART 9: Demonstrating 'this' for name conflict resolution
        System.out.println("🎯 PART 9: Name Conflict Resolution with 'this'\n");
        
        rect2.updateDimensions(12.0, 8.0);
        rect2.displayRectangle();
        System.out.println();
        
        // PART 10: Summary of 'this' and 'super' usage
        System.out.println("🎯 PART 10: Summary\n");
        
        System.out.println("✅ 'super' keyword usage demonstrated:");
        System.out.println("   - super() for calling parent constructor");
        System.out.println("   - super.method() for calling parent methods");
        System.out.println("   - Used in method overriding to extend functionality");
        System.out.println();
        
        System.out.println("✅ 'this' keyword usage demonstrated:");
        System.out.println("   - this.variable for referring to instance variables");
        System.out.println("   - this() for constructor chaining");
        System.out.println("   - this.method() for calling current object methods");
        System.out.println("   - return this for method chaining");
        System.out.println("   - this as parameter for object comparison");
        
        System.out.println("\n=== DEMONSTRATION COMPLETE ===");
    }
}

/*
=== DETAILED EXPLANATION OF THIS AND SUPER KEYWORDS ===

🔍 WHAT HAPPENED IN THIS CODE:

1. 'super' KEYWORD USAGE:
   • super() - Calls parent class constructor (must be first statement)
   • super.method() - Calls parent class method
   • super.variable - Accesses parent class variable
   • Used in inheritance to access parent functionality

2. 'this' KEYWORD USAGE:
   • this.variable - Refers to current object's instance variable
   • this() - Calls another constructor in same class
   • this.method() - Calls method of current object
   • return this - Returns current object reference
   • this as parameter - Passes current object to other methods

3. CONSTRUCTOR CHAINING:
   • this() calls - One constructor calling another in same class
   • super() calls - Child constructor calling parent constructor
   • Creates chain of initialization calls

4. METHOD OVERRIDING WITH SUPER:
   • Child method calls parent method using super.methodName()
   • Allows extending parent functionality rather than replacing
   • Maintains parent behavior while adding child-specific features

5. NAME CONFLICT RESOLUTION:
   • this.variable distinguishes instance variable from parameter
   • Essential when parameter and instance variable have same name
   • Prevents ambiguity in variable references

📚 KEY CONCEPTS LEARNED:

• this: Reference to current object
• super: Reference to parent class
• Constructor Chaining: Linking constructor calls
• Method Chaining: Returning this for fluent interface
• Name Resolution: Distinguishing between variables
• Inheritance Navigation: Moving between parent and child functionality

🎯 IMPORTANT POINTS FOR INDIAN STUDENTS:

• 'this' = स्वयं (myself/current object)
• 'super' = माता-पिता (parent/super class)
• this() = अपने ही दूसरे constructor को बुलाना
• super() = parent के constructor को बुलाना
• Like calling yourself vs calling your parents
• Used to avoid confusion and access specific functionality

💡 REAL-WORLD ANALOGY:

• 'this' = Talking about yourself
  - "I am doing this" (this.work())
  - "My name is..." (this.name)

• 'super' = Talking about your parents
  - "My father taught me this" (super.work())
  - "I learned this from my mother" (super.introduce())

🔑 USAGE SCENARIOS:

'this' KEYWORD:
• Parameter shadows instance variable
• Constructor chaining within same class
• Method chaining for fluent interface
• Passing current object as parameter
• Explicit reference to current object

'super' KEYWORD:
• Calling parent constructor
• Accessing overridden parent methods
• Accessing parent class variables
• Multi-level inheritance navigation
• Extending parent functionality

⚠️ IMPORTANT RULES:

'super()' RULES:
• Must be first statement in constructor
• Cannot be used in static context
• Calls immediate parent constructor only
• If not written, Java automatically adds super()

'this()' RULES:
• Must be first statement in constructor
• Cannot be used with super() in same constructor
• Creates constructor chaining within same class
• Cannot create circular constructor calls

🎭 'this' vs 'super' COMPARISON:

'this':
• Refers to current object
• Used within same class
• Accesses current class members
• For constructor chaining in same class
• Can be used in static methods (with object reference)

'super':
• Refers to parent class
• Used in inheritance
• Accesses parent class members
• For calling parent constructor
• Cannot be used in static context

🌟 ADVANCED USAGE:

METHOD CHAINING WITH 'this':
• return this; enables fluent interface
• object.method1().method2().method3()
• Common in builder patterns
• Makes code more readable

SUPER IN MULTI-LEVEL INHERITANCE:
• super calls immediate parent only
• For grandparent access, go through parent
• Each level must provide access to upper levels

🔄 CONSTRUCTOR CALL SEQUENCE:

1. Child constructor called
2. super() or this() executed first
3. If super(), parent constructor runs
4. Parent may call its parent (chain continues)
5. After parent completes, child constructor body executes
6. Object initialization complete

💡 PRACTICAL APPLICATIONS:

• Framework Development: Base classes with extension points
• GUI Programming: Widget inheritance hierarchies
• Database ORM: Entity inheritance mapping
• Game Development: Character class hierarchies
• Design Patterns: Template method, Factory patterns

🛠️ DEBUGGING TIPS:

• Use this.variable to be explicit about instance variables
• Use super.method() to ensure parent method is called
• Constructor chaining helps avoid code duplication
• Method chaining improves code readability
• Always handle null checks when using this as parameter

🔍 COMMON MISTAKES TO AVOID:

• Forgetting super() in constructor (if parent has no default constructor)
• Using this() and super() together in same constructor
• Circular constructor chaining with this()
• Not understanding constructor call order
• Confusing this.variable with local variable
• Using super in static context
*/
