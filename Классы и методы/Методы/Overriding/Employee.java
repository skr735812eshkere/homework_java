// класс-наследник
public class Employee extends Person {
//    унаследованный конструктор с новым параметром "компания"
    Employee(String username, String userCompany){
        super(username); // вызов конструктора базового класса
        name = username;
        company = userCompany;
    }
    private String company;
    @Override
//    переопределенная функция
    void print(){
        System.out.println("Имя: " + name + "\nКомпания: " + company);
    }

}
