package collections;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Lena on 1/28/2018.
 */
public class List {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        System.out.println("Initial size of al: " + al.size());
        al.add("B");
        al.add("F");
        al.add("D");
        al.add("E");
        al.add("C");
        al.add("F");
        //добавляем эдемент по индексу
        al.add(1, "A2");

        System.out.println(al);
        System.out.println("Size of al afte adding elements: " + al.size());

        //remove elements from the list
        al.remove("F");
        al.remove(2);

        System.out.println("Size of al after removing elements: " + al.size());
        System.out.println(al);

        //create LinkedList
        LinkedList<String> ll = new LinkedList<>();
        System.out.println("Size of initial ll: " + ll.size());

        ll.add("B");
        ll.add("F");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.add("F");
        ll.addFirst("AA");
        ll.addLast("ZZ");

        System.out.println("ll after adding elements: " + ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println("ll after removing Last and First elems: " + ll);

        String val = ll.get(2);
        System.out.println("Val: " + val);
        ll.set(2, val + "Changed");

        System.out.println("ll after changing value by index: " + ll);
    }
}
