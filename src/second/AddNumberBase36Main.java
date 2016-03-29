package second;

/*Дано 2 числа в системі числення з основою 36. Будь-яка цифра може бути в межах [0-9a-z].
        Повернути суму чисел, також в системі 36.
        Наприклад:
        "9" + "1" = "a"
        "z" + "1" = "10"*/

import java.util.HashMap;
import java.util.Map;

public class AddNumberBase36Main {
    public static void main(String[] args) {
        AddNumberBase36D base36 = new AddNumberBase36D();
        System.out.println(base36.add("9", "1"));
        System.out.println(base36.add("z", "1"));
    }
}

class AddNumberBase36R {
    public String add(String a, String b) {
        int intA = getCode(a);
        int intB = getCode(a);


        return null;
    }

    private int getCode(String a) {
        char charA = new StringBuffer(a).charAt(0);

        if (Character.isDigit(charA)) {

        }

        return 0;
    }
}

class AddNumberBase36A {
    public String add(String a, String b) {

        int aLength = a.length();
        int bLength = b.length();
        StringBuilder result = new StringBuilder();

        int temp = 0;

        Map<Character, Integer> abc = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            abc.put((char) ('0' + i), i);
        }

        for (int i = 0; i < 26; i++) {
            abc.put((char) ('a' + i), i + 10);
//            abc.put((char) ('A' + i), i + 10);
        }

        int i = 0;
        while (i < aLength || i < bLength) {

            char aTemp = (i < aLength) ? a.charAt(aLength - 1 - i) : '0';
            char bTemp = (i < bLength) ? b.charAt(bLength - 1 - i) : '0';

            int sum = abc.get(aTemp) + abc.get(bTemp) + temp;

            if (sum < 36) {
                result.append(fromInt(sum));
                temp = 0;

            } else {
                result.append(fromInt(sum % 36));
                temp = 1;
            }
            i++;
        }
        if (temp == 1) result.append('1');

        return result.reverse().toString();
    }

    private char fromInt(int num) {
        if (num < 10) {
            return (char) ('0' + num);

        } else return (char) ('a' + num - 10);
    }

}

class AddNumberBase36D {
    public static String add(String a, String b) {
        int temp = 0;
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> abc = new HashMap<Character, Integer>(62);

        for (int i = 0; i < 10; i++) {
        }
        for (int i = 0; i < 26; i++) {
            abc.put((char) ('a' + i), i + 10);
            if (i<10) {
                abc.put((char) ('0' + i), i);

            }
//            abc.put((char) ('A' + i), i + 10);
        }
        for (int i = 0; i < a.length() || i < b.length(); i++) {
            char aChr = (i < a.length()) ? a.charAt(a.length() - i - 1) : '0';
            char bChr = (i < b.length()) ? b.charAt(b.length() - i - 1) : '0';
            int sum = temp + abc.get(aChr) + abc.get(bChr);

            if (sum < 36) {
                result.append(getChar(sum));
                temp = 0;
            } else {
                result.append(getChar(sum % 36));
                temp = 1;
            }
        }
        if (temp == 1) {
            result.append(getChar(1));
        }
        return result.reverse().toString();
    }

    public static char getChar(int number) {
        if (number < 10) {
            return (char) ('0' + number);
        } else {
            return (char) ('a' + number - 10);
        }

    }
}