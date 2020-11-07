public class ArrayCounting {
    /* Задача 3
    Дан массив действительных чисел, размерность которого N.
    Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
     */
    public static void main(String[] args) {
        int [] a = {43, -65, 0, 87, -1, 1, 32, 85, -30};
        int countZero = 0;
        int countPositive = 0;
        int countNegative = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == 0){
                countZero++;
            } else if(a[i] > 0){
                countPositive++;
            } else {
                countNegative++;
            }
        }
        System.out.println("Количество отрицательных элементов массива - " + countNegative);
        System.out.println("Количество положительных элементов массива - " + countPositive);
        System.out.println("Количество нулевых элементов массива - " + countZero);
    }
}
