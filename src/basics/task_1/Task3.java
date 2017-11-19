package basics.task_1;

import java.util.Scanner;

/**
 * Created by Lena on 11/7/2017.
 * <p>
 * Task 3: Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
 */

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Please enter an amount of random numbers:");
        Scanner scanner = new Scanner(System.in);
        String amount = scanner.next();
        int amountN = Integer.parseInt(amount);

        for (int i = 0; i < amountN; i++) {
            System.out.println((int) (Math.random() * 1000));
        }
        for (int i = 0; i < amountN; i++) {
            System.out.print((int) (Math.random() * 1000) + " ");
        }


//        int i = 0;
//        while (i < amountN) {
//            System.out.println((int) (Math.random() * 1000));
//            i++;
//        }
//        i = 0;
//        while (i < amountN) {
//            System.out.print((int) (Math.random() * 1000) + " ");
//            i++;
//        }
    }
}
