import static java.lang.Math.random;

public class MatrixPrintColumnAndLine {
    /* Задача 3
    Дана матрица. Вывести k-ю строку и p-й столбец матрицы
     */
    public static void main(String[] args) {
        int max = 0; //начало диапазона чисел матрицы
        int min = 100; //конец диапазона чисел матрицы
        int n = 6; // количество элементов в строке
        int m = 4; // количество элементов в столбце
        int k = (int) (random() * (n+1));//индекс строки для вывода
        int p = (int) (random() * (m+1));//индекс столбца для вывода
        int[][] matrix = new int[n][m];//прямоугольная матрица
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < matrix.length; i++) { //заполняем матрицу случайными числами
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (random() * ((max - min)+1)) + min;
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Вывод строки с индексом k = " + k + ": ");
        for (int j = 0; j < matrix[k].length; j++) {
            System.out.print(matrix[k][j] + " ");
            }
        System.out.print("\nВывод столбца с индексом p = " + p + ": ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][p] + " ");

        }
    }
}
