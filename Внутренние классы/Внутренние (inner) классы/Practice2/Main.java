public class Main {
    public static void main(String[] args){
        EnclosingClass.Inner in = new EnclosingClass().new Inner();
        in.accessOuter();
        /*
        11
        123
        privateMethod()
         */
    }
}
