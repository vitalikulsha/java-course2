import static java.lang.Math.*;

public class Method_11 {
    /* Task 11
Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
     */
    public static void main(String[] args) {
        int num1 = 1082;
        int num2 = -108;
        numberOfDigits(num1, num2);
    }

    public static void numberOfDigits(int num1, int num2) {
        char[] ch1 = Integer.toString(abs(num1)).toCharArray();
        char[] ch2 = Integer.toString(abs(num2)).toCharArray();
        if (ch1.length > ch2.length) {
            System.out.println("Количество цифр в числе " + num1 + " больше, чем в числе " + num2);
        } else if (ch1.length == ch2.length) {
            System.out.println("Количество цифр в числе " + num1 + " равно количеству цифр в числе " + num2);
        } else {
            System.out.println("Количество цифр в числе " + num2 + " больше, чем в числе " + num1);
        }
    }
}
