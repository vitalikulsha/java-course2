import static java.lang.Math.random;

public class MatrixOddColumn {
    /* Задача 1
    Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
     */
    public static void main(String[] args) {
        int max = 100; //конец диапазона чисел матрицы
        int min = 0; // начало диапазона чисел матрицы
        int numElementLine = 6; // количество элементов в строке
        int numElementColumn = 8; // количество элементов в толбце
        int[][] matrix = new int[numElementLine][numElementColumn];
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < matrix.length; i++) { //заполняем матрицу случайными числами
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (random() * ((max - min) + 1)) + min;
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
        //начинаем с первого нечетного столбца и потом переходим к следующему (+2)
        System.out.println("Нечетные столбцы, у которых первый элемент больше последнего:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j = j + 2) {
                if (matrix[0][j] > matrix[matrix.length - 1][j]) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
