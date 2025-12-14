// C inherits unrelated defaults for sayHello() from types A and B
public class C implements A, B{
    @Override
    // явное переопределение
    public void sayHello() {
        A.super.sayHello();
    }
}
