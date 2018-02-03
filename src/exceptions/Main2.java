package exceptions;

import java.io.IOException;

/**
 * Created by Lena on 1/21/2018.
 */
public abstract class Main2 {
    public static void main(String[] args) throws IOException{
//        myread();
//        return;

        try {
            m();
        } catch (MyException e) {
            e.myMethod();
            System.out.println(e.getMessage());
        }
        return;


    }

    private static void myread() throws IOException {
        System.in.read();
    }

    private static void m() throws MyException {
        throw new MyException("he he he");
    }

    private static void m2() throws MyException2 {
        throw new MyException2("Myexception2");
    }



}
