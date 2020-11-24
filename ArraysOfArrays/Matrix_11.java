import static java.lang.Math.*;

public class Matrix_11 {
    /* Задача 11
    Матрицу 10x20 заполнить случайными числами от 0 до 15.
    Вывести на экран саму матрицу и номера строк,
    в которых число 5 встречается три и более раз.
     */
    public static void main(String[] args) {
        int min = 0;
        int max = 15;
        int matrix[][] = new int[10][20];
        int count = 0;//счетчик чисел 5
        int countZero = 0;
        // заполняем матрицу случайными числами от 0 до 15
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (random() * ((max - min) + 1) + min);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //поиск чисел 5
        System.out.print("Номера строк, в которых число 5 встречается 3 и более раз: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.print(i + " ");
                countZero++;
            }
            count = 0;
        }
        if (countZero == 0) {
            System.out.println("такие строки отсутствуют");
        }
    }
}