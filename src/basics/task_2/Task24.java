package basics.task_2;

import java.util.Arrays;

/**
 * Created by Lena on 11/19/2017.
 * 4. Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.
 */
public class Task24 {

    String getMinDiffNumers(String[] arrNums) {
        int min = Integer.MAX_VALUE;
        int position = 0;

        for (int i = 0; i < arrNums.length; i++) {
            int count = countOfDifferentNumbers(arrNums[i]);
            if (count < min) {
                min = count;
                position = i;
            }
        }

        return arrNums[position];
    }


    int countOfDifferentNumbers(String arrNums) {
        char[] arrUniqueNumbs = new char[arrNums.length()];
        int uniqueNumbsCount = 0;

        for (int i = 0; i < arrNums.length(); i++) {
            if (!charExitstInArray(arrUniqueNumbs, arrNums.charAt(i))) {
                arrUniqueNumbs[uniqueNumbsCount] = arrNums.charAt(i);
                uniqueNumbsCount++;
            }
        }

        return uniqueNumbsCount;
    }

    boolean charExitstInArray(char[] arr, char value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }

        return false;
    }

}
