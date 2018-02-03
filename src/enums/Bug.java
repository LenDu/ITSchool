package enums;

/**
 * Created by Lena on 12/23/2017.
 */
public class Bug extends Animal implements Movement {
    @Override
    public void move() {
        System.out.println("Move as a bug");
    }
}
