public class EnclosingClass {
    private int privateField = 11;
    protected int protectedField = 123;
    private void privateMethod() {
        System.out.println("privateMethod()");
    }

    public class Inner {
        public void accessOuter() {
            System.out.println(privateField);
            System.out.println(protectedField);
            privateMethod();
        }
    }
}
