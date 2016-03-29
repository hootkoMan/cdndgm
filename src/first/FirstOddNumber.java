package first;/*����� ������� �����

������ ����� ������� ����� � ��������� ���� ������.
���� ������ ����, ��������� -1*/


public class FirstOddNumber {
    public static void main(String[] args) {
        int [] input = {3, 4, 1 };

        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 1) {
                System.out.println(i);;
            }
        }

        System.out.println(-1);;

    }
}
