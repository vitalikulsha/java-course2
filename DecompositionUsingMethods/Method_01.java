public class Method_01 {
    /*Task 01
    Написать метод(методы) для нахождения наибольшего общего делителя
    и наименьшего общего кратного двух натуральных чисел:
     */
    public static void main(String[] args) {
        int A = 45;
        int B = 12;
        System.out.println("Наибольший общий делитель чисел " + A + " и " + B + " равен " + greatestCommonDivisor(A, B));
        System.out.println("Наименьшее общее кратное чисел " + A + " и " + B + " равно " + smallestCommonMultiple(A, B));
    }

    //находим наибольший общий делитель (НОД)
    public static int greatestCommonDivisor(int A, int B) {
        int result = 1;
        int min = A > B ? B : A; //находим минимальное из двух число для начала поиска НОД
        for (int i = min; i > 0; i--) { //перебираем числа от минимального из двух и до 1
            if (A % i == 0 && B % i == 0) {
                result = i;
                break;
            }
        }
        return result;
    }
// находим наименьшее общее кратное (НОК)
    public static int smallestCommonMultiple(int A, int B) {
        int result = 1;
        int max = A > B ? A : B;//находим максимальное из двух число для начало поиска НОК
        for (int i = max; i <= A * B; i++) {//перебираем числа от максимального до A*B
            if (i % A == 0 && i % B == 0) {
                result = i;
                break;
            }
        }
        return result;
    }
}
