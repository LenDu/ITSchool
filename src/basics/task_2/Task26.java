package basics.task_2;

/**
 * Created by Lena on 11/20/2017.
 * 6. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
 */
public class Task26 {

    String findNumberWithDigitsInAscendingOrder(String[] arrNums) {

        int position = 0;

        for (int i = 0; i < arrNums.length; i++) {
            int count = 1;
            for (int j = 0; j < arrNums[i].length() - 1; j++) {
                if (arrNums[i].charAt(j) < arrNums[i].charAt(j + 1)) {
                    count++;
                }
            }
            if (count == arrNums[i].length()) {
                position = i;
                break;
            }
        }

        return arrNums[position];
    }
}
