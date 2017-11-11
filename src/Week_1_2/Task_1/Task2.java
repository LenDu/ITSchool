package Week_1_2.Task_1;

/**
 * Created by Lena on 11/7/2017.
 *
 * Task 2: Отобразить в окне консоли аргументы командной строки в обратном порядке.
 */
public class Task2 {
    public static void main(String[] args) {
        for (int i = args.length; i > 0; i--) {
            System.out.print(args[i - 1] + " ");
        }
    }
}
