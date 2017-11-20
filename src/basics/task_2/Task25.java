package basics.task_2;

/**
 * Created by Lena on 11/20/2017.
 * 5. Найти количество чисел, содержащих только четные цифры, а среди них количество чисел с равным числом четных и нечетных цифр.
 */
public class Task25 {

    Task25Result amountOfNumbersWithEvenOddDigits(String[] arrNums) {
        int countOnlyEven = 0, countEvenOdd = 0;

        for (int i = 0; i < arrNums.length; i++) {
            int countEven = 0, countOdd = 0;

            for (int j = 0; j < arrNums[i].length(); j++) {

                if (arrNums[i].charAt(j) % 2 == 0) {
                    countEven++;
                } else {
                    countOdd++;
                }
                if (countEven == arrNums[i].length()) {
                    countOnlyEven++;
                }

            }
            if (countEven == countOdd) {
                countEvenOdd++;
            }
        }

        Task25Result task25Result = new Task25Result(countOnlyEven, countEvenOdd);
        return task25Result;
    }
}
