public class ArrayPrintGreater_05 {
    /* Задача 5
Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
     */
    public static void main(String[] args) {
        int[] array = {1, 52, -65, 85, 904, 1, 3, 2};
        System.out.println("Вывод чисел, удовлетворяющих условию a[i] > i:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.print(array[i] + "   ");
            }
        }
    }
}