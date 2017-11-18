package week_4;

import java.util.Arrays;

/**
 * Created by Lena on 11/18/2017.
 */
public class Arrays2 {
    public static void main(String[] args) {
        //Двухмерный массив
        int[][] m = {{3, 6, 5},
                {4, 2, 6}};
        System.out.println(Arrays.deepToString(m)); //вывод массива в глубину (для 2х мерных)

        int [][] g = new int[3][3];

        //2й вариант вывода
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        //3й вариант вывода
        for (int[] ints : g) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
