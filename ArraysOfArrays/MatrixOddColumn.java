public class MatrixOddColumn {
    /* Задача 1
    Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
     */
    public static void main(String[] args) {
        int[][] matrix = new int [6][];
        //рваная матрица
        matrix[0] = new int[] {2, 3, 5};
        matrix[1] = new int[] {10, 6, 8, 9};
        matrix[2] = new int[] {9, 8, 9, 10, 1};
        matrix[3] = new int[] {1, 0, 68, 98};
        matrix[4] = new int[] {100, 9, 0};
        matrix[5] = new int[] {5, 2};
        //начинаем с первого нечетного столбца и потом переходим к следующему (+2)
        for (int i = 1; i < matrix.length; i = i+2) {
            if(matrix[i][0] > matrix[i][matrix[i].length-1]){   //сравниваем первый элемент с последний
                System.out.print("Столбец матрицы matrix[" + i + "]: ");
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();

            }
        }
    }
}
