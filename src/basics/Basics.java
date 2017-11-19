package basics;

import java.util.Scanner;

/**
 * Created by Lena on 11/7/2017.
 */
public class Basics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("s = "+ s);

//        double a = 0.01;
//        int b = 0;
//        System.out.println(a/b);

//        System.out.println(a++);
//        System.out.println(++a);

//        float a =  .1f; //  a = 0.1f
//        System.out.println(0.3f+0.4f); //результат - число очень близкое к 0.7
//        System.out.println(0.1+0.2); //!!!investigate result!!!
//        System.out.println(4.0/0);
//        System.out.println(0.0==-0.0);
//        System.out.println(Double.POSITIVE_INFINITY*0);

//        int x, y;
//        y = 20;
//        for (x = 0; x <10; x++){
//            System.out.println("Значение х: " + x);
//            System.out.println("Значение y:" + y);
//            y = y-2;
//        }

//        float x = 0, y = 0;
//        x = (float)(0.3+0.4);
//        y = 0.3f + 0.4f;
//        System.out.println(x);
//        System.out.println(y);

//        int a = 7;
//        double b = 0.0;
//        double c = -0.0;
//        double d = 2.5;
//        double g = Double.NEGATIVE_INFINITY;
//
//        System.out.println(a/b);
//        System.out.println(a/c);
//        System.out.println(a==c);
//
//        System.out.println(d/0);
//        System.out.println(g*0);

        //  System.out.println("\u06B9");
//        char c1 = '1'; //код символа 1 - 49
//        char c2 = '\u0031';
//        char c3 = 49;
//        System.out.println(c1 +c2+c3);

//        for(int i= 'А'; i<='Я'; i++){
//            System.out.println((char)i);
//        }

//        System.out.println('A'*'z');

//        char ch1, ch2;
//         ch1 = 88; // code of 'X' symbol
//         ch2 = 'Y';
//        System.out.println(ch1 + " " + ch2);

//        int length = "ewjhekqhwe q weq".length();
//        System.out.println(length);

        //String s = new String("wrwrwrw we r kwherkwh");
        //все сложения со строкой приводят к конкатенпции строки
//        String s = "aaaa" + .5 + "123";
//        System.out.println(s);


// 2 строки нельзя сравнивать с пом ==, для этого ксть метод сравненя .equals()
//        System.out.println("4/2="+ 4/2 == "4/2=2");
//        String a = "Hi";
//        String b = "Hi";
//        System.out.println(a==b);// так делать нельзя
//        System.out.println(a.equals(b));


//        byte b1 = 50, b2 = 99;
//        byte k = (byte) (b1 + b2);
//        System.out.println("k=" + k);

//        byte a = 50;
//        byte b = 99;
//
//        System.out.println(a+b);


//        int x=10;
//        int i = x<5 ? 15+2/3:100;
//        System.out.println(i);

//        int age = 5;
//        String place;
//        if ((age >= 3) && (age <= 7))
//            place = "kinder garden";
//        else if ((age > 7) && (age <= 17))
//            place = "school";
//        else if ((age > 17) && (age <= 22))
//            place = "university";
//        else if ((age > 22) && (age <= 65))
//            place = "work";
//        else if ((age > 65) && (age <= 90))
//            place = "pens";
//        else place = "undefined";
//        System.out.println("" );

//        int day = 2;
//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("work day");
//                break;
//            case 6:
//            case 7:
//                System.out.println("weekend");
//                break;
//            default:
//                System.out.println("invalid value");
//        }

//        int i=0;
//        while (i<10) {
//            System.out.println(i);
//            i++;
//        }

//        do {
//            System.out.println(i);
//        } while (i>10);


//        int i, j;
//        i = 100;
//        j = 200;
//        while (++i < --j) ;
//        System.out.println("Midpoint is " + i);
//        System.out.println(j);


//        for (int i = 0; i < 10; i++) {
//            System.out.println("i = " + i);
//        }

//        for (int i = 0; i < 10; i++,  System.out.println("i = " + i));
//        int i = 0;
//
//        while (i<=50) {
//            if (i%2==0) {
//                System.out.println(i);
//            }
//            i++;
//        }
//
//
//        for (int j = 0; j < 10; j++) {
//            if (j % 2 != 0) continue;
//            System.out.println(j);
//        }
//
//        for (int j = 0; j < 10; j++) {
//            if (j % 2 == 0) break;
//            System.out.println(j);
//        }
//        System.out.println("test");

//        int [] a = {1, 2, 3, 4, 5, 6};
//        System.out.println(a[1]);
//        for (int x:a) {
//            System.out.println("x = " + x);
//        }

        //паосинг приведения одного типа к другому

//        String strInt = "123";
//        String strDouble = "123.456";
//        int x;
//        double y;
//
//        x = Integer.parseInt(strInt);
//        y = Double.parseDouble(strDouble);
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);
//        strInt = String.valueOf(x +1);
//        strDouble = String.valueOf(y +1);
//        System.out.println("strInt = " + strInt);
//        System.out.println("strDouble = " + strDouble);
//        String str;
//        str = "num" + 345;
//        System.out.println("str = " + str);

//        System.out.println(Integer.MAX_VALUE+2); // в этом случае тип идет по кругу и получается -2147483647
//        System.out.println(Integer.MIN_VALUE-1); // в этом случае тип идет по кругу и получается  2147483647

//        System.out.println(Integer.parseInt("11"));

//        System.out.println(Integer.toString(262));
//        System.out.println(Integer.toBinaryString(262));
//        System.out.println(Integer.toHexString(267));
//        System.out.println(Integer.toOctalString(267));


 /*   Scanner scanner = new Scanner(System.in);
    String[] split = scanner.nextLine().split(" "); //распарсить строку через пробел
        for (int j = 0; j<split.length; j++) {
        int i = Integer.parseInt(split[j]);
        System.out.println("i[" + j + "]= " + i);*/
    }

}
