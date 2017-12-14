package oop;

/**
 * Created by Lena on 12/9/2017.
 */
public abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract void drow();
}
