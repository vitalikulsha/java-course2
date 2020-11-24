import static java.lang.Math.*;

public class MatrixSumOfElements_09 {
    /* Задача 9
    Задана матрица неотрицательных чисел.
    Посчитать сумму элементов в каждом столбце.
    Определить, какой столбец содержит максимальную сумму.
     */
    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        int numLine = 4;
        int numColumn = 6;
        int[] sum = new int[numColumn];
        int maxSum = 0;
        int index = 0;
        int[][] matrix = new int[numLine][numColumn];
        //заполняем массив случайными числами и выводим на экран
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (random() * ((max - min) + 1)) + min;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //подсчет суммы в столбцах и определение максимальной суммы и номера столбца
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum[i] += matrix[j][i];
            }
            if (sum[i] > maxSum) {
                maxSum = sum[i];
                index = i;
            }
            System.out.println("Сумма чисел " + i + " столбца равна sum = " + sum[i]);
        }
        System.out.println("Столбец № " + index + " содержит максимальную сумму чисел, равную sum = " + sum[index]);
    }
}
