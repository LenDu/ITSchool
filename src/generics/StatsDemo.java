package generics;

/**
 * Created by Lena on 1/27/2018.
 */
public class StatsDemo {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3,4 ,5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v = iob.average();
        System.out.println("iob average is " + v);

        Double dnums[] = {1.0, 2.0, 3.0, 4.0, 5.0};
        Stats<Double> dob = new Stats<Double>(dnums);
        double w = dob.average();
        System.out.println("dob average is " + w);

        System.out.println(iob.same(dob));


//        String str[] = {"1", "2", "3", "4", "5"};
//        Stats<String> stob = new Stats<String>(dnums);
//        double s = stob.average();
//        System.out.println("dob average is " + s);

        if(isIn(2, inums))
            System.out.println("2 is in nums");

        if(!isIn(7, inums))
            System.out.println("7 isn't in nums");

        //Use isIn() on Strings
        String strs[] = {"one", "two", "three", "four"};

        if (isIn("two", strs))
        System.out.println("two is in strs");


    }

    //example of generic method
    static <T, V extends T> boolean isIn(T x, V[] y){
        for (int i = 0; i < y.length; i++) {
            if(x.equals(y[i])) return true;
        }
        return false;
    }
}
