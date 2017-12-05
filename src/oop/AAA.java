package oop;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Lena on 12/3/2017.
 */


class Point implements Cloneable {
    //статические блоки: в которых можно сразу что-то написать для выполнения при компиляции класса
    //вся статика инициализируется при компиляции класса
    // любую статику можно использовать везде
    // нестатические свойства в статических методах использовать нельзя
    //статику нельзя овверрайдить, так как овверрайд происходит на обьекте, а статика вызывается на классе
    static {

        System.out.println("Static block");
    }
    static int a; //статические свойства определяются на этапе компиляции
    int x;
    int y;

    public Point(int x, int y) {
        System.out.println("Hi");
        this.x = x;
        this.y = y;
    }

    static void c(){

    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Point point = (Point) obj;

        if (x != point.x) return false;
        return y == point.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    //чтобы была возможность клонировать обьекты данного класса, нужно переопределить метод clone в кдассе
    //и явно указать implements Cloneable  для класса, без этого клонирование невозможно
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    final void m(){
        //final метод незья переопределить (сделать ему override)
    }

    // чтобы добавить @override методы для данного класса Ctrl + O,
    //отобразатся базовые методы достуаные для переопределения
}

class A extends Point{
    public A(int x, int y) {
        super(x, y);
    }


}


public class AAA {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        Point point = new Point(10, 12);
        Point point1 = new Point(10, 12);
        System.out.println(point.toString());
        System.out.println(point1);
        System.out.println(point.equals(point1));//сравнивает ссыдки на разные обьекты, результат всегда будет false, хотя их значения одинаковые
        System.out.println(point.hashCode());
        System.out.println(point1.hashCode());

        Point point2 = (Point) point1.clone();
        System.out.println(point2);
        System.out.println(point1.getClass() == Point.class); //!!!ДЗ: обьяснить стоку!!!
        System.out.println(Point.class);
        System.out.println(point1.getClass()); //подучить информацию про текущий тип
        System.out.println(point1 instanceof Object);//проверка принадлежности обьекта текущему классу
        System.out.println(point1 instanceof Cloneable);
        System.out.println();

        final int A = 12; //final означает, что переменная константа и не может быть изменена

        final Point point3 = new Point(10, 12); //фиксируется ссылка, но значения могуь быть изменены
        point3.x = 100;
        System.out.println("point3 = " + point3);

        //Если поставить final перед классом - то другие классы наследоваться от этого класса не могут
        //классический примеор final класса - класс String, его расширять нельзя

        System.out.println(Point.a); //статические поля являются общими для всех обьектов класса, потому обращаться к ним
        //нужно не через обьект, а через класс
        Point.c();// то же самое для статических методов

    }
}
