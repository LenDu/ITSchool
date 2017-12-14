package oop;

/**
 * Created by Lena on 12/9/2017.
 */
public class ShapeMain {
    public static void main(String[] args) {
        //мождно создать массыв ссылок на абсткрактный класс
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("red", 1, 2, 3);
        shapes[1] = new Rectangle("blue", 1, 2,3 ,4 );
        shapes[2] = new Circle("red1",1, 2,3 );

        for (Shape shape:shapes){
            shape.drow();
        }
    }
}
