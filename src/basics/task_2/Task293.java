package basics.task_2;

import java.util.Arrays;

/**
 * Created by Lena on 12/4/2017.
 * 9.3. Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.
 */
public class Task293 {

    int[] searchMaxAmountOfIncreasedElems(int[][] matrix) {
        int max = 0, positionLast = 0, row = 0;

        for (int i = 0; i < matrix.length; i++) {
            int count = 1;
            for (int j = 0; j < matrix.length - 1; j++) {
                if (matrix[i][j] < matrix[i][j + 1]) {
                    count++;

                    if (count > max) {
                        max = count;
                        positionLast = j + 1;
                        row = i;
                    }

                } else {
                    count = 1;
                }
            }
        }

        int[] resultArr = new int[max];
        System.arraycopy(matrix[row], positionLast - max + 1, resultArr, 0, max);

        return resultArr;

    }

    int[] searchMaxAmountOfDecreasedElems(int[][] matrix) {
        int max = 0, positionLast = 0, row = 0;

        for (int i = 0; i < matrix.length; i++) {
            int count = 1;
            for (int j = 0; j < matrix.length - 1; j++) {
                if (matrix[i][j] > matrix[i][j + 1]) {
                    count++;

                    if (count > max) {
                        max = count;
                        positionLast = j + 1;
                        row = i;
                    }

                } else {
                    count = 1;
                }
            }
        }

        int[] resultDecrArr = new int[max];
        System.arraycopy(matrix[row], positionLast - max + 1, resultDecrArr, 0, max);

        return resultDecrArr;

    }
    
}
