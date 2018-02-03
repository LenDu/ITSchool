package collections;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by Lena on 2/3/2018.
 */
public class ComparatorDemo {
    public static void main(String[] args) {
        TreeSet<Object> treeSet = new TreeSet<>();
        treeSet.add(new Girl("Greta", "Lix", 22));
        treeSet.add(new Girl("Greta1", "Lix1", 19));
        treeSet.add(new Girl("Greta2", "Lix2", 18));
        System.out.println(treeSet);

        //sort Girl by first name
        TreeSet<Girl> treeSet1 = new TreeSet<>(new ComparatorGirlFname() {
        });
        treeSet1.add(new Girl("Greta", "Lix", 22));
        treeSet1.add(new Girl("Greta1", "Lix1", 19));
        treeSet1.add(new Girl("Greta2", "Lix2", 18));
        System.out.println(treeSet1);

        //sort Girl by last name
        TreeSet<Girl> treeSet2 = new TreeSet<>(new ComparatorGirlLname() {
        });
        treeSet2.add(new Girl("Greta", "Lix", 22));
        treeSet2.add(new Girl("Greta1", "Lix1", 19));
        treeSet2.add(new Girl("Greta2", "Lix2", 18));
        System.out.println(treeSet2);

        //можно не создавать отдельный класс для сортировки по параметрам, а использовать лямбда функции
        //Comparator используется если нужно несколько разных вариантов сортировки, потому как с помощью compareTo()
        //можно реалтщовать только одн вид сортировки для класса
        TreeSet<Girl> treeSet3 = new TreeSet<>(Comparator.comparing(a -> a.lname));
        treeSet3.add(new Girl("Greta", "Lix", 22));
        treeSet3.add(new Girl("Greta1", "Lix1", 19));
        treeSet3.add(new Girl("Greta2", "Lix2", 18));
        System.out.println(treeSet3);
    }
}
