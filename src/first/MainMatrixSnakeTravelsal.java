package first;/*����� ������� "������" � ��������� �� ����� � ���������� �����.
        ���������:
        ���
        [[ 1, 2, 3 ],
        [ 4, 5, 6 ],
        [ 7, 8, 9 ]]
        ���������
        [1, 4, 7, 8, 5, 2, 3, 6, 9]*/

import java.util.Arrays;

public class MainMatrixSnakeTravelsal {
    public static void main(String[] args) {

        int[][] input = {{1, 2, 3},
                         {4, 5, 6},
                         {7, 8, 9}};

        MatrixSnakeTraversal travelsal = new MatrixSnakeTraversal();
        System.out.println(Arrays.toString(travelsal.print(input)));
    }
}

/*class MatrixSnakeTraversal {
    public int[] print(int[][] input) {
*//*
        int output[] = {1,2,3};

        for (int i = 0; i < input.length; i++) {

        }
        return output;
    }*//**//*

        int length = input.length * input[0].length;
        int[] result = new int[length];
        int count = 0;
        for (int i = 0; i < input[0].length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < input.length; j++) {
                    if (input[j][i] > 0) {
                        result[count] = input[j][i];
                        count += 1;
                    }
                }
            } else {
                for (int j = input.length - 1; j >= 0; j--) {
                    if (input[j][i] > 0) {
                        result[count] = input[j][i];
                        count += 1;
                    }
                }
            }
        }
        return result;
    }*//*

        int h = input.length;
        int w = input[0].length;
        int top = 0;
        int right = w - 1;
        int left = 0;
        int bottom = h - 1;
        int[] array = new int[h * w];
        int k = 0;

        while (k <= (h * w) - 1) {

            for (int i = top; i <= bottom; i++) {
                array[k] = input[i][left];
                k++;
            }

            if (k <= (h * w) - 1) {
                for (int i = bottom; i >= top; i--) {
                    array[k] = input[i][left + 1];
                    k++;
                }
            }
            left += 2;
        }
    return array;
    }
}*/


class MatrixSnakeTraversal {
    public int[] print(int[][] input) {
        int massiveLength = 0, high = 0, marker = 0;
        for (int a[] : input) {
            massiveLength += a.length;
            high++;
        }

        int mass[] = new int[massiveLength];
        int count = 0;

        for (int i = 0; i < input[0].length; i++) {
            if (marker == 0) {
                for (int j = 0; j < high; j++) {
                    mass[count] = input[j][i];
                    count++;
                }
                marker = 1;
            } else {
                for (int j = high - 1; 0 <= j; j--) {
                    mass[count] = input[j][i];
                    count++;
                }
                marker = 0;
            }
        }
        return mass;

    }
}
