public class P1 {
    public static void main(String[] args) {
        String decimal = "10";
        String hexa = "0X14";
        String octal = "036";

        // конвертирует десятичные, шеснадцатеричные и восмеричные значения, используя метод decode()
        Integer number = Integer.decode(decimal);
        System.out.println("Decimal [" + decimal + "] = " + number);

        number = Integer.decode(hexa);
        System.out.println("Hexa [" + hexa + "] = " + number);

        number = Integer.decode(octal);
        System.out.println("Octal [" + octal + "] = " + number);
    }
}