package generics;

/**
 * Created by Lena on 1/27/2018.
 */
public class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] a;

    public MyClass(T[] a) {
        this.a = a;
    }

    @Override
    public T min() {
        T min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0){
                min = a[i];
            }
        }
        return min;
    }

    @Override
    public T max() {
        T max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max.compareTo(a[i]) < 0){
                max = a[i];
            }
        }
        return max;
    }
}
