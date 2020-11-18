import static java.lang.Math.*;

public class Method_02 {
    /* Task 02
    Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
     */
    public static void main(String[] args) {
        int A = 24;
        int B = 9;
        int C = 15;
        int D = 3;
        System.out.println("Наибольший общий делитель чисел " + A + ", " + B + ", " + C + ", " + D + " равно " + greatestCommonDivisor(A, B, C, D));
    }

    //находим наибольший общий делитель (НОД)
    public static int greatestCommonDivisor(int A, int B, int C, int D) {
        int result = 1;
        int min = min(min(A, B), min(C, D)); //находим минимальное из двух число для начала поиска НОД
        for (int i = min; i > 0; i--) { //перебираем числа от минимального из двух и до 1
            if (A % i == 0 && B % i == 0 && C % i == 0 && D % i == 0) {
                result = i;
                break;
            }
        }
        return result;
    }
}

