public class CastingDemo {
    public static void main(String[] args) {
        int a = 5;
        double b = a;          // widening (implicit)
        double x = 5.9;
        int y = (int) x;       // narrowing (explicit) => 5 (precision loss)
        long big = 10_000_000_000L;
        float f = 3.14f;

        System.out.println("b=" + b + ", y=" + y + ", big=" + big + ", f=" + f);
    }
}
