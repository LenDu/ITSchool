package oop.p1;

import oop.p2.C3;

/**
 * Created by Lena on 11/27/2017.
 */
public class Main {
    public static void main(String[] args) {
        //одна и та же переменная может ссылаться а различные рализации
        //пример диначического полиморфизма
        C1 c = new C4();
        c.m();
        c = new C3();
        c.m();
        c = new C2();
        c.m();
    }
}
