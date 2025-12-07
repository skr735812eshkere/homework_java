public class Main {
    public static void main(String[] args){
        Person person = new Person("nastya");
        person.print();

        Employee employee = new Employee("nastya", "c&c");
        employee.print();
    }
}
