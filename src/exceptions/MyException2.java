package exceptions;

/**
 * Created by Lena on 1/21/2018.
 */
public class MyException2 extends Exception {
    public MyException2(String message) {
        super(message);
    }

    private static void myException2(){
        System.out.println("Hi from My Exception2");
    }
}
