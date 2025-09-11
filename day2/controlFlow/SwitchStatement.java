// Switch Statement in Java
// Alternative to if-else ladder for multiple choices

public class SwitchStatement {
    public static void main(String[] args) {
        // Basic switch statement
        System.out.println("--- Basic Switch Statement ---");
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
        
        // Switch with char
        System.out.println("\n--- Switch with Character ---");
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Excellent! 90-100%");
                break;
            case 'B':
                System.out.println("Good! 80-89%");
                break;
            case 'C':
                System.out.println("Average! 70-79%");
                break;
            case 'D':
                System.out.println("Below Average! 60-69%");
                break;
            case 'F':
                System.out.println("Fail! Below 60%");
                break;
            default:
                System.out.println("Invalid grade");
        }
        
        // Switch without break (fall-through)
        System.out.println("\n--- Switch Fall-through Example ---");
        int month = 4;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Invalid month";
        }
        System.out.println("Month " + month + " is in " + season);
        
        // Calculator using switch
        System.out.println("\n--- Simple Calculator ---");
        int num1 = 10;
        int num2 = 5;
        char operator = '+';
        double result = 0;
        boolean validOperation = true;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = (double) num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                    validOperation = false;
                }
                break;
            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Error: Division by zero");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Invalid operator");
                validOperation = false;
        }
        
        if (validOperation) {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
        
        // Switch with String (Java 7+)
        System.out.println("\n--- Switch with String ---");
        String fruit = "apple";
        switch (fruit.toLowerCase()) {
            case "apple":
                System.out.println("Apple: Rich in fiber and vitamin C");
                break;
            case "banana":
                System.out.println("Banana: High in potassium");
                break;
            case "orange":
                System.out.println("Orange: Excellent source of vitamin C");
                break;
            case "mango":
                System.out.println("Mango: Rich in vitamin A and C");
                break;
            default:
                System.out.println("Fruit information not available");
        }
        
        // Menu-driven program
        System.out.println("\n--- Menu Selection Example ---");
        int choice = 2;
        System.out.println("Menu:");
        System.out.println("1. Start Game");
        System.out.println("2. Load Game");
        System.out.println("3. Settings");
        System.out.println("4. Exit");
        System.out.println("Selected option: " + choice);
        
        switch (choice) {
            case 1:
                System.out.println("Starting new game...");
                break;
            case 2:
                System.out.println("Loading saved game...");
                break;
            case 3:
                System.out.println("Opening settings...");
                break;
            case 4:
                System.out.println("Exiting game...");
                break;
            default:
                System.out.println("Invalid choice! Please select 1-4");
        }
    }
}

// Save as SwitchStatement.java
// To run: java SwitchStatement.java
