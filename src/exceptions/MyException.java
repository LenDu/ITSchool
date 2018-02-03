package exceptions;

/**
 * Created by Lena on 1/21/2018.
 */
public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
    public void myMethod(){
        System.out.println("Hi from MyException");
    }
}
