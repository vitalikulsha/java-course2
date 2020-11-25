import static java.lang.Math.*;

public class Method_06 {
    /* Task 06
Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
     */
    public static void main(String[] args) {
        int numA = randomNumber();
        int numB = randomNumber();
        int numC = randomNumber();
        mutuallyPrimeNumbers(numA, numB, numC);
    }

    public static void mutuallyPrimeNumbers(int numA, int numB, int numC) {
        int min = min(min(abs(numA), abs(numB)), abs(numC));
        System.out.print("Числа " + numA + ", " + numB + " и " + numC);
        int count = 0;
        for (int i = min; i > 1; i--) { //перебираем числа от минимального из двух и до 1
            if (numA % i == 0 && numB % i == 0 && numC % i == 0) {
                System.out.println(" не являются взаимно простыми, наибольший общий делитель равен " + i);
                break;
            } else {
                count++;
            }
            if (count == min - 1) {
                System.out.println(" числа являются взаимно простыми");
            }
        }
        if (abs(numA) == 1 || abs(numB) == 1 || abs(numC) == 1) {
            if (numA == 0 || numB == 0 || numC == 0) {
                System.out.println(" являются не взаимно простыми, т.к. одно из чисел равно 0");
            } else {
                System.out.println(" являются взаимно простыми, т.к. одно из чисел равно 1 или -1");
            }
        }
    }

    public static int randomNumber() {
        int min = -100;
        int max = 100;
        return (int) (random() * ((max - min) + 1) + min);
    }
}
