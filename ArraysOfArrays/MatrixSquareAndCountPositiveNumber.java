import static java.lang.Math.*;

public class MatrixSquareAndCountPositiveNumber {
    /* Задача 7
    Сформировать квадратную матрицу порядка N по правилу:
    A[I,J] = sin((sqr(I)+sqr(J))/N)
    и подсчитать количество положительных элементов в ней.
     */
    public static void main(String[] args) {
        int numElements = 6;
        int count = 0;//счетчик положительных элементов матрицы
        double[][] matrix = new double[numElements][numElements]; //используем тип double, т.к. sin всегда меньше 1
        System.out.println("Вывод матрицы согласно условию:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%.3f", (matrix[i][j] = sin((pow(i, 2) - pow(j, 2)) / numElements)));
                System.out.print("  ");
                if (matrix[i][j] > 0) {
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println("Количество положительных элементов матрицы count = " + count);
    }
}