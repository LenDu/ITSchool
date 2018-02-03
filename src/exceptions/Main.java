package exceptions;

import java.io.IOException;
import java.util.Random;

/**
 * Created by Lena on 1/21/2018.
 */
public class Main {
    public static void main(String[] args) {
//        try {
//            System.in.read();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        int a = 10;
//        int a1 = 0;
//        try {
//            int c = a/a1;
//            System.out.println("Hi");
//        } catch (Exception e) {
//
//        }
//        System.out.println(a1);

//        int a = 10;
//        try {
//            int a1 = 0;
//            int c = a/1;
//            System.out.println("Hi");
//        } catch (Exception e) {
//            System.out.println("catch");
//        } finally {
//            System.out.println("finally");
//        }

//        int a =0, b=0, c = 0;
//        Random r = new Random();
//        for (int i = 0; i < 32000; i++) {
//            try {
//                b = r.nextInt();
//                c = r.nextInt();
//                a = 12345/(b/c);
//            } catch (Exception e) {
//                System.out.println("Деление на 0");
//                a = 0;
//            }
//
//            System.out.println("a: " + a + "\ni: " + i);
//        }
//
        try {
            int a;
            a = args.length;
            int b = 42 / a;
            int[] c = new int[a];
            c[a] = 666;
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0 " + e);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("Уже после Try-catch-catch");
    }
}
