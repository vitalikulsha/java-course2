import java.util.Arrays;

import static java.lang.Math.random;

public class InsertionSort_4 {
    /* Task 4
    Реализуйте сортировку вставками.
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
        //отсортируем исходный массив методом вставок
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (current < array[j]) {
                    array[j + 1] = array[j];
                } else break;
            }
            array[j + 1] = current;
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}
