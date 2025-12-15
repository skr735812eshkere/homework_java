import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/data.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    System.out.println("Int: " + number);
                } else if (scanner.hasNextDouble()) {
                    double d = scanner.nextDouble();
                    System.out.println("Double: " + d);
                } else {
                    String str = scanner.next();
                    System.out.println("String: " + str);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}