package week_4;

/**
 * Created by Lena on 11/19/2017.
 */
public class ObjectOrientedProgramming {
    public static void main(String[] args) {
        Girl girl1 = new Girl("Ira", 20);
        Girl girl2 = new Girl("Ket", 22);
//        Girl girl1 = new Girl(); //выделение памяти для обьекта класса Girl
//        Girl girl2 = new Girl();  //выделение памяти для обьекта класса Girl
//        girl1.name = "Ira";
//        girl1.age = 20;
//        Girl girl2 = new Girl();
//        girl2.name = "Ket";
//        girl2.age = 22;

        // prinf - формат строки, в которую можно полставить значения переменных в соответствующем порядке
        // %s - подставляется переменнвя типа String, %d - подставляется переменная типа int, %n - перевод строки
//        System.out.printf("Girl: name - %s, age - %d.", girl1.name, girl1.age);
//        System.out.printf("\nGirl: name - %s, age - %d.%n", girl2.name, girl2.age);

        System.out.println(girl1);
        System.out.println(girl2);

        girl1.goToCinema();
        girl2.goToCinema();
        System.out.println(girl1.goToRest("Frash Line"));
        System.out.println(girl2.goToRest("Mac"));
    }
}
