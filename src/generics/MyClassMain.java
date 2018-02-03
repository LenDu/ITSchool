package generics;

/**
 * Created by Lena on 1/27/2018.
 */
public class MyClassMain {
    public static void main(String[] args) {
        MyClass<Integer> integerMyClass = new MyClass<>(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        System.out.println(integerMyClass.max());
        System.out.println(integerMyClass.min());

        MyClass<Girl> girlMyClass = new MyClass<>(new Girl[]{new Girl("Iren", 20), new Girl("Kate", 25)});
        System.out.println(girlMyClass.max());
        System.out.println(girlMyClass.min());


    }
}
