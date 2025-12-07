package pkg1;

public class First {
    private String privateField = "private";
    String defaultField = "default";
    protected String protectedField = "protected";
    public String publicField = "public";

    public void showAccessInsideClass() {
        System.out.println("внутри First:");
        System.out.println(privateField);
        System.out.println(defaultField);
        System.out.println(protectedField);
        System.out.println(publicField);
    }
}