package basics.task_2;

import java.util.Arrays;

/**
 * Created by Lena on 11/19/2017.
 *  3. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.
 */
public class Task23 {

    void displayLessThenAverage(String[] arrNums) {
        int averageLength = this.getAverageLength(arrNums);
        System.out.print("3a. Numbers length less then average length(" + averageLength + "): ");

        for (int i = 0; i < arrNums.length; i++) {
            if (arrNums[i].length() < averageLength) {
                System.out.print(arrNums[i] + "(" + arrNums[i].length() + ") ");
            }
        }
        System.out.println();
    }

    void displayMoreThenAverage(String [] arrNums) {
        int averageLength = this.getAverageLength(arrNums);
        System.out.print("3b. Numbers length more then average length(" + averageLength + "): ");

        for (int i = 0; i < arrNums.length; i++) {
            if (arrNums[i].length() > averageLength) {
                System.out.print(arrNums[i] + "(" + arrNums[i].length() + ") ");
            }
        }
        System.out.println();
    }


    int getAverageLength(String[] arrNums) {
        int lengthSum = 0;

        for (int i = 0; i < arrNums.length; i++) {
            lengthSum += arrNums[i].length();
        }

        return lengthSum / arrNums.length;
    }
}

