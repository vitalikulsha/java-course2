import static java.lang.Math.*;

public class Method_14 {
    /*
     Натуральное число, в записи которого n цифр, называется числом Армстронга,
     если сумма его цифр, возведенная в степень n, равна самому числу.
     Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
     Например: 1*1*1 + 5*5*5 + 3*3*3 = 153
     */
    public static void main(String[] args) {
        int k = 10000;
        System.out.print("Список чисел Армстронга от 1 до " + k + ": ");
        for (int i = 1; i < k; i++) {
            if (sumOfOddNumbers(arrayOfNumbers(i)) == i) {
                System.out.print(i + ", ");
            }
        }
    }

    //создаем массив из числа
    public static int[] arrayOfNumbers(int num) {
        char[] ch = Integer.toString(num).toCharArray();
        int[] array = new int[ch.length];
        for (int i = 0; i < ch.length; i++) {
            array[i] = Character.getNumericValue(ch[i]);
        }
        return array;
    }

    //найдем сумму чисел массива, возведенную в степень, равную количеству цифр
    public static int sumOfOddNumbers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + (int) pow(array[i], array.length);
        }
        return sum;
    }
}
