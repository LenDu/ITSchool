package week_4;

import java.util.Arrays;

/**
 * Created by Lena on 11/18/2017.
 */
public class Arrays1 {
    public static void main(String[] args) {

        // Массивы
        int a = 10;
        int[] b = {5, 6, 3, 4, 2};
        //int [] b = new int[] {10};
        int[] c = new int[8]; //пустой массивб размера 8
        System.out.println(c.toString());
        //1й вариант вывода массива-------------------------
//        for (int i = 0; i < c.length; i++) {
//            System.out.println(c[i]);
//        }
        // 2й вариант вывода массива------------------------
//        for (int x : c) {
//            if (x%2==0) {
//                System.out.println(x);
//            }
//        }
//Начиная с Java 8, с массивами можно работать с помощью стримов
        Arrays.stream(b)//обьект на котром можно вызвать набор действий по работе с текущим множеством
                .filter(s -> s % 2 == 0)//выбирает все четные значения массива b
                .mapToDouble(s -> s * 2.5)
                //.map(s->s*2)//вернуть обьект (взяли выбранные четные и умножили на 2 и вернули)
                .map(d -> d * 10)
                .sorted() //сортирует.toArray();
                .forEach(System.out::println); //выводит каждый элемент
//
//        double[] array = Arrays.stream(b)
//                .filter(s -> s % 2 == 0)//выбирает все четные значения массива b
//                .mapToDouble(s->s*2.5)
//                //.map(s->s*2)//вернуть обьект (взяли выбранные четные и умножили на 2 и вернули)
//                .map(d->d*10)
//                .sorted() //сортирует по дефолту от меньшего к большему
//                .toArray();
//
//        System.out.println(Arrays.toString(array));
//        // .forEach(System.out::println); //выводит каждый элемент
//
//        Object[] object = Arrays.stream(b)
//                .filter(s -> s % 2 == 0)//выбирает все четные значения массива b
//                .mapToObj(s->String.valueOf(s))
//                //.map(s->s*2)//вернуть обьект (взяли выбранные четные и умножили на 2 и вернули)
//                .toArray();
//
//        System.out.println(Arrays.toString(object));


    }
}
