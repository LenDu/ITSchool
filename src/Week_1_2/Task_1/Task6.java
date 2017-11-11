package Week_1_2.Task_1;

import java.util.Scanner;

/**
 * Created by Lena on 11/7/2017.
 * Task 6: Ввести с консоли n целых чисел. На консоль вывести:
 * 6.1. Четные и нечетные числа.
 * 6.2. Наибольшее и наименьшее число.
 * 6.3. Числа, которые делятся на 3 или на 9. divided into three without residue
 * 6.4. Числа, которые делятся на 5 и на 7.
 * 6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
 * 6.6. «Счастливые» числа (сумма первой половины цифр равна сумме второй половины цыфр)
 * 6.7. Элементы, которые равны полусумме соседних элементов.
 */
public class Task6 {
    public static void main(String[] args) {
        System.out.println("Please enter n int numbers:");
        Scanner scanner = new Scanner(System.in);
        String[] num = scanner.nextLine().split(" ");
        int[] toInt = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            toInt[i] = Integer.parseInt(num[i]);
        }

        //6.1. Четные и нечетные числа.

        System.out.print("6.1 Even numbers: ");

        for (int i = 0; i < toInt.length; i++) {
            if (toInt[i] % 2 == 0) {
                System.out.print(toInt[i] + " ");
            }
        }

        System.out.println();
        System.out.print("6.1 Odd numbers: ");

        for (int i = 0; i < num.length; i++) {
            if (toInt[i] % 2 != 0) {
                System.out.print(toInt[i] + " ");
            }
        }

        System.out.println();


        //6.2. Наибольшее и наименьшее число.

        System.out.print("6.2 Max number: ");
        int max = toInt[0];

        for (int i = 1; i < toInt.length; i++) {
            if (max < toInt[i]) {
                max = toInt[i];
            }
        }

        System.out.println(max);

        System.out.print("6.2 Min number: ");
        int min = toInt[0];

        for (int i = 1; i < toInt.length; i++) {
            if (min > toInt[i]) {
                min = toInt[i];
            }
        }

        System.out.println(min);


//        6.3. Числа, которые делятся на 3 или на 9.
        System.out.print("6.3 Divided into 3 or 9: ");

        for (int i = 0; i < toInt.length; i++) {
            if ((toInt[i] % 3 == 0) || (toInt[i] % 9 == 0)) {
                System.out.print(toInt[i] + " ");
            }
        }

        System.out.println();

//        6.4. Числа, которые делятся на 5 и на 7.
        System.out.print("6.4 Divided into 5 and 7: ");

        for (int i = 0; i < toInt.length; i++) {
            if ((toInt[i] % 5 == 0) && (toInt[i] % 7 == 0)) {
                System.out.print(toInt[i] + " ");
            }
        }

        System.out.println();

//        6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
        System.out.print("6.5 3-digit not equal numbers: ");

        for (int i = 0; i < num.length; i++) {
            if (num[i].length() == 3) {
                if ((num[i].charAt(0) != num[i].charAt(1)) && (num[i].charAt(1) != num[i].charAt(2)) && (num[i].charAt(2) != num[i].charAt(0))) {
                    System.out.print(num[i] + " ");
                }
            }
        }

        System.out.println();

//        6.6. «Счастливые» числа (сумма первой половины цифр равна сумме второй половины цифр)
        System.out.print("6.6 Happy numbers: ");

        for (int i = 0; i < num.length; i++) {
            if (num[i].length() % 2 == 0) {
                int count = num[i].length() / 2;
                int sum1 = 0;
                int sum2 = 0;

                for (int j = 0; j < count; j++) {
                    sum1 += Character.digit(num[i].charAt(j), 10);
                    sum2 += Character.digit(num[i].charAt(j + count), 10);
                }

                if (sum1 == sum2) {
                    System.out.print(num[i] + " ");
                }
            }
        }

        System.out.println();

//        6.7. Элементы, которые равны полусумме соседних элементов.

        System.out.print("6.7 A half of sum: ");

        for (int i = 0; i < toInt.length - 2; i++) {
            if (toInt[i + 1] == (double)(toInt[i] + toInt[i + 2]) / 2) {
                System.out.print(toInt[i + 1] + " ");
            }
        }

    }
}
