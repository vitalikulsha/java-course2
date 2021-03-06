import static java.lang.Math.random;

public class MatrixZeroAndOne_14 {
    /* Задача 14
    Сформировать случайную матрицу m x n,
    состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.
     */
    public static void main(String[] args) {
        int numLine = 5;
        int numColumn = 6;
        // количество строк должно быть больше или равно, чем количество стобцов, минус 1
        int[][] matrix = numLine >= numColumn - 1 ? new int[numLine][numColumn] : new int[numColumn][numLine];
        int[] count = numLine >= numColumn - 1 ? new int[numColumn] : new int[numLine]; //счетчик столбцов
        int countOne = 0; //счетчик единиц
        for (int i = 0; i < count.length; i++) {
            count[i] = i;
        }
        //исходная матрица по умолчанию заполнена нулями
        //заполняем матрицу недостающими единицами согласно условию задачи
        for (int i = 0; i < count.length; i++) { //перебираем номера столбцов по порядку
            while (true) {
                if (countOne == count[i]) break; //если кол-во 1 равно номеру столбца, то выходим из цикла
                int j = (int) (random() * (matrix.length)); //случайный индекс строки
                if (matrix[j][i] == 0) {
                    matrix[j][i] = 1;
                    countOne++;
                }
            }
            countOne = 0;
        }
        System.out.println("Матрица из 0 и 1:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
