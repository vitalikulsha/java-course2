import static java.lang.Math.*;

public class Method_17 {
    /* Task 17
    Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
    Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
     */
    public static void main(String[] args) {
        int num = 11;
        System.out.println("Количество вычитаний из числа " + num + " равно " + subtraction(num));
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

    //найдем сумму чисел массива
    public static int sumOfOddNumbers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    //подсчитываем количество вычитаний, пока число не будет равно или меньше нуля
    public static int subtraction(int num) {
        int count = 1;
        while (true) {
            int temp = num - sumOfOddNumbers(arrayOfNumbers(num));
            if (temp > 0) {
                num = temp;
                count++;
            } else break;
        }
        return count;
    }

}
