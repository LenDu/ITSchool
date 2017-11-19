package basics.task_2;

/**
 * Created by Lena on 11/19/2017.
 */
public class Task21 {

    /**
     * 1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
     * @param numArr <code>String array<code/>
     */
    void minMaxSize (String [] numArr)

    {
        int minSize = 20, maxSize = 0;
        String minNum = null, maxNum = null;
        for (String num : numArr) {
            if (num.length() < minSize) {
                minSize = num.length();
                minNum = num;
            }
            if (num.length() > maxSize) {
                maxSize = num.length();
                maxNum = num;
            }
        }
        System.out.printf("The shortest number - %s, it contains - %d digits. " +
                "\nThe longest number - %s, it contains - %d digits.\n", minNum, minSize, maxNum, maxSize);
    }

}
