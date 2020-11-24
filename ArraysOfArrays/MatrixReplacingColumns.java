import java.io.*;

import static java.lang.Math.random;

public class MatrixReplacingColumns {
    /* Задача 8
В числовой матрице поменять местами два столбца любых столбца,
т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = 6; // параметр для ограничения количества строк и столбцов в матрице
        int min = 3; // минимальное количество строк и столбцов в матрице
        int numLine = (int) (random() * ((max - min) + 1)) + min; //количество строк [i]
        int numColumn = (int) (random() * ((max - min) + 1)) + min; //количество столбцов [j]
        int[][] matrix = new int[numLine][numColumn];
        int numMax = 100; //конец диапазона чисел матрицы
        int numMin = 0; // начало диапазона чисел матрицы
        //заполняем матрицу случайными числами
        System.out.println("Исходный массив для замены столбцов:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (random() * ((numMax - numMin) + 1)) + numMin;
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Введите число от 0 до " + (numColumn - 1) + " - номер первого столбца для замены  - ");
        int columnFirst = Integer.parseInt(reader.readLine());
        //проверка правильности введенного числа
        while (true) {
            if (columnFirst < 0 || columnFirst > numColumn) {
                System.out.print("Введено неверное число, введите другое - ");
                columnFirst = Integer.parseInt(reader.readLine());
            } else
                break;
        }
        System.out.print("Введите число от 0 до " + (numColumn - 1) + " - номер второго столбца для замены  - ");
        int columnSecond = Integer.parseInt(reader.readLine());
        while (true) {
            if (columnSecond < 0 || columnSecond > numColumn || columnSecond == columnFirst) {
                System.out.print("Введено неверное число, введите другое - ");
                columnSecond = Integer.parseInt(reader.readLine());
            } else
                break;
        }
        //производим замену столбцов
        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][columnFirst];
            matrix[i][columnFirst] = matrix[i][columnSecond];
            matrix[i][columnSecond] = temp;
        }
        //Вывод массива с замененными столбцами
        System.out.println("Массив после замены столбцов");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}