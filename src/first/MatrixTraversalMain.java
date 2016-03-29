package first;/*
����� ������� �� �����

        ����� ������� �� ����� � �������� �� ����� � ������� �����.
        ��� �������
        [[1,   2,  3,  4],
        [5,   6,  7,  8]
        [9,  10, 11, 12]
        [13, 14, 15, 16]]
        ������� [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
*/


import java.util.Arrays;

public class MatrixTraversalMain {
    public static void main(String[] args) {
        MatrixTraversal mt = new MatrixTraversal();
        int[][] input = {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};

        System.out.println(Arrays.toString(mt.print(input)));
    }
}

/*class MatrixTraversal {
    public int[] print(int[][] input) {
        int length = input.length * input[0].length;
        int[] result = new int[length];

        int maxI = input.length - 1;
        int minI = 0;

        int maxJ = input[0].length - 1;
        int minJ = 0;
        int count = 0;
        while ((minI <= maxI) && (minJ <= maxJ)) {

            for (int j = minJ; j <= maxJ; j++) {
                int res = input[minI][j];
                result[count] = res;
                count += 1;
            }

            minI += 1;
            if (minI > maxI) break;

            for (int i = minI; i <= maxI; i++) {
                result[count] = input[i][maxJ];
                count += 1;
            }

            maxJ -= 1;
            if (maxJ < minJ) break;

            for (int j = maxJ; j >= minJ; j--) {
                result[count] = input[maxI][j];
                count += 1;
            }

            maxI -= 1;
            if (maxI < minI) break;

            for (int i = maxI; i >= minI; i--) {
                result[count] = input[i][minJ];
                count += 1;
            }

            minJ += 1;
            if (minJ > maxJ) break;

        }
        return result;
    }
}*/

class MatrixTraversal {
    public int[] print(int[][] input) {

        int h = input.length;
        int w = input[0].length;
        int top = 0;
        int right = w - 1;
        int left = 0;
        int bottom = h - 1;

        int[] array = new int[h * w];
        int k = 0;

        while (k <= (h * w) - 1) {

            for (int i = left; i <= right; i++) {
                array[k] = input[top][i];
                k++;
            }

            for (int i = top + 1; i <= bottom; i++) {
                array[k] = input[i][right];
                k++;
            }

            if (k <= (h * w) - 1) {

                for (int i = right - 1; i >= left; i--) {
                    array[k] = input[bottom][i];
                    k++;
                }

                for (int i = bottom - 1; i >= top + 1; i--) {
                    array[k] = input[i][top];
                    k++;
                }
                top += 1;
                right -= 1;
                left += 1;
                bottom -= 1;
            }
        }
        return array;
    }
}
