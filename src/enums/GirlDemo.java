package enums;

import java.util.TreeSet;

/**
 * Created by Lena on 12/23/2017.
 */
public class GirlDemo {
    public static void main(String[] args) {
        TreeSet<Girl> girls = new TreeSet<>();
        girls.add(new Girl("Ira", 28));
        girls.add(new Girl("Yana", 21));
        girls.add(new Girl("Lena", 18));
        girls.add(new Girl("Kat", 30));
        System.out.println(girls);
    }
}
