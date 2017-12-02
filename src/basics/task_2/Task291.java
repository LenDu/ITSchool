package basics.task_2;

/**
 * Created by Lena on 11/30/2017.
 * 9.1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений.
 */
public class Task291 {

    int[][] sortRowsInAscendingOrder(int[][] matrix) {
        int tmp;

        for (int i = 0; i < matrix.length; i++) {
            for (int barrier = matrix.length - 1; barrier >= 0; barrier--) {
                for (int j = 0; j < barrier; j++) {
                    if (matrix[i][j] > matrix[i][j + 1]) {
                        tmp = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = tmp;
                    }
                }
            }
        }

        return matrix;
    }

    int[][] sortColumnsInAscendingOrder(int[][] matrix) {
        int tmp;

        for (int barrier = matrix.length - 1; barrier >= 0; barrier--) {
            for (int i = 0; i < barrier; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    if (matrix[i][j] > matrix[i + 1][j]) {
                        tmp = matrix[i][j];
                        matrix[i][j] = matrix[i + 1][j];
                        matrix[i + 1][j] = tmp;
                    }
                }
            }
        }

        return matrix;
    }
}
