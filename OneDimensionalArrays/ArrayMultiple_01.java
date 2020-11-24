public class ArrayMultiple_01 {
    /* Задача 1
    В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
     */
    public static void main(String[] args) {
        int num = 3;
        int[] array = {4, 6, 7, 65, 87, 45, 34, 32};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % num == 0) {
                sum += array[i];
            }
        }
        System.out.println("Сумма элементов массива A[N], кратных K = " + num + " равна sum = " + sum);
    }
}