public interface Printer {
    default void print(String message) {
        System.out.println("Printer: " + message);
    }
    static void information() {
        System.out.println("Статический метод Printer");
    }
}