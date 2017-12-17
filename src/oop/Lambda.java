package oop;

import java.util.function.Function;

/**
 * Created by Lena on 12/17/2017.
 */
public class Lambda {
    public static void main(String[] args) {
        Function<String, String> a = (String x) -> {
            return x + "aaaaaaa";
        };
        System.out.println(a.apply("ssssss"));
    }

}
