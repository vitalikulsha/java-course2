import static java.lang.Math.random;

public class MatrixMagicSquare_16 {
    /* Задача 16
    Магическим квадратом порядка n называется квадратная матрица размера nxn,
    составленная из чисел 1, 2, 3, ..., так, что суммы по каждому столбцу,
    каждой строке и каждой из двух больших диагоналей равны между собой. Построить такой квадрат.
     */
    public static void main(String[] args) {
        int numElements = 4;
        int[] sumLine = new int[numElements];
        int countSumLine = 0;
        int[] sumColumn = new int[numElements];
        int countSumColumn = 0;
        int sumDiagonalLeft = 0;
        int sumDiagonalRight = 0;
        int[][] matrix = new int[numElements][numElements];
        int magicConst = (numElements * (numElements * numElements + 1)) / 2; //Магическая константа нормального волшебного квадрата
        System.out.println("Размер магического квадрата - " + numElements);
        System.out.println("Магическая константа - " + magicConst);
        while (true) {
            for (int i = 0; i < matrix.length; i++) { //заполняем матрицу случаными числами
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = (int) (random() * ((numElements * numElements) + 1)) + 1;
                }
            }
            for (int i = 0; i < sumLine.length; i++) { //сумма чисел в строках
                for (int j = 0; j < matrix[i].length; j++) {
                    sumLine[i] += matrix[i][j];
                }
                if (sumLine[i] == magicConst) {
                    countSumLine++;
                }
            }
            for (int i = 0; i < sumColumn.length; i++) { //сумма чисел в столбцах
                for (int j = 0; j < matrix.length; j++) {
                    sumColumn[i] += matrix[j][i];
                }
                if (sumColumn[i] == magicConst) {
                    countSumColumn++;
                }
            }
            for (int i = 0; i < matrix.length; i++) { //сумма чисел в диагонали слева направо
                sumDiagonalLeft += matrix[i][i];
            }
            for (int i = 0; i < matrix.length; i++) { //сумма чисел в диагонали справа налево
                sumDiagonalRight += matrix[i][matrix.length - 1 - i];
            }
            if (sumDiagonalLeft == magicConst && sumDiagonalRight == magicConst && countSumLine == sumLine.length - 1 && countSumLine == sumColumn.length - 1) {
                break;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}