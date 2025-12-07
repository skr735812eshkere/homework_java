package pkg1;

public class Second {
    public void testAccess() {
        First first = new First();

        System.out.println("внутри пакета pkg1 другой класс:");
        // System.out.println(a.privateField);  // не доступен
        System.out.println(first.defaultField); // доступен
        System.out.println(first.protectedField); // доступен
        System.out.println(first.publicField); // доступен
    }
}
