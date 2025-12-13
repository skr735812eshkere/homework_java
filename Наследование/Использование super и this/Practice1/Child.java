class Child extends Parent {

    private int x;

    public Child(int parentX, int childX) {
        super(parentX);        // вызов конструктора суперкласса
        this.x = childX;
    }

    public void print() {
        System.out.println(super.x); // доступ к полю суперкласса
        super.show();                // вызов метода суперкласса
    }
}
