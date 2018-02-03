package generics;

/**
 * Created by Lena on 1/27/2018.
 */
public class A1<L, K> { //обобщение типа
    //Integer a;
    L a;
    K b;

    public A1(L a, K b) {
        this.a = a;
        this.b = b;
    }

    public void getMyClass(){
        System.out.println(a.getClass().getCanonicalName()); //получить имя с пакетом
        System.out.println(b.getClass().getCanonicalName());
    }

    @Override
    public String toString() {
        return "A1{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
