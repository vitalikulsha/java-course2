public class Method_13 {
    /* Task 13
Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
Для решения задачи использовать декомпозицию.
     */
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Пары чисел-близнецов на отрезке от " + number + " до " + 2 * number + ":");
        int[][] matrix = createAnArrayOfArrays(number);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    //создаем массив с последовательными числами на отрезке [n, 2n]
    public static int[] createAnArray(int number) {
        int[] array = new int[(2 * number - number) + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = number + i;
        }
        return array;
    }

    //создаем матрицу, состояющую из чисел-близнецов
    public static int[][] createAnArrayOfArrays(int number) {
        int[][] matrix = new int[2 * number - number - 1][2];
        for (int i = 0; i < createAnArray(number).length - 2; i++) {
            matrix[i][0] = createAnArray(number)[i];
            matrix[i][1] = createAnArray(number)[i + 2];
        }
        return matrix;
    }
}
