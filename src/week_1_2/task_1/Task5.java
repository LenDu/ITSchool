package week_1_2.task_1;

/**
 * Created by Lena on 11/7/2017.
 * Task 5: Ввести целые числа как аргументы командной строки,
 * подсчитать их суммы (произведения) и вывести результат на консоль.
 */

public class Task5 {
    public static void main(String[] args) {
        int sum = 0, prod = 1, arg;
        System.out.print("Command line arguments: ");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
            arg = Integer.parseInt(args[i]);
            sum += arg;
            prod *= arg;
        }

        System.out.println("\nArgs sum = " + sum);
        System.out.println("Args product = " + prod);
    }
}
