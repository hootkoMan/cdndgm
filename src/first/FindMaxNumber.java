package first;

public class FindMaxNumber {
    public static void main(String[] args) {
        int input[] = {1, 2, -5, 3, };

/*        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < input.length; i++) {

            maxNum = (maxNum > input[i]) ? maxNum : input[i];
                    System.out.println(maxNum);;

        }*/

        int maxInt = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] > maxInt) {
                maxInt = input[i];
            }
        }
        System.out.println(maxInt);
    }
}
