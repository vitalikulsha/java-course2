public class MatrixSquare5 {
    /* Задача 5
    Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    1  1  1  1
    2  2  2  0
    3  3  0  0
    4  0  0  0
     */
    public static void main(String[] args) {
        int numElement = 6; //порядок квадратной матрицы - четное число!
        int[][] matrix = new int[numElement][numElement];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                if (i <= j) {
                    System.out.print((matrix[i][j] = (i + 1)) + " ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}