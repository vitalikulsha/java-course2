import static java.lang.Math.*;

import java.util.Arrays;

public class Method_05 {
    /* Task 05
 Составить программу, которая в массиве A[N] находит второе по величине число
 (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).
     */
    public static void main(String[] args) {
        int n = 20;
        int min = 0;
        int max = 100;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (random() * ((max - min) + 1) + min);
        }
        System.out.println("Массив чисел: " + Arrays.toString(array));
        System.out.println("Второе по величине число из массива - " + secondMax(array));
    }

    public static int secondMax(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) { //находим максимальное число в массиве
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > secondMax && array[i] != max) {
                secondMax = array[i];
            }
        }
        return secondMax;
    }

}
