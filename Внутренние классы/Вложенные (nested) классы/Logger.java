public interface Logger {
    class ConsoleLogger {
        public void log(String message) {
            System.out.println("LOG: " + message);
        }
    }
}