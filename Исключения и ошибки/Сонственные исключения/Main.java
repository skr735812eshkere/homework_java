public class Main {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (MyFirstException e) {
            System.out.println("ошибка: " + e.getMessage());
        }
    }

    static void checkAge(int age) throws MyFirstException {
        if (age < 18) {
            throw new MyFirstException("возраст должен быть не меньше 18 лет");
        }
        System.out.println("доступ разрешен");
    }
}
