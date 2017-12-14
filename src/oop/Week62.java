package oop;

/**
 * Created by Lena on 12/9/2017.
 */
public class Week62 extends Week61 {
    static int a;
//в статике нет понятия override, нельзя заоверрайдить статические методы
    static void m(){
        System.out.println("static B" + a);
    }
}
