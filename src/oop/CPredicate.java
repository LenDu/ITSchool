package oop;

import java.util.function.Predicate;

/**
 * Created by Lena on 12/17/2017.
 */
public class CPredicate implements Predicate<String> {

    @Override
    public boolean test(String s) {
        return s.startsWith("a");
    }
}
