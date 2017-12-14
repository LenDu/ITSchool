package oop;

/**
 * Created by Lena on 12/10/2017.
 */
@FunctionalInterface
//Functional Interface - интерфейс с одним public abstract method

public interface IA {
    //в интепфейсе все значения по-умолчанию public static
    int a = 10;
    static int c = 100;
    static void m(){
        System.out.println("static method interface");
    }
    //в интепфейсе все методы по-умолчанию public abstract
    void m1();

    //default метод можно определить для поведения по-умолчанию, в интерфейсе можно следать реализацию только default метод
    //в интерф могут быть либо абстрактные, либо статические методы, либо default
    default void m2(){
        System.out.println("IA method");;
    }

    class c1{}
    interface C2{}
}

