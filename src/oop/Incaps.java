package oop;

public class Incaps {
    public static void main(String[] args) {
//        Girl ira = new Girl("Ira", 100000);
//        System.out.println(ira);
//        ira.setAge(22);
//        ira.setName("Kira");
//        System.out.println(ira);

        Test2 ob = new Test2();

        ob.a = 10;
        ob.b = 20;

//        ob.c = 100; //Error!!!
        ob.setC(100);
        System.out.println("a, b and c: " + ob.a + " " +
        ob.b + " " + ob.getC());

    }
}
