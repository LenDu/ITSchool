package oop;

/**
 * Created by Lena on 12/9/2017.
 */
public class Rectangle extends Shape {
    int a, b, c, d;

    public Rectangle(String color, int a, int b, int c, int d) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    void drow() {
        System.out.println("Rectangle");
    }
}
