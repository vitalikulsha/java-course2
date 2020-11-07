import java.util.Arrays;

public class ArrayReplacement {
    /* Задача 2
Дана последовательность действительных чисел а1 ,а2 ,..., ап.
Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
     */
    public static int Z = -5;
    public static void main(String[] args) {
    int [] a = {2, -5, 9, 75, -65, 0, 102, -657};
    replacement(a);
    }
    public static void replacement (int [] a){
       int count = 0;
        for (int i = 0; i < a.length; i++) {
           if(a[i] > Z){
               a[i] = Z;
               count ++;
           }
        }
        System.out.println("В массиве a[n] все числа, больше Z = " + Z + " были замененны этим числом. \n" +
        "Результатом замены стал новый массив: " + Arrays.toString(a) + ". Количество замен - " + count + ".");
    }


}
