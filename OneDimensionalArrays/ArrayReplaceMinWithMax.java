import java.util.Arrays;

public class ArrayReplaceMinWithMax {
    /* Задача 4
    Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
     */
    public static void main(String[] args) {
        int [] a = {1003, -60, 50, 30, 3, 100, 548, -68, 0};
        int max = Integer.MIN_VALUE; //минимальное число int для определения максимального
        int min = Integer.MAX_VALUE; //максимальное число int для определения минимального
        int iMax = 0; //начальный индекс максимального числа
        int iMin = 0; //начальный индекс минимального числа
        for (int i = 0; i < a.length-1; i++) {
            //определяем максимальное число и его индекс
            if(a[i] > max){
                max = a[i];
                iMax = i;
            }
            //определяем минимальное число и его индекс
            if(a[i] < min){
                min = a[i];
                iMin = i;
            }
        }
        //меняем местами max и min
        int result = a[iMax];
        a[iMax] = a[iMin];
        a[iMin] = result;
        System.out.println(Arrays.toString(a));
    }
}
