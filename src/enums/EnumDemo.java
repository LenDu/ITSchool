package enums;

/**
 * Created by Lena on 12/23/2017.
 */
public class EnumDemo {
    public static void main(String[] args) {
        Apple2 ap;
        ap = Apple2.RedDel;

        System.out.println("Value of ap:" + ap);
        System.out.println();

        ap = Apple2.GoldenDel;
        if (ap == Apple2.GoldenDel) {
            System.out.println("ap contains GoldenDel.\n");
        }

        switch (ap) {
            case Jonathan:
                System.out.println("Jonathan is red.");
                break;
            case GoldenDel:
                System.out.println("Golden Delocious is yellow");
                break;
        }

        Apple2 allapples[] = Apple2.values();
        for (Apple2 a : allapples) {
            System.out.println(a);
        }
        System.out.println();

        //valueOf преобразовывает строку в обьект
        ap = Apple2.valueOf("Winesap");
        System.out.println("app contains: " + ap);

        Apple2 ap1, ap2, ap3;

        //ordinal возвращает номер значения в enum
        System.out.println("Here are all apple constants" + " and their ordinal values: ");
        for (Apple2 a : Apple2.values()) {
            System.out.println(a + " " + a.ordinal());
        }

        ap1 = Apple2.RedDel;
        ap2 = Apple2.GoldenDel;
        ap3 = Apple2.RedDel;

        System.out.println();

        if (ap1.compareTo(ap2) < 0)
            System.out.println(ap1 + " comes before " + ap2);
        if (ap1.compareTo(ap2) > 0)
            System.out.println(ap2 + " comes before " + ap1);
        if (ap1.compareTo(ap3) == 0)
            System.out.println(ap1 + " equals " + ap2);
        System.out.println();
        if (ap1.equals(ap3))
            System.out.println(ap1 + " equals " + ap3);
        if (ap1 == ap3)
            System.out.println(ap1 + " == " + ap3);
    }
}
