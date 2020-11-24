import static java.lang.Math.random;

public class MatrixSearchMax_15 {
    /* Задача 15
    Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
     */
    public static void main(String[] args) {
        int numLine = 5;
        int numColumn = 6;
        int min = 0;
        int max = 100;
        int numMax = Integer.MIN_VALUE;
        int[][] matrix = new int[numLine][numColumn];
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (random() * ((max - min) + 1) + min);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //ищем наибольший элемент матрицы
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > numMax) {
                    numMax = matrix[i][j];
                }
            }
        }
        System.out.println("Наибольший элемент матрицы - " + numMax);
        //заменяем все нечетные элементы матрицы на наибольший элемент
        System.out.println("Матрица с замененными нечетными элементами на " + numMax + ":");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 1) {
                    matrix[i][j] = numMax;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}