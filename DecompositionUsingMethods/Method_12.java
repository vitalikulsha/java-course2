import java.util.Arrays;

public class Method_12 {
    /* Task 12
    Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
    элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
     */
    public static void main(String[] args) {
        int numK = 11;
        int numN = 100;
        int[] array = newArray(numN, numK);
        System.out.println("При K = " + numK + " и N = " + numN + ", массив чисел будет выглядеть так: " + Arrays.toString(array));
    }

    //создаем массив из числа
    public static int[] arrayOfNumbers(int num) {
        char[] charArr = Integer.toString(num).toCharArray();
        int[] array = new int[charArr.length];
        for (int i = 0; i < charArr.length; i++) {
            array[i] = Character.getNumericValue(charArr[i]);
        }
        return array;
    }

    //находим сумму цифр числа
    public static int sumOfOddNumbers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    //определяем длину массива, в который будем записывать числа, удовлетворяющие условию задачи
    public static int lengthArray(int numN, int numK) {
        int length = 0;
        for (int i = 0; i <= numN; i++) {
            if (sumOfOddNumbers(arrayOfNumbers(i)) == numK) {
                length++;
            }
        }
        return length;
    }

    //создаем массив чисел согласно условию задачи
    public static int[] newArray(int numN, int numK) {
        int[] array = new int[lengthArray(numN, numK)];
        int j = 0;
        for (int i = 0; i <= numN; i++) {
            if (sumOfOddNumbers(arrayOfNumbers(i)) == numK) {
                array[j] = i;
                j++;
            }
        }
        return array;
    }
}
