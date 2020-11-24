import java.util.Arrays;

public class ArrayReplacement_02 {
    /* Задача 2
Дана последовательность действительных чисел а1 ,а2 ,..., ап.
Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
     */
    public static void main(String[] args) {
        int num = -5;
        int[] array = {2, -5, 9, 75, -65, 0, 102, -657};
        replacement(array, num);
    }

    public static void replacement(int[] array, int num) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > num) {
                array[i] = num;
                count++;
            }
        }
        System.out.println("В массиве a[n] все числа, больше Z = " + num + " были замененны этим числом. \n" +
                "Результатом замены стал новый массив: " + Arrays.toString(array) + ". Количество замен - " + count + ".");
    }
}
