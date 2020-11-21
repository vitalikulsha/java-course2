import static java.lang.Math.*;

import java.util.Arrays;

public class Method_08 {
    /* Task 08
Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива
с номерами от k до m.
     */
    public static void main(String[] args) {
        //numM должно быть больше numK минимум на 3, numM должно быть меньше длины массива array
        int numK = 5;
        int numM = 9;
        int[] arrayD = createAnArray(numM);
        System.out.println("Исходный массив случайных чисел: " + Arrays.toString(arrayD));
        int[] arraySum = anArrayOfAmounts(numK, numM, arrayD);
        System.out.println("Сумма трех последовательно расположенных элементов с номерами от " + numK + " до " + numM + ": ");
        for (int i = 0; i < arraySum.length; i++) {
            System.out.println("[" + numK + "," + (numK + 1) + "," + (numK + 2) + "]: " + arraySum[i]);
            numK++;
        }
    }

    //создаем массив случайных чисел, длина массива должна быть не менее числа numM+1
    public static int[] createAnArray(int numM) {
        int[] array = new int[numM + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (random() * ((100 + 100) + 1) - 100);//заполняем массив случайными числами от -100 до 100
        }
        return array;
    }

    //находим сумму трех последовательно расположенных элементов
    public static int sumOfThreeElements(int numK, int[] array) {
        int sum = array[numK] + array[numK + 1] + array[numK + 2];
        return sum;
    }

    // создаем массив сумм трех последовательно расположенных элементов
    public static int[] anArrayOfAmounts(int numK, int numM, int[] array) {
        int[] arraySum = new int[(numM - numK) - 1];
        int j = 0;
        for (int i = numK; i < numM - 1; i++) {
            arraySum[j] = sumOfThreeElements(i, array);
            j++;
        }
        return arraySum;
    }
}
