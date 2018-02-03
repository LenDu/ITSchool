package enums;

/**
 * Created by Lena on 12/23/2017.
 */
public class Main {
    public static void main(String[] args) {
        Movement snake = new Movement() {
            @Override
            public void move() {
                System.out.println("snake via interface");
            }
        };

        new Movement(){
            @Override
            public void move() {
                System.out.println("snake");
            }
        };

        Movement snake1 = ()-> System.out.println("snake");

        //Все вышеперечисленные методы идентичны

        Snake snake2 = new Snake();
        snake2.eat(Apple.A);
        Apple myApple = Apple.A;
    }
}
