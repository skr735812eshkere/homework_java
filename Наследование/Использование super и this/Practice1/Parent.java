class Parent {

    protected int x;

    public Parent(int x) {
        this.x = x;
        System.out.println("Конструктор Parent");
    }

    public void show() {
        System.out.println("Метод Parent, x = " + x);
    }
}