package second;
/*Додайте два беззнакових числа, що передаються як рядки.
        "101" + "100" = "1001"*/

public class AddBinaryMain {
    public static void main(String[] args) {
        AddBinary addBinary = new AddBinary();
        System.out.println(addBinary.add("101", "100"));
    }
}
class AddBinary {
    String add(String a, String b) {
        return Long.toBinaryString(Long.parseLong(a, 2) + Long.parseLong(b, 2));
    }
}