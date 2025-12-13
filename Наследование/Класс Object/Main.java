public class Main{
    public static void main(String[] args) {

        Point point1 = new Point(10, 15);
        Point point2 = point1;

        boolean result = point1.equals(point2);
        System.out.println(result);    // true

        result = point1.equals(new Point(10, 15));
        System.out.println(result);    // true


        result = point1.equals("hello");
        System.out.println(result);    // false

        result = point1.equals(null);
        System.out.println(result);    // false
    }
}