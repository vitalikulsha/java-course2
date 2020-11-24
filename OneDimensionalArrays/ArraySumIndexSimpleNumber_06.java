public class ArraySumIndexSimpleNumber_06 {
    /* Задача 6
    Задана последовательность N вещественных чисел.
    Вычислить сумму чисел, порядковые номера которых являются простыми числами.
     */
    public static void main(String[] args) {
        int[] array = {2, -20, 6, 8, 36, 98, 78, 102, 687, 0};
        int sum = array[1] + array[2]; //т.к. счет в массиве идет от 0, который не является простым числом
        for (int i = 3; i < array.length; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                } else {
                    sum += array[i];
                }
            }
        }
        System.out.println("Сумма элементов массива, порядковые номера которых являются простыми числами, равна = " + sum);
    }
}