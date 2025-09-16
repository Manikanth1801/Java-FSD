public class FinallyBlockDemo {
    public static void main(String[] args) {
        try {
            int result = 20 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        } finally {
            System.out.println("This will always execute!");
        }
    }
}
