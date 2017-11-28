package oop;

/**
 * Created by Lena on 11/19/2017.
 */

//перегруженные методы
class Test {
    int a;
    int b;

    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void s(int a, int b) {
        a += 20;
        b += 15;
    }

    void s(Test a) {
        a.a += 20;
        a.b += 15;
    }
}
