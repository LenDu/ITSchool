package enums;

/**
 * Created by Lena on 12/23/2017.
 */
public class Fish extends Animal implements Movement {
    @Override
    public void move() {
        System.out.println("move as fish");
    }
}
