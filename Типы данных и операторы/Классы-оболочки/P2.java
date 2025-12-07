public class P2 {
    public static void main(String[] args) {
//        автоупаковка
        Boolean b1 = true;
        Boolean b2 = false;

//        Boolean.valueOf(boolean)
        Boolean b3 = Boolean.valueOf(true);

//        Boolean.valueOf(string)
        Boolean b4 = Boolean.valueOf("true");
        Boolean b5 = Boolean.valueOf("FALSE");

//        парсинг строки
        boolean primitive = Boolean.parseBoolean("true");
        Boolean b6 = primitive; // автоупаковка
    }
}