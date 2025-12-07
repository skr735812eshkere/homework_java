public class Overloading {
    public static void sum(int a, int b){
        System.out.println(a + b);
    }
    public static void sum(int c, int d, int e){
        System.out.println(c + d + e);
    }

    public static void main(String[] args){
        sum(5, 3, 4);
    }
}
