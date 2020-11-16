import java.util.Arrays;

import static java.lang.Math.random;

public class BubbleSort_3 {
    /* Task 3
    Реализуйте сортировку обменами.
     */
    public static void main(String[] args) {
        int minNum = 0;
        int maxNum = 100;
        int n = 20;
        boolean sorted = true;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (random() * ((maxNum - minNum) + 1) + minNum);
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));
        //отсортируем исходный массив методом обменами
        while(sorted) {
            sorted = false;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = true;
                }
            }
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}
