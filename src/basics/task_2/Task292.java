package basics.task_2;

import java.lang.reflect.Array;

/**
 * Created by Lena on 12/2/2017.
 * 9.2. Выполнить циклический сдвиг заданной матрицы на k позиций вправо
 * (влево, вверх, вниз).
 */
public class Task292 {

    int[][] shiftMatrixRight(int[][] matrix, int k) {

        int length = matrix.length;
        int[][] shiftedMatrix = new int[length][length];

        for (int i = 0; i < length; i++) {
                System.arraycopy(matrix[i], 0, shiftedMatrix[i], k, length-k);
                System.arraycopy(matrix[i], length-k, shiftedMatrix[i], 0, k);
        }

        return shiftedMatrix;
    }

    int[][] shiftMatrixLeft(int[][] matrix, int k) {

        int length = matrix.length;
        int[][] shiftedMatrix = new int[length][length];

        for (int i = 0; i < length; i++) {
            System.arraycopy(matrix[i], 0, shiftedMatrix[i], length-k, k);
            System.arraycopy(matrix[i], k, shiftedMatrix[i], 0, length - k);
        }

        return shiftedMatrix;
    }

    int[][] shiftMatrixDown(int[][] matrix, int k) {

        int length = matrix.length;
        int[][] shiftedMatrix = new int[length][length];

        for (int i = 0; i < length; i++) {
            System.arraycopy(matrix, 0, shiftedMatrix, k, length-k);
            System.arraycopy(matrix, length-k, shiftedMatrix, 0, k);
        }

        return shiftedMatrix;
    }

    int[][] shiftMatrixUp(int[][] matrix, int k) {

        int length = matrix.length;
        int[][] shiftedMatrix = new int[length][length];

        for (int i = 0; i < length; i++) {
            System.arraycopy(matrix, k, shiftedMatrix, 0, length-k);
            System.arraycopy(matrix, 0, shiftedMatrix, length-k, k);
        }

        return shiftedMatrix;
    }
}

