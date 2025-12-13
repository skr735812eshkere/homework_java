// базовый класс
public class Person {
    Person(String username){ // конструктор с параметром
        name = username;
    }
    protected String name; // спецификатор protected, чтобы дать доступ классам-наследникам

    // дефолтная принт
    void print(){
        System.out.println("Имя: " + name);
    }
}
