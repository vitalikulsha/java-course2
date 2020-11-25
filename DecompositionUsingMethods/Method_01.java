public class Method_01 {
    /*Task 01
    Написать метод(методы) для нахождения наибольшего общего делителя
    и наименьшего общего кратного двух натуральных чисел:
     */
    public static void main(String[] args) {
        int numA = 45;
        int numB = 12;
        System.out.println("Наибольший общий делитель чисел " + numA + " и " + numB + " равен " + greatestCommonDivisor(numA, numB));
        System.out.println("Наименьшее общее кратное чисел " + numA + " и " + numB + " равно " + smallestCommonMultiple(numA, numB));
    }

    //находим наибольший общий делитель (НОД)
    public static int greatestCommonDivisor(int numA, int numB) {
        int result = 1;
        int min = numA > numB ? numB : numA; //находим минимальное из двух число для начала поиска НОД
        for (int i = min; i > 0; i--) { //перебираем числа от минимального из двух и до 1
            if (numA % i == 0 && numB % i == 0) {
                result = i;
                break;
            }
        }
        return result;
    }

    // находим наименьшее общее кратное (НОК)
    public static int smallestCommonMultiple(int numA, int numB) {
        int result = 1;
        int max = numA > numB ? numA : numB;//находим максимальное из двух число для начало поиска НОК
        for (int i = max; i <= numA * numB; i++) {//перебираем числа от максимального до A*B
            if (i % numA == 0 && i % numB == 0) {
                result = i;
                break;
            }
        }
        return result;
    }
}
