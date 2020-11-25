import static java.lang.Math.*;

public class Method_02 {
    /* Task 02
    Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
     */
    public static void main(String[] args) {
        int numA = 24;
        int numB = 9;
        int numC = 15;
        int numD = 3;
        System.out.println("Наибольший общий делитель чисел " + numA + ", " + numB + ", " + numC + ", " + numD + " равно " + greatestCommonDivisor(numA, numB, numC, numD));
    }

    //находим наибольший общий делитель (НОД)
    public static int greatestCommonDivisor(int numA, int numB, int numC, int numD) {
        int result = 1;
        int min = min(min(numA, numB), min(numC, numD)); //находим минимальное из двух число для начала поиска НОД
        for (int i = min; i > 0; i--) { //перебираем числа от минимального из двух и до 1
            if (numA % i == 0 && numB % i == 0 && numC % i == 0 && numD % i == 0) {
                result = i;
                break;
            }
        }
        return result;
    }
}

