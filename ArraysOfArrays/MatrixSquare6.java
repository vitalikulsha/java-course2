public class MatrixSquare6 {
    /* Задача 6
    Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    1 1 1 1 1 1
    0 1 1 1 1 0
    0 0 1 1 0 0
    0 0 1 1 0 0
    0 1 1 1 1 0
    1 1 1 1 1 1
     */
    public static void main(String[] args) {
        int n = 6; //порядок квадратной матрицы - четное число!
        int[][] matrix = new int[n][n];
        //вывод первой половины матрицы
        for (int i = 0; i < matrix.length/2; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(j >= i && j < matrix[i].length - i) {
                    System.out.print((matrix[i][j] = 1) + " ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
        //вывод второй половины матрицы
        for (int i = matrix.length/2; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(j <= i && j >= matrix[i].length - 1 - i) {
                    System.out.print((matrix[i][j] = 1) + " ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
