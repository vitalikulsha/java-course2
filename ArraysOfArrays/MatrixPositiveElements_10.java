import static java.lang.Math.random;

public class MatrixPositiveElements_10 {
    /* Задача 10
    Найти положительные элементы главной диагонали квадратной матрицы.
     */
    public static void main(String[] args) {
        int min = -100;
        int max = 100;
        int numElements = 4;
        int count = 0;//счетчик полодительных элементов
        int[][] matrix = new int[numElements][numElements];
        //заполняем массив случайными числами и выводим на экран
        System.out.println("Исходная квадратная матрица");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (random() * ((max - min) + 1)) + min;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //находим положительные элементы главной диагонали матрицы
        System.out.print("Положительные элементы главной диагонали матрицы: ");
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0) {
                System.out.print(matrix[i][i] + " ");
                count++;
            }
        }
        //вывод сообщения, если положительные элементы отсутствуют
        if (count == 0) {
            System.out.println("отсутсвуют");
        }
    }
}