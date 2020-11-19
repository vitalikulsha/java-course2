public class Method_07 {
    /*Task 07
Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
     */
    public static void main(String[] args) {
        System.out.println("Сумма факториалов нечетных чисел от 1 до 9 равна " + sumFactorial());
    }

    public static int factorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int sumFactorial() {
        int sum = 0;
        for (int i = 1; i <= 9; i = i + 2) {
            sum = sum + factorial(i);
        }
        return sum;
    }
}
