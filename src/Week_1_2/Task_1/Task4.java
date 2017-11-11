package Week_1_2.Task_1;

import java.util.Scanner;

/**
 * Created by Lena on 11/7/2017.
 * <p>
 * Task 4: Ввести пароль из командной строки и сравнить его со строкой-образцом.
 */
public class Task4 {
    public static void main(String[] args) {
        String etalonPsw = "12345Qwerty!";
        System.out.println("Enter your password:");
        Scanner scanner = new Scanner(System.in);
        String psw = scanner.nextLine();
        if (psw.equals(etalonPsw)) {
            System.out.println("Password is correct");
        } else {
            System.out.println("Incorrect password");
        }
    }
}
