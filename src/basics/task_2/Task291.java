package basics.task_2;

/**
 * Created by Lena on 11/30/2017.
 * 9.1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений.
 */
public class Task291 {

    int[][] sortRowsInAscendingOrder(int[][] matrix) {
        int tmp;
        int[][] sortedMtr = duplicateInitialMatrix(matrix);

        for (int i = 0; i < sortedMtr.length; i++) {
            for (int barrier = sortedMtr.length - 1; barrier >= 0; barrier--) {
                for (int j = 0; j < barrier; j++) {
                    if (sortedMtr[i][j] > sortedMtr[i][j + 1]) {
                        tmp = sortedMtr[i][j];
                        sortedMtr[i][j] = sortedMtr[i][j + 1];
                        sortedMtr[i][j + 1] = tmp;
                    }
                }
            }
        }

        return sortedMtr;
    }

    int[][] sortColumnsInAscendingOrder(int[][] matrix) {
        int tmp;
        int[][] sortedMtr = duplicateInitialMatrix(matrix);

        for (int barrier = sortedMtr.length - 1; barrier >= 0; barrier--) {
            for (int i = 0; i < barrier; i++) {
                for (int j = 0; j < sortedMtr.length; j++) {
                    if (sortedMtr[i][j] > sortedMtr[i + 1][j]) {
                        tmp = sortedMtr[i][j];
                        sortedMtr[i][j] = sortedMtr[i + 1][j];
                        sortedMtr[i + 1][j] = tmp;
                    }
                }
            }
        }

        return sortedMtr;
    }

    int[][] duplicateInitialMatrix(int[][] matrix) {
        int[][] duplicatedMtrx = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                duplicatedMtrx[i][j] = matrix[i][j];
            }
        }
        return duplicatedMtrx;
    }
}
