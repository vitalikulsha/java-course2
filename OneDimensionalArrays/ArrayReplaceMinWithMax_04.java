import java.util.Arrays;

public class ArrayReplaceMinWithMax_04 {
    /* Задача 4
    Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
     */
    public static void main(String[] args) {
        int[] array = {1003, -60, 50, 30, 3, 100, 548, -68, 0};
        //int max = Integer.MIN_VALUE; //минимальное число int для определения максимального
        //int min = Integer.MAX_VALUE; //максимальное число int для определения минимального
        int max = array[0];//пусть первое число массива будет максимальным
        int min = array[0];//пусть первое число массива будет минимальным
        int iMax = 0; //начальный индекс максимального числа
        int iMin = 0; //начальный индекс минимального числа
        for (int i = 0; i < array.length - 1; i++) {
            //определяем максимальное число и его индекс
            if (array[i] > max) {
                max = array[i];
                iMax = i;
            }
            //определяем минимальное число и его индекс
            if (array[i] < min) {
                min = array[i];
                iMin = i;
            }
        }
        //меняем местами max и min
        int result = array[iMax];
        array[iMax] = array[iMin];
        array[iMin] = result;
        System.out.println(Arrays.toString(array));
    }
}