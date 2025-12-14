public class EnclosingClass {
    private int x = 23;

    public class PublicInner {
        public void print() {
            System.out.println("PublicInner: x = " + x);
        }
    }

    protected class ProtectedInner {
        void print() {
            System.out.println("ProtectedInner: x = " + x);
        }
    }

    class DefaultInner {
        void print() {
            System.out.println("DefaultInner: x = " + x);
        }
    }

    private class PrivateInner {
        void print() {
            System.out.println("PrivateInner: x = " + x);
        }
    }

    public void usePrivateInner() {
        PrivateInner pi = new PrivateInner();
        pi.print();
    }
}
