import static java.lang.Math.random;

public class MatrixSortLine_12 {
    /* Задача 12
    Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
     */
    public static void main(String[] args) {
        int n = 4;
        int m = 6;
        int min = 0;
        int max = 5;
        int[][] matrix = new int[n][m];
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (random() * ((max - min) + 1) + min);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //сортируем строки матрицу по возрастанию
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i].length - 1; k++) {
                    if (matrix[i][k] > matrix[i][k + 1]) {
                        int temp = matrix[i][k];
                        matrix[i][k] = matrix[i][k + 1];
                        matrix[i][k + 1] = temp;
                    }
                }
            }
        }
        System.out.println("Строки отсортированы по возрастанию:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //сортируем строки матрицу по убыванию
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i].length - 1; k++) {
                    if (matrix[i][k] < matrix[i][k + 1]) {
                        int temp = matrix[i][k+1];
                        matrix[i][k+1] = matrix[i][k];
                        matrix[i][k] = temp;
                    }
                }
            }
        }
        System.out.println("Строки отсортированы по убыванию:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
