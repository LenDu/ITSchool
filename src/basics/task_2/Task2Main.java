package basics.task_2;

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


    }
}
