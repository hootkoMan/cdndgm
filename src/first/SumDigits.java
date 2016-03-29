package first;/*
���� ����
        ��������� ���� ���� �����.
        ��������� ���� ���� ����� 123 �������  6.*/

public class SumDigits {
    public static void main(String[] args) {

        int number = 23;

        int sum = 0;

        while (number !=0){
                 sum += number %10;
                 number = number/10;
        }

        System.out.println(Math.abs(sum));


/*        long digit=number;
        if (digit<0)  digit*= -1;

        int subm = 10;
        int count=0;

        while (digit>0){
            count+=digit%subm;
            digit=digit/subm;
//            subm=10;
        }

        System.out.println(count);*/
    }
}
