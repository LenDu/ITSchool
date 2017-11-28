package oop;

/**
 * Created by Lena on 11/27/2017.
 */

public class Polymorphism {

    public static void main(String[] args) {
        //статический полиморфизм: потому что связь выполняется во время компиляции, реализуется с помощью перегрузки методов
        sum(12.0, 11);
        sum(11, 12);
        sum(1, 2, 3, 4, 5);
        sum(4.0);
        sum(1);


    }

    static void sum(int a, int b){
        System.out.println("int a, int b");
    }

    static void sum(double a, double b){
        System.out.println("double a, double b");
    }
//    static void sum(int a){
//        System.out.println("int a");
//    }

    static void sum(double a){
        System.out.println("double a");
    }

    static void sum(int ... a){
        System.out.println("int ... a");
    }
}
