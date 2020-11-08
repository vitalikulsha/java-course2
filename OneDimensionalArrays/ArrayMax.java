import java.util.Random;
import java.io.*;
import java.util.Arrays;
public class ArrayMax {
    /* Задача 7
    Даны действительные числа а1 ,а2 ,..., аn. Найти max(a1+a2n, a2n+a2n-1,...,an+an-1)
    Найдем max (ai+an, a(i+1)+a(n-1), ....)
     */
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите четное количество элементов масива n = ");
        int n = Integer.parseInt(reader.readLine()); //вводим количесвто элементов в массиве
        //проверка правильности введенного числа
        while (true){
        if(n <= 0 || n % 2 != 0 || n >= Integer.MAX_VALUE){
            System.out.print("Введено неверное число, введите другое n = ");
            n = Integer.parseInt(reader.readLine());
        } else
            break;}
        Random random = new Random();
        int[] array = new int[n];
        int max = Integer.MIN_VALUE; //минимальное число для определения максимального
        //заполняем массив array числами типа int
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt()/2; //чтобы в дальнейшем сумма чисел не вышла за пределы int
        }
        //находим max суммы чисел согласно условию
        for (int i = 0; i < array.length; i++) {
            if(i < array.length/2){//проверку осуществляем только до серидины массива, дальше будет повторение
    //условие: сумма первого и последнего элемента массива, затем второго и предпоследнего и т.д.
                if((array[i]+array[array.length-1-i]) > max){
                    max = array[i]+array[(array.length-1-i)];
                }
            } else break;
        }
        System.out.println("Исходный массив array[" + n + "]: " + Arrays.toString(array));
        System.out.println("Максимальная сумма согласно условию max = " + max);
    }
}
