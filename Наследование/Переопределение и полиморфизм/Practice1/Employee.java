class Employee extends Person{
    private String company;
    Employee(String name, String company) {
        super(name);
        this.company = company;
    }
    @Override
    void print(){
        super.print();
        System.out.println("Company: " + company);
    }
}