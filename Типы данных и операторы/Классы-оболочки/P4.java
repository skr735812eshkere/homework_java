public class P4 {
    public static void main(String[] args) {
        int i1 = 128;
        Integer a1 = i1;
        Integer b1 = i1;

        System.out.println("a1==i1 " + (a1 == i1)); // true: a1 распаковывается до int (сравнение 128 == 128)
        System.out.println("b1==i1 " + (b1 == i1)); // true: аналогично
        System.out.println("a1==b1 " + (a1 == b1)); // false: два разных объекта Integer, потому что 128 вне диапазона
        System.out.println("a1.equals(i1) -> " + a1.equals(i1)); // true: equals сравнивает значения, а не объекты (128 == 128)
        System.out.println("b1.equals(i1) -> " + b1.equals(i1)); // true: аналогично
        System.out.println("a1.equals(b1) -> " + a1.equals(b1)); // true: аналогично

        int i2 = 127;
        Integer a2 = i2;
        Integer b2 = i2;
        System.out.println("a2==i2 " + (a2 == i2)); // true: a2 распаковывается до int (сравнение 127 == 127)
        System.out.println("b2==i2 " + (b2 == i2)); // true: аналогично
        System.out.println("a2==b2 " + (a2 == b2)); // true: один и тот же объект Integer, 127 внутри диапазона
        System.out.println("a2.equals(i2) -> " + a2.equals(i2)); // equals сравнивает значения, а не объекты (127 == 127)
        System.out.println("b2.equals(i2) -> " + b2.equals(i2)); // true: аналогично
        System.out.println("a2.equals(b2) -> " + a2.equals(b2)); // true: аналогчно
    }
}