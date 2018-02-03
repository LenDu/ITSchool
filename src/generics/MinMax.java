package generics;

/**
 * Created by Lena on 1/27/2018.
 */
public interface MinMax <T extends Comparable<T>> {
    T min();
    T max();
}
