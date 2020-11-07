public class ArrayPrintGreater {
    /* Задача 5
Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
     */
    public static void main(String[] args) {
        int [] a = {1, 52, -65, 85, 904, 1, 3, 2};
        System.out.println("Вывод чисел, удовлетворяющих условию a[i] > i:");
        for (int i = 0; i < a.length; i++) {
            if(a[i] > i){
                System.out.print(a[i] + "   ");
            }
        }
    }
}
