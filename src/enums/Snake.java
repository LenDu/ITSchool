package enums;

/**
 * Created by Lena on 12/23/2017.
 */
public class Snake extends Animal implements Movement {
    @Override
    public void move() {
        System.out.println("Move as snake");
    }

    void eat (Apple apple){

    }
}
