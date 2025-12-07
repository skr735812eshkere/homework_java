import pkg1.First;
import pkg1.Second;
import pkg2.Third;

public class Main {
    public static void main(String[] args){
        First first = new First();
        first.showAccessInsideClass();

        Second second = new Second();
        second.testAccess();

        Third third = new Third();
        third.testAccess();
    }
}
