package oop;

/**
 * Created by Lena on 12/16/2017.
 */
public class NestedClasses {
    String a = "Base class";
    public void show(){
        System.out.println(a);
    }

    static class Nested1{
        String b = "Static nested class";
        public void show(){
            System.out.println(b);
        }
    }

    class Nested2{
        String c = "Non Static nested class";
        public void show(){
            System.out.println(c);
        }
    }
}
