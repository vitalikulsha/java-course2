import static java.lang.Math.*;

public class Method_16 {
    /* Task 16
   Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
   Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
     */
    public static void main(String[] args) {
        int num = -11; //n-значное число
        if (oddNumber(arrayOfNumbers(num))) {
            System.out.print("Число " + num + " состоит из нечетных чисел, сумма цифр равна ");
            int sum = sumOfOddNumbers(arrayOfNumbers(num));
            System.out.println(sum);
            System.out.println("Количество четных чисел в сумме цифр числа " + num + " равна " + numberOfEvenNumbers(arrayOfNumbers(sum)));
        } else {
            System.out.println("Число " + num + " содержит четные числа или ноль");
        }
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

    //проверяем число на наличие нечетных чисел
    public static boolean oddNumber(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
            } else break;
        }
        if (count == array.length) {
            return true;
        } else {
            return false;
        }
    }

    //найдем сумму чисел массива
    public static int sumOfOddNumbers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    //определяем количество четных чисел в числе
    public static int numberOfEvenNumbers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
