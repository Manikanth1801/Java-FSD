public class DivideByZeroDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // risky
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        System.out.println("Program continues...");
    }
}
