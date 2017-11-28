package basics.task_2;

import basics.task_1.Task5;

import java.util.Scanner;

/**
 * Created by Lena on 11/19/2017.
 */
public class Task2Main {
    public static void main(String[] args) {
        System.out.println("Please enter n numbers: ");
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

//        int[] toInt = new int[input.length];
//        for (int i = 0; i < input.length; i++) {
//            toInt[i] = Integer.parseInt(input[i]);
//        }

        Task21 task21 = new Task21();
        task21.minMaxSize(input);

        Task22 task22 = new Task22();
        task22.sortByLength(input);

        Task23 task23 = new Task23();
        task23.displayLessThenAverage(input);
        task23.displayMoreThenAverage(input);

        Task24 task24 = new Task24();
        System.out.println("4. Number with min amount of unique digits: " + task24.getMinDiffNumers(input));

        Task25 task25 = new Task25();
        System.out.println(task25.amountOfNumbersWithEvenOddDigits(input));

        Task26 task26 = new Task26();
        System.out.println("6. The 1st number with digits in ascending order (in sorted array): " + task26.findNumberWithDigitsInAscendingOrder(input));

        Task27 task27 = new Task27();
        System.out.println("7. The 1st number with unique digits (in sorted array): " + task27.getNumberWithUniqueDigits(input));

        Task28 task28 = new Task28();
        System.out.println("8. Numbers from 1 to k in matrix N x N:");
        task28.outputMatrix(9);


    }
}
