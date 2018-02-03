package generics;

/**
 * Created by Lena on 1/27/2018.
 */
public class Main {
    public static void main(String[] args) {
        A1 a1 = new A1<Integer, String>(10, "bbb");
        a1.getMyClass();
        A1 a2 = new A1<String, Double>("10", 12.0);
        a2.getMyClass();
        A1 a3 = new A1<Double, Integer>(10.0, 12);
        a3.getMyClass();
    }
}
