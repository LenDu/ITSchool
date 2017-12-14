package oop;

/**
 * Created by Lena on 12/9/2017.
 */
public class Circle extends Shape {

    int a, b, c;

    public Circle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    void drow() {
        System.out.println("Circle");
    }
}
