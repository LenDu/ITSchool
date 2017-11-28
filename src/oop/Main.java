package oop;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Girl girl1 = new Girl("Ira", 20);
        Girl girl2 = new Girl("Ket", 22);
        girl1 = null;
        System.gc(); //явно вызываем сборщик муссора
        System.out.println(girl1);
////        Girl girl1 = new Girl(); //выделение памяти для обьекта класса Girl
////        Girl girl2 = new Girl();  //выделение памяти для обьекта класса Girl
////        girl1.name = "Ira";
////        girl1.age = 20;
////        Girl girl2 = new Girl();
////        girl2.name = "Ket";
////        girl2.age = 22;
//
//        // prinf - формат строки, в которую можно полставить значения переменных в соответствующем порядке
//        // %s - подставляется переменнвя типа String, %d - подставляется переменная типа int, %n - перевод строки
////        System.out.printf("Girl: name - %s, age - %d.", girl1.name, girl1.age);
////        System.out.printf("\nGirl: name - %s, age - %d.%n", girl2.name, girl2.age);
//
//        System.out.println(girl1);
//        System.out.println(girl2);
//
//        girl1.goToCinema();
//        girl2.goToCinema();
//        System.out.println(girl1.goToRest("Frash Line"));
//        System.out.println(girl2.goToRest("Mac"));



//        final String S1 = "aaa"; //final значит: что значение переменной является константой, которая не меняется
//        final int[] ARR = {1, 2, 3, 4, 5};
//        System.out.println(S1);
//        System.out.println(Arrays.toString(ARR));
//        ARR[0] = 10000;
//        System.out.println(Arrays.toString(ARR));


//        final String s = "ASD";
//        System.out.println(s);
//        int i = m(s, 12, 15, 5);
//        System.out.println("i = " + i);
//        System.out.println(s);


//        Test test = new Test(10, 20);
//        int a = 10;
//        int b = 20;
//        test.s(a, b);
//        System.out.println("a  = " + a);//10
//        System.out.println("b  = " + b);//20
//        test.s(test);
//        System.out.println(" " + test.a);//30
//        System.out.println("tetest a =st b = " + test.b);//35


        SuperGirl superGirl = new SuperGirl("ddd", 20);
        System.out.println(superGirl);

        Student student = new Student("Den", 22);
        System.out.println(student);

        Aspirant aspirant = new Aspirant("Alex", 24, "AAAAA");
        System.out.println(aspirant);
    }

    //метод с произвольным количеством параметров
    static int m(String s, int... a) {
        System.out.println("s = " + s);
        s += "aaaaaaa";
        System.out.println("s = " + s);
        int sum = 0;

        for (int x : a) {
            sum += x;
        }
        return sum;

    }


}
