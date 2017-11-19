package basics.task_2;

import java.util.Arrays;

/**
 * Created by Lena on 11/19/2017.
 */
public class Task22 {

    /**
     * 2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.
     * @param arr <code>String array to sort</code>
     */
    void sortByLength(String[] arr){

        for (int j = arr.length - 1; j >= 0; j--) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].length() > arr[i + 1].length()) {
                    String temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println("Numbers sorted by length ascending: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length / 2; i++) {
            String tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
        System.out.println("Numbers sorted by length descending: " + Arrays.toString(arr));

    }
}
