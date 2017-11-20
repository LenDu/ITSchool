package basics.task_2;

/**
 * Created by Lena on 11/20/2017.
 * 7. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
 */
public class Task27 {

    String getNumberWithUniqueDigits(String[] arrNums) {

        int count, position = 0;
        Task24 countUnique = new Task24();

        for (int i = 0; i < arrNums.length; i++) {
            count = countUnique.countOfDifferentNumbers(arrNums[i]);
            if (count == arrNums[i].length() && count != 1) {
                position = i;
                break;
            }
        }
        return arrNums[position];
    }
}
