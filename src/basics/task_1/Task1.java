package basics.task_1;

import java.util.Scanner;

/**
 * Created by Lena on 11/7/2017.
 *
 *  Task 1: Приветствовать любого пользователя при вводе его имени через командную строку.
 */
public class Task1 {
    public static void main(String[] args) {

        System.out.println("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hi, " + name + "!");
    }
}
