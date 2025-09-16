public class MultiCatchDemo {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);       // ArrayIndexOutOfBoundsException
            int result = 10 / 0;              // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Division error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array error: " + e.getMessage());
        }
    }
}
