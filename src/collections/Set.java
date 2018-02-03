package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * Created by Lena on 1/28/2018.
 */
public class Set {
    public static void main(String[] args) {
        //Create a HasSet
        HashSet<String> hs = new HashSet<String>();

        //Add elements to the has set
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add(null);

        //элесенты выстраиваются по хешкоду
        System.out.println(hs);

        //Create a TreeSet
        TreeSet<String> ts = new TreeSet<String>();

        //Add elements to the ThreeSet
        ts.add("B");
        ts.add("A");
        ts.add("D");
        ts.add("E");
        ts.add("C");
        ts.add("F");

        //элементы отсортированы по методу compareTo()
        System.out.println(ts);

        //Create LinkedHashSet
        LinkedHashSet<String> ls = new LinkedHashSet<String>();

        //Add elements to LinkedHash set
        ls.add("B");
        ls.add("A");
        ls.add("D");
        ls.add("E");
        ls.add("C");
        ls.add("F");

        //начальный порядок введенных элементов сохраняется
        System.out.println(ls);
    }
}
