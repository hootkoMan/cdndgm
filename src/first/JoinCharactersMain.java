package first;

public class JoinCharactersMain {
    public static void main(String[] args) {
        char[] input = {'1', '2', '3'};

        System.out.println(Integer.parseInt(new String(input)));
        System.out.println(JoinCharactersMain.join(input));

        System.out.println(JoinCharacters.join(input));

    }

    public static int join(char[] input) {
        int result = 0;

        for (int i = 0; i < input.length; i++) {
            result = result * 10;
            result += Character.getNumericValue(input[i]);
        }

        return result;
    }
}
//Dmitry
class JoinCharacters {
    public static int join(char[] input) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < input.length; i++) {
            str.append(input[i]);
        }

        return Integer.parseInt(str.toString());
    }
}
