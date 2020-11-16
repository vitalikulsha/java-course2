import java.util.Arrays;

import static java.lang.Math.random;

public class ShellSort_5 {
    /* Task 5
    Реализуйте сортировку Шелла.
     */
    public static void main(String[] args) {
        int minNum = 0;
        int maxNum = 100;
        int n = 20;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (random() * ((maxNum - minNum) + 1) + minNum);
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));
        //отсортируем исходный массив методом Шелла
        for (int step = array.length / 2; step > 0; step /= 2) {
            for (int i = step; i < array.length; i++) {
                for (int j = i - step; j >= 0 && array[j] > array[j + step]; j -= step) {
                    int temp = array[j];
                    array[j] = array[j + step];
                    array[j + step] = temp;
                }
            }
        }

        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}
