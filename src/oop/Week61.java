package oop;

/**
 * Created by Lena on 12/9/2017.
 */
public class Week61 {
    static int a;
    int b;
    //статические поля могут быть опрелколены  как в статическиз, так и не в статическиз методах
    //нельзя использовать нестатическое  поле в стаическом классе
    //статический блок отрабаьтывает при компиляции класса
    static void m(){
        throw  new IllegalArgumentException();
       // System.out.println("static");
    }

    void n(){
        System.out.println("not static");
    }
}
