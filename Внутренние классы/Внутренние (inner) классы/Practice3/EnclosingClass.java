public class EnclosingClass {

    public class Inner {
        private int privateinner = 8642;
        private void privateinnerMethod() {
            System.out.println("privateinnerMethod()");
        }
    }
    public void accessInner() {
        Inner inner = new Inner();
        System.out.println(inner.privateinner);
        inner.privateinnerMethod();
    }
}