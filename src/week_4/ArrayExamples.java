package week_4;

import java.util.Arrays;

/**
 * Created by Lena on 11/18/2017.
 */
public class ArrayExamples {
    public static void main(String[] args) {
        int[] b = {5, 6, 3, 8, 7, 9};
        int [] b1 = {3, 6, 10, 8, 12, 9};
        invertArray(b);
        invertArray(b1);
        bubbleSort(b);
        bubbleSort(b1);

    }

    /**
     * It is a method for a bubble sort
     * @param b <code>Array to be sorted<code/>
     */
    private static void bubbleSort(int[] b) {
        System.out.print("Bubble sort: " + Arrays.toString(b) + " -> ");

        for (int j= b.length-1; j>=0; j--) {
            for (int i = 0; i < b.length-1; i++) {
                if (b[i]>b[i+1]){
                    int temp = b[i];
                    b[i] = b[i+1];
                    b[i+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(b));
    }

    /**
     * It is my method for array inversion
     * @param b <code>The array to be inverted</code>
     */
    private static void invertArray(int[] b) {
        System.out.print("Invert array: " + Arrays.toString(b) + " -> ");

        for (int i = 0; i < b.length / 2; i++) {
            int tmp = b[i];
            b[i] = b[b.length - 1 - i];
            b[b.length - 1 - i] = tmp;
        }

        System.out.println(Arrays.toString(b));
    }


}

