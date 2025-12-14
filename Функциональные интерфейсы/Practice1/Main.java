public class Main {
    public static void main(String[] args) {

        ConsolePrinter cp = new ConsolePrinter();
        Printer p = new ConsolePrinter();

        // default-метод через объект класса
        cp.print("Hello через объект класса");

        // default-метод через ссылку интерфейса
        p.print("hello через ссылку интерфейса");

        // статический метода интерфейса
        Printer.information();

        // cp.information();
        // p.information();
    }
}