import java.util.Arrays;
public class ArrayReplaceWithZero {
    /* Задача 10
Дан целочисленный массив с количеством элементов п.
Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
     */
    public static void main(String[] args) {
    int [] a = {1, 6, 9, -10, 74, 95, 6, -4, 10, 6, 54};
        for (int i = 1; i < a.length; i = i+2) {
            a[i] = 0;
        }
        System.out.println("Каждый второй элемент массива был заменен нулем. Итоговый массив: " + Arrays.toString(a));
    }
}
