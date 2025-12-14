public class Main {
    public static void main(String[] args) {
        // доступен везде
        EnclosingClass.PublicInner publicinner = new EnclosingClass().new PublicInner(); // PublicInner: x = 23
        publicinner.print();

        // доступен в пакете и подклассам
        EnclosingClass.ProtectedInner protectedinner = new EnclosingClass().new ProtectedInner(); // ProtectedInner: x = 23
        protectedinner.print();

        // доступен только в пакете
        EnclosingClass.DefaultInner defaultinner = new EnclosingClass().new DefaultInner(); // DefaultInner: x = 23
        defaultinner.print();

        /*
        не скомпилируется, т.к. доступен только внутри внешнего класса
        EnclosingClass.PublicInner privateinner = new EnclosingClass().new PrivateInner();
        privateinner.print();
        */

        EnclosingClass privateinner = new EnclosingClass();
        privateinner.usePrivateInner(); // PrivateInner: x = 23
    }
}
