/*
Оператор instanceof нужен, чтобы проверить,
был ли объект, на который ссылается переменная,
создан на основе какого-либо класса.
более применима при наследовании
 */

public class Pr2 {

    public static void main(String[] args) {

        Integer x = new Integer(22);

        System.out.println(x instanceof Integer);
    }
}