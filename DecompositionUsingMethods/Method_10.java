import java.util.Arrays;

public class Method_10 {
    /* Task 10
    Дано натуральное число N. Написать метод(методы) для формирования массива,
    элементами которого являются цифры числа N.
     */
    public static void main(String[] args) {
        int num = 3005452;
        System.out.println("Массив из числа N = " + num + ": " + Arrays.toString(arrayOfNumbers(num)));
    }

    public static int[] arrayOfNumbers(int num) {
        char[] ch = Integer.toString(num).toCharArray();
        int[] array = new int[ch.length];
        for (int i = 0; i < ch.length; i++) {
            array[i] = Character.getNumericValue(ch[i]);
        }
        return array;
    }
}
