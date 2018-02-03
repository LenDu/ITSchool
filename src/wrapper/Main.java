package wrapper;

/**
 * Created by Lena on 12/24/2017.
 */
public class Main {
    public static void main(String[] args) {
       // int a = 10; //значимый тип
        Integer a = 100;
        Integer b = 100; //ccылочный тип


// до byte значения сравниваются как значимый тип, после byte как ссылочный
        System.out.println(a.equals(b));//equals для Integer сравнивает значения
        System.out.println(a==b); //сравнивает ссылки
    }
}
