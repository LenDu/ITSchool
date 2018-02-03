package collections;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;
import java.util.List;

/**
 * Created by Lena on 2/3/2018.
 */
public class IteratorDemo  {
    static ArrayList<String> list = new ArrayList<String>();
//проинициализировать лист
    static {
        list.add("as");
        list.add("as1");
        list.add("as2");
    }
//сразу инициализтровать при обьявлении
    static List list1 = new ArrayList<String>()
    {{
        add("ass1");
        add("ass2");
        add("ass3");
    }};

//еще один способ проинициализиовать лист спазу при создании
    static List list2 = new ArrayList<String>(Arrays.asList("asss1", "asss2", "asss3"));

    public static void main(String[] args) {
        System.out.println(list);
        System.out.println(list1);
        System.out.println(list2);

        Iterator<String> itr = list.iterator();
        System.out.println("Original list: ");
        while(itr.hasNext()){
            String element = itr.next();
            System.out.println(element + " ");
        }
        System.out.println();

        //Modify objects being iterated

        ListIterator<String> litr = list.listIterator();
        while(litr.hasNext()){
            String element = litr.next();
            litr.set(element + "+");
        }
        System.out.println("Modified contents of list: ");
        itr = list.iterator();
        while(itr.hasNext()){
            String element = itr.next();
            System.out.println(element + " ");
        }
        System.out.println();

        //Display the list backwards
        System.out.println("Modified list backwards: ");
        while(litr.hasPrevious()){
            String element = litr.previous();
            System.out.println(element + " ");
        }
        System.out.println();


    }
}
