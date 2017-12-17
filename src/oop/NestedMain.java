package oop;

/**
 * Created by Lena on 12/16/2017.
 */
public class NestedMain {
    public static void main(String[] args) {
        NestedClasses a = new NestedClasses();
        a.show();

        NestedClasses.Nested1 nested1 = new NestedClasses.Nested1();
        nested1.show();

//создать обьект внутреннего класса мы можем только на обьекте внешнего
        NestedClasses.Nested2 nested2 = a.new Nested2();
        nested2.show();
        //  NestedClasses.Nested2.show();
    }

}
