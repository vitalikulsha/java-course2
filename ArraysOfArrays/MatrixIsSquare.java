import static java.lang.Math.*;
public class MatrixIsSquare {
    /* Задача 2
    Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
     */
    public static void main(String[] args) {
        int max = 100; //конец диапазона чисел матрицы
        int min = 0; // начало диапазона чисел матрицы
        int n = 6; // количество элементов в строке и столбце
        int[][] matrix = new int[n][n];//квадратная матрица
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < matrix.length; i++) { //заполняем матрицу случайными числами
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (random()*((max - min)+1)) + min;
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
        // диагональ матрицы слева направа (в этом случае [i] [j=i])
        System.out.println("Диагональ матрицы слева направо: ");
        for (int i = 0; i < matrix.length; i++) {
             System.out.print(matrix[i][i] + " ");
        }
        // диагональ матрицы справа налево (в этом случае [i] [j=(length-1)-i]
        System.out.println("\nДиагональ матрицы справо налево: ");
        for (int i = 0; i < matrix.length; i++) {
                 System.out.print(matrix[i][matrix.length-1-i] + " ");
         }
    }
}
