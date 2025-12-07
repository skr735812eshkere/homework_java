package pkg2;
import pkg1.First;
public class Third extends First {
    public void testAccess() {
        System.out.println("в другом пакете класс-наследник:");
        // System.out.println(privateField);   // не доступен нигде
        // System.out.println(defaultField);   // не доступен, доступен только в pkg1
        System.out.println(protectedField);     // доступен
        System.out.println(publicField);        // доступен
    }
}