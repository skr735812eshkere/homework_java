public enum Practice2 {
    ADD, SUBTRACT, MULTIPLY;


    static void calculate(int n1, int n2, Practice2 op)
    {
        switch (op)
        {
            case ADD:
                System.out.println(n1 + n2);
                break;
            case SUBTRACT:
                System.out.println(n1 - n2);
                break;
            case MULTIPLY:
                System.out.println(n1 * n2);
                break;
        }
    }
    public static void main(String[] args){
        Practice2.calculate(5, 3, ADD);
    }

};
