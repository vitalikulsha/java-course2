public class ArrayMultiple {
    /* Задача 1
    В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
     */
    public static int K = 3;
    public static void main(String[] args) {
    int [] A = {4, 6, 7, 65, 87, 45, 34, 32};
    int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % K == 0){
                sum += A[i];
            }
        }
        System.out.println("Сумма элементов массива A[N], кратных K = " + K + " равна sum = " + sum);
    }

}
