public class ExampleNullPointerException {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length()); // обращение к null
        } catch (NullPointerException e) {
            System.out.println("error: объект равен null");
        }
    }
}
