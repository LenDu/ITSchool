package oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by Lena on 12/17/2017.
 */
public class SteamMain {
    public static void main(String[] args) {
        Stream.of("aaa", "abb", "bbb", "acc")
               // .filter(x->x.startsWith("a"))
                .filter(new CPredicate())
                .forEach(System.out::println);

        new ArrayList<String>(Arrays.asList("asd", "ddd")).stream()
                .filter(x->x.equals("asd"))
                .forEach(System.out::println);

//Predicate
        Predicate<String> nullCheck = arg -> arg != null;
        Predicate<String> emptyCheeck = arg -> arg.length() > 0;
        Predicate<String> nullAndEmptyCheck = nullCheck.and(emptyCheeck);

        String helloStr = "hello";
        System.out.println(nullAndEmptyCheck.test(helloStr));
        String nullStr = null;
        System.out.println(nullAndEmptyCheck.test(nullStr));

//Function
        Arrays.stream("4,-9,16".split(","))
                .map((Integer::parseInt))
                .map(i -> (i<0)? -i:i)
                .forEach(System.out::println);

        //Supplier
        Random random = new Random();
        Stream.generate(random::nextBoolean)
                .limit(2)
                .forEach(System.out::println);

        //Consumer



    }
}
