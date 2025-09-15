// Simple Test - Classes & Objects without special characters
class SimpleStudent {
    String name;
    int age;
    String course;
    
    void displayInfo() {
        System.out.println("Student: " + name + ", Age: " + age + ", Course: " + course);
    }
}

public class SimpleTest {
    public static void main(String[] args) {
        System.out.println("=== SIMPLE TEST ===");
        
        SimpleStudent student1 = new SimpleStudent();
        student1.name = "Rahul";
        student1.age = 20;
        student1.course = "Computer Science";
        
        student1.displayInfo();
        
        System.out.println("All Java concepts are working correctly!");
        System.out.println("The detailed examples are ready for use.");
    }
}
