public class ExampleClassCastException {
    public static void main(String[] args) {
        try {
            Object obj = "hello";
            Integer num = (Integer) obj; // неверное приведение типов
        } catch (ClassCastException e) {
            System.out.println("ошибка приведения типов");
        }
    }
}
