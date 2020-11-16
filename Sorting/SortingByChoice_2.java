import java.util.Arrays;

import static java.lang.Math.*;

public class SortingByChoice_2 {
    /* Task 2
    Реализуйте сортировку выбором.
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
        //отсортируем исходный массив методом выбора
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}
