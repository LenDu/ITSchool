package collections;

import java.util.Comparator;
import java.util.stream.Collector;

/**
 * Created by Lena on 2/3/2018.
 */
public class ComparatorGirlFname implements Comparator<Girl>{
    @Override
    public int compare(Girl o1, Girl o2) {
        return o1.fname.compareTo(o2.fname);
    }
}
