package basics.task_2;

import java.util.Arrays;

/**
 * Created by Lena on 11/30/2017.
 */
public class OutputMatrix {

    void outputMatrix(int [][]matrix) {

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
