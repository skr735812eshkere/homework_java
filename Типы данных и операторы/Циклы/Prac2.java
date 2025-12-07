public class Prac2 {
    public static void main(String[] args){
        int result = 0;
        for(int i = 1 ; i < 10; i++) {
            result += i;
            System.out.println(result);
            if (result > 20) break;
        }
    }
}
