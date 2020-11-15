import static java.lang.Math.random;

public class MatrixSortColumn_13 {
    /* Задача 13
    Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
     */
    public static void main(String[] args) {
        int n = 5;
        int m = 6;
        int min = 0;
        int max = 9;
        int[][] matrix = new int[n][m];
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (random() * ((max - min) + 1) + min);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //сортируем столбцы матрицы по убыванию
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                for (int k = 0; k < matrix[j].length; k++) {
                    if (matrix[i][k] > matrix[j][k]) {
                        int temp = matrix[i][k];
                        matrix[i][k] = matrix[j][k];
                        matrix[j][k] = temp;
                    }
                }
            }
        }
        System.out.println("Стобцы отсортированы по убыванию:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //сортируем столбцы матрицы по возрастанию
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                for (int k = 0; k < matrix[j].length; k++) {
                    if (matrix[i][k] < matrix[j][k]) {
                        int temp = matrix[j][k];
                        matrix[j][k] = matrix[i][k];
                        matrix[i][k] = temp;
                    }
                }
            }
        }
        System.out.println("Стобцы отсортированы по возрастанию:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
