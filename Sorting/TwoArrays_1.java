import java.util.Arrays;

import static java.lang.Math.random;

public class TwoArrays_1 {
    /*
    Заданы два одномерных массива с различным количеством элементов и натуральное число k.
    Объединить их в один массив, включив второй массив между k-м и (k+1)-м элементами первого,
    при этом не используя дополнительный массив.
     */
    public static void main(String[] args) {
        int k = 5; //натуральное число, не больше длины первого массива (А) на 1
        int minNum = 0;
        int maxNum = 100;
        int lengthA = 20;
        int lengthB = 15;
        int[] arrayA = new int[lengthA + lengthB];
        int[] arrayB = new int[lengthB];
        for (int i = 0; i < lengthA; i++) {
            arrayA[i] = (int) (random() * ((maxNum - minNum) + 1) + minNum);
        }
        System.out.println("Исходный массив A: " + Arrays.toString(arrayA));
        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = (int) (random() * ((maxNum - minNum) + 1) + minNum);
        }
        System.out.println("Исходный массив B: " + Arrays.toString(arrayB));
        //копируем часть массива после k в конец массива
        System.arraycopy(arrayA, k, arrayA, lengthA, lengthA-k);
        //копируем массив В в массив А после k
        System.arraycopy(arrayB, 0, arrayA, k+1, lengthB);
        System.out.println("Новый массив: " + Arrays.toString(arrayA));
    }
}
