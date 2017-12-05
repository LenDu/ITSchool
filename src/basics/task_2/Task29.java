package basics.task_2;

import basics.task_1.Task5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Lena on 11/28/2017.
 * 9.Ввести с консоли n-размерность матрицы a [n] [n]. Задать значения элемен-

 тов матрицы в интервале значений от -n до n с помощью датчика случайных чи-

 сел.

 9.1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений.

 9.2. Выполнить циклический сдвиг заданной матрицы на k позиций вправо

 (влево, вверх, вниз).

 9.3. Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.

 9.4. Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки.

 9.5. Повернуть матрицу на 90 (180, 270) градусов против часовой стрелки.

 9.6 Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое.

 9.7. Уплотнить матрицу, удаляя из нее строки и столбцы, заполненные нулями.

 9.8. Преобразовать строки матрицы таким образом, чтобы элементы, равные нулю, располагались после всех остальных.
 */
public class Task29 {

    public static void main(String[] args) {

        Task29 task29 = new Task29();
        int size = task29.inputMatrixSize();
        System.out.println("Matrix " + size + " x " + size +
                " with random elements from -" + size + " to " + size + ":");
        int[][] randomMatrix = task29.setRandomMatrixElems(size);
        OutputMatrix out = new OutputMatrix();
        out.outputMatrix(randomMatrix);

        System.out.println("\n9.1. Упорядочить строки матрицы в порядке возрастания значений:");
        Task291 task291 = new Task291();
        int[][] sortedRows = task291.sortRowsInAscendingOrder(randomMatrix);
        out.outputMatrix(sortedRows);

        System.out.println("\n9.1. Упорядочить столбцы матрицы в порядке возрастания значений:");
        int [][] sortedColumns = task291.sortColumnsInAscendingOrder(randomMatrix);
        out.outputMatrix(sortedColumns);

        int k = 2;
        System.out.println("\n9.2. Выполнить циклический сдвиг заданной матрицы на " + k + " позиций вправо:");
        Task292 task292 = new Task292();
        int [][] shiftedRight = task292.shiftMatrixRight(randomMatrix, k);
        out.outputMatrix(shiftedRight);

        System.out.println("\n9.2. Выполнить циклический сдвиг заданной матрицы на " + k + " позиций влево:");
        int [][] shiftedLeft = task292.shiftMatrixLeft(randomMatrix, k);
        out.outputMatrix(shiftedLeft);

        System.out.println("\n9.2. Выполнить циклический сдвиг заданной матрицы на " + k + " позиций вниз:");
        int [][] shiftedDown = task292.shiftMatrixDown(randomMatrix, k);
        out.outputMatrix(shiftedDown);

        System.out.println("\n9.2. Выполнить циклический сдвиг заданной матрицы на " + k + " позиций вверх:");
        int[][] shiftedUp = task292.shiftMatrixUp(randomMatrix, k);
        out.outputMatrix(shiftedUp);

        System.out.println("\n9.3. Найти и вывести наибольшее число возрастающих элементов матрицы, идущих подряд.");
        Task293 task293 = new Task293();
        int[] increasedElems = task293.searchMaxAmountOfIncreasedElems(randomMatrix);
        System.out.println(Arrays.toString(increasedElems));

        System.out.println("\n9.3. Найти и вывести наибольшее число убывающих элементов матрицы, идущих подряд.");
        int[] decreasedElems = task293.searchMaxAmountOfDecreasedElems(randomMatrix);
        System.out.println(Arrays.toString(decreasedElems));
    }

    int inputMatrixSize() {
        System.out.println("9 . Please enter size n for matrix n x n: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int size = Integer.valueOf(input);
        return size;
    }

    int[][] setRandomMatrixElems(int mSize) {

        int[][] matrix = new int[mSize][mSize];
        Random random = new Random();

        for (int i = 0; i < mSize; i++) {
            for (int j = 0; j < mSize; j++) {
                matrix[i][j] = -mSize + random.nextInt(mSize + mSize);
            }
        }
        return matrix;
    }

}

