// Объекты подкласса должны быть заменяемы объектами суперкласса без изменения корректности работы программы
public class Main {
    public static void makeItSound(Animal animal) {
        animal.makeSound();
    }

    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Dog dog = new Dog();

        makeItSound(genericAnimal);
        makeItSound(dog);
    }
}
