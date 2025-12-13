public class Main {
    @Override
    public void main(String[] args){
        Parent p = new Child();
        /*
        без @Override:
        "Суперкласс: 10"

        c @Override:
        "Method does not override method from its superclass"
         */
        p.print(10);
    }
}
