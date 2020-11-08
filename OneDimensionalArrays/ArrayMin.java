import java.util.Random;
import java.util.Arrays;
public class ArrayMin {
    /* Задача 8
    Дана последовательность целых чисел а1 ,а2 ,..., аn.
    Образовать новую последовательность, выбросив из исходной те члены, которые равны min(а1 ,а2 ,..., аn).
     */
    public static void main(String[] args) {
        Random random = new Random();
        int n = 10;
        int iMin = 0; //начальный индекс минимального числа
        int min = Integer.MAX_VALUE; //максимальное число для определения минимального
        int[] array = new int[n];
        int[] arrayMin = new int[n-1];
        //заполняем массив array числами типа int
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        //находим минимальное число массива array и его индекс
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
                iMin = i;
            }
        }                   //заполняем массив arraysMin
        //копируем элементы из array до индекса iMin в arrayMin
        System.arraycopy(array,0, arrayMin, 0, iMin);
        //копируем элементы из array после индекса iMin в arrayMin
        System.arraycopy(array,(iMin+1), arrayMin, iMin, (arrayMin.length-iMin));
        System.out.println("Исходный массив:" + Arrays.toString(array));
        System.out.println("Исключаемое минимальное число: " + min);
        System.out.println("Новый массив: " + Arrays.toString(arrayMin));
    }
}
