package oop;

/**
 * Created by Lena on 12/10/2017.
 */

public class InerfMain {
    public static void main(String[] args) {
        CA a = new CA();
        a.n();
        a.m1();
        System.out.println(CA.a);
        IA.m();
        //по умолчанию все мелоды наследуются от класса: не от интерфейса: но можно явно прописать наследование от интерфейса
        a.m2();
        a.n1();


    }
}
