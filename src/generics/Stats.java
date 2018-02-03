package generics;

/**
 * Created by Lena on 1/27/2018.
 */
//Ограниение только для Number типов (для String уже не отработает)
public class Stats <T extends Number> {
    T[] nums;

    public Stats(T[] nums) {
        this.nums = nums;
    }

    double average(){
        double sum = 0.0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum/nums.length;
    }

    public boolean same(Stats <?> a2){
        return a2.average() == this.average();
    }
}
