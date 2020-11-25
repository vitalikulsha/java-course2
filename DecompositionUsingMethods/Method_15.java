import static java.lang.Math.*;

public class Method_15 {
    /* Task 15
    Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
    (например, 1234, 56789). Для решения задачи использовать декомпозицию.
     */
    public static void main(String[] args) {
        int num = 3; //количество цифр в числе, num должно быть не меньше 2
        increasingSequence(num, array(num));
    }

    //создаем массив из числа
    public static int[] arrayNumbers(int num) {
        char[] charArr = Integer.toString(num).toCharArray();
        int[] array = new int[charArr.length];
        for (int i = 0; i < charArr.length; i++) {
            array[i] = Character.getNumericValue(charArr[i]);
        }
        return array;
    }

    //создаем массив из n-значных чисел (n - количество цифр в числе)
    public static int[] array(int num) {
        int[] array = new int[((int) pow(10, num)) - (int) pow(10, num - 1)];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) pow(10, num - 1) + i;
        }
        return array;
    }

    //массив чисел преобразуем в число
    public static int number(int[] array) {
        String string = "";
        for (int i = 0; i < array.length; i++) {
            string = string + String.valueOf(array[i]);
        }
        return Integer.parseInt(string);
    }

    //находим все натуральные n-значные числа со строго возрастающей последовательностью
    public static void increasingSequence(int n, int[] array) {
        System.out.println(n + "-значные числа со строго возрастающей последовательностью:");
        for (int i = 0; i < array.length; i++) {
            int[] temp = arrayNumbers(array[i]);
            int count = 0;
            for (int j = 0; j < temp.length - 1; j++) {
                if (temp[j + 1] - temp[j] == 1) {
                    count++;
                } else break;
            }
            if (count == temp.length - 1) {
                System.out.println(number(temp));
            }
        }
    }
}
