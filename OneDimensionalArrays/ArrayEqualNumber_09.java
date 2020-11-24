public class ArrayEqualNumber_09 {
    /* Задача 9
В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
Если таких чисел несколько, то определить наименьшее из них.
    */
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 1, 6, 0, 1, 12, 13, 0, 0, 0, 3, 3, 3}; //массив для наглядности работы программы
        int count = 0; //начальное число совпадений
        int countMax = 0; //начальное число максимальных воспадений
        int iMin = 0;
        int num = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]) { //ищем одинаковые числа и фиксируем количество совпадений
                    count++;
                }
            }
            if (count >= countMax) { //сравниваем количество совпадений
                if (count > countMax) {
                    iMin = i;
                } else {
                    iMin = (array[i] < array[iMin]) ? i : iMin;//при равенстве совпадений, ищем индекс минимального числа
                }
                num = array[iMin];
                countMax = count;
            }
            count = 0; // обнуляем счетчик для сравнения следующиего числа
        }
        System.out.println("Искомое число - " + num + ", количество совпадений - " + countMax);
    }

}
