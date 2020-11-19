import static java.lang.Math.*;

public class Method_06 {
    /* Task 06
Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
     */
    public static void main(String[] args) {
        int A = randomNumber();
        int B = randomNumber();
        int C = randomNumber();
        mutuallyPrimeNumbers(A, B, C);
    }

    public static void mutuallyPrimeNumbers(int A, int B, int C) {
        int min = min(min(abs(A), abs(B)), abs(C));
        System.out.print("Числа " + A + ", " + B + " и " + C);
        int count = 0;
        for (int i = min; i > 1; i--) { //перебираем числа от минимального из двух и до 1
            if (A % i == 0 && B % i == 0 && C % i == 0) {
                System.out.println(" не являются взаимно простыми, наибольший общий делитель равен " + i);
                break;
            } else {
                count++;
            }
            if (count == min - 1) {
                System.out.println(" числа являются взаимно простыми");
            }
        }
        if (abs(A) == 1 || abs(B) == 1 || abs(C) == 1) {
            if (A == 0 || B == 0 || C == 0) {
                System.out.println(" являются не взаимно простыми, т.к. одно из чисел равно 0");
            } else {
                System.out.println(" являются взаимно простыми, т.к. одно из чисел равно 1 или -1");
            }
        }

    }

    public static int randomNumber() {
        int min = -100;
        int max = 100;
        int num = (int) (random() * ((max - min) + 1) + min);
        return num;
    }


}
