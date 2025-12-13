public class Practice1 {

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

        Wrapper<String> w = new Wrapper<>();
        w.setItem("hello");

        if (w instanceof Wrapper && w.getItem() instanceof String) {
            System.out.println("Wrapper содержит String");
        }

    }
}