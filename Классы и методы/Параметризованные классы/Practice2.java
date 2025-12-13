public class Practice2 {

    static class Wrapper<T> {
        private T item;

        public void setItem(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }
    }

    public static void main(String[] args) {

        Wrapper<? extends Number> w1 = new Wrapper<Integer>();
        Number n = w1.getItem();
        System.out.println("extends:" + n);

        Wrapper<? super Integer> w2 = new Wrapper<Number>();
        w2.setItem(10);
        Object obj = w2.getItem();
        System.out.println("super: " + obj);

    }
}

