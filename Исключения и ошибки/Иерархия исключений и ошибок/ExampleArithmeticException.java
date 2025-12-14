public class ExampleArithmeticException {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("error: деление на ноль");
        }
    }
}