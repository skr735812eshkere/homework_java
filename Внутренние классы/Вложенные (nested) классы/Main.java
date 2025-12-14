public class Main {
    public static void main(String[] args) {
        // обращение через имя интерфейса
        Logger.ConsoleLogger logger = new Logger.ConsoleLogger();
        logger.log("hello");
    }
}