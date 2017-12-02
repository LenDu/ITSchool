package basics.task_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Lena on 11/21/2017.
 *  8. Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.
 */
public class Task28 {


    int countMatrixSize(int k) {
        int matrixSize = (int) Math.sqrt(k);

        if (matrixSize * matrixSize == k) {
            return matrixSize;
        } else {
            return matrixSize+1;
        }
    }

    int[][] setMatrixElements(int arrSize, int count) {

        int[][] arr = new int[arrSize][arrSize];
        int firstElem = 0;

        for (int i = 0; i < arrSize; i++) {
            for (int j = 0; j < arrSize; j++) {
                arr[i][j] = ++firstElem;
                if (arr[i][j] >= count){
                    return arr;
                }
            }
        }

        return arr;
    }

}
