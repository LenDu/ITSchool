package collections;

import java.util.Comparator;

/**
 * Created by Lena on 2/3/2018.
 */
public class ComparatorGirlLname implements Comparator<Girl> {
    @Override
    public int compare(Girl o1, Girl o2) {
        return o1.lname.compareTo(o2.lname);
    }
}
