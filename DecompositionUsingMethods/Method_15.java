import static java.lang.Math.*;

import java.util.Arrays;

public class Method_15 {
    /* Task 15
    Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
    (например, 1234, 56789). Для решения задачи использовать декомпозицию.
     */
    public static void main(String[] args) {
        int n = 4; //количество цифр в числе, n должно быть не меньше 2
        increasingSequence(n, numbers(n));
    }

    //создаем массив из n-значного числа
    public static int[] arrayOfNumbers(int num) {
        char[] ch = Integer.toString(abs(num)).toCharArray();
        int[] array = new int[ch.length];
        for (int i = 0; i < ch.length; i++) {
            array[i] = Character.getNumericValue(ch[i]);
        }
        return array;
    }

    //создаем массив из n-значных чисел (n - количество цифр в числе)
    public static int[] numbers(int n) {
        int[] array = new int[((int) pow(10, n)) - (int) pow(10, n - 1)];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) pow(10, n - 1) + i;
        }
        return array;
    }

    //массив чисел преобразуем в число
    public static int numberFromTheArray(int[] array) {
        String string = "";
        for (int i = 0; i < array.length; i++) {
            string = string + String.valueOf(array[i]);
        }
        int number = Integer.parseInt(string);
        return number;
    }

    //находим все натуральные n-значные числа со строго возрастающей последовательностью
    public static void increasingSequence(int n, int[] array) {
        System.out.println(n + "-значные числа со строго возрастающей последовательностью:");
        for (int i = 0; i < array.length; i++) {
            int[] temp = arrayOfNumbers(array[i]);
            int count = 0;
            for (int j = 0; j < temp.length - 1; j++) {
                if (temp[j + 1] - temp[j] == 1) {
                    count++;
                } else break;
            }
            if (count == temp.length - 1) {
                System.out.println(numberFromTheArray(temp));
            }
        }
    }
}
