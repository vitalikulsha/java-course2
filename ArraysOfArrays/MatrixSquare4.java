public class MatrixSquare4 {
    /* Задача 4
     Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
     1  2   3  ... n
     n n-1 n-2 ... 1
     */
    public static void main(String[] args) {
        int n = 6; //порядок квадратной матрицы - четное число!
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i % 2 !=0 ){
                    System.out.print((matrix[i][j] = (n - j)) + " ");//вывод четной строки
                } else {
                    System.out.print((matrix[i][j] = (j + 1)) + " ");//вывод нечетной строки
                }
            }
            System.out.println();
        }
    }
}
