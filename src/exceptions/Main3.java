package exceptions;

import java.io.IOException;

/**
 * Created by Lena on 1/21/2018.
 */
public class Main3 {
    public static void main(String[] args) {
        try {
            try {
                throw new Exception("a");
            } finally {
                if(true){
                    throw new IOException("b");
                }
                System.err.println("c");
            }
        } catch (IOException ex) {
           System.err.println(ex.getMessage());
        } catch (Exception ex){
            System.err.println("d");
            System.err.println(ex.getMessage());
        }
        //result: b
    }
}
