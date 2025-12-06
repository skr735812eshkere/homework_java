public static void main(String[] args){
    int a = 11;
    int b = 2;
    String c = "types of ";
    String d = "data";
    c += d;
    System.out.println("конкатенация String: \n\"types of \" + \" data\" = " + c);

//    бинарные операции
    System.out.println("\nбинарные операции \na / b = " + (double)a / b);
    System.out.println("a * b = " + (a * b));
    System.out.println("a % b = " + (a % b));
    System.out.println("a - b = " + (a - b));
    System.out.println("a + b = " + (a + b));

//    комбинация присваивания с другими операциями
    a += b;
    System.out.println("\nкомбинации присваивания с другими операциями: \na += b => a = " + a);
    a -= b;
    System.out.println("a -= b => a = " + a);
    a *= b;
    System.out.println("a *= b => a = " + a);
    a /= b;
    System.out.println("a /= b => a = " + a);


//    поразрядные операции
    System.out.println("\nпоразрядные операции: \nконъюнкция: " + (a & b)); // 1011 & 0010 = 0010
    System.out.println("дизъюнкция: " + (a | b)); // 1011 | 0010 = 1011
    System.out.println("отрицание: " + (~b)); // ~0010 = -~(1101 - 1) = -0011
    System.out.println("XOR: " + (a ^ b)); // 1011 ^ 0010 = 1001
    System.out.println("сдвиг на b разрядов влево: " + (a << b)); // 1011 << 2 = 101100
    System.out.println("сдвиг на b разрядов вправо: " + (a >> b)); // 1011 >> 2 = 10
    System.out.println("беззнаковый сдвиг на b разрядов вправо: " + (~b >>> a)); // 0011 >>> 11 = 0001 1111 1111 1111 1111 1111

//    операции сравнения
    System.out.println("\nоперации сравнения: \na < b: " + (a < b));
    System.out.println("a > b: " + (a > b));
    System.out.println("3 > = b: " + (3 >= b));
    System.out.println("a < = 11: " + (a <= 11));
    System.out.println("тернарый оператор: a > b ? a - b : a + b = " + (a > b ? a - b : a + b));
    System.out.println("a == b: " + (a == b));
    System.out.println("a != b: " + (a != b));

//    инкремент и декремент
    b = ++a;
    System.out.println("\nинкремент и декремент \nпрефиксный инкремент: " + "b = " + b + "; a = " + a);
    b = --a;
    System.out.println("префиксный декремент: " + "b = " + b + "; a = " + a);
    b = a++;
    System.out.println("постфиксный инкремент: " + "b = " + b + "; a = " + a);
    b = a--;
    System.out.println("постфиксный декремент: " + "b = " + b + "; a = " + a);
    a = b;
    System.out.println("присваивание: a = b => a = "+ a);

//    логические операции
    boolean e = (5 > 6) || (4 < 6);
    boolean f = (50 > 6) && (4 / 2 < 3);
    boolean g = (50 > 6) ^ (4 / 2 < 3);
    System.out.println("\nлогические операции \ne = (5 > 6) || (4 < 6) = " + e + "\nf = (50 > 6) && (4 / 2 < 3) = " + f + "\ng = (50 > 6) ^ (4 / 2 < 3) = " + g);
}