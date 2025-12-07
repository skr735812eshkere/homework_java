public class P3 {
    public static void main(String[] args) {
        Integer i = null;
        int j = i; // ошибка: Unboxing of 'i' may produce 'NullPointerException'
        System.out.println(i);
    }
}