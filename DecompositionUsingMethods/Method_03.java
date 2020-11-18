import static java.lang.Math.*;

public class Method_03 {
    /*Task 03
Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
     */
    public static void main(String[] args) {
        int a = 5;
        System.out.print("Площадь правильного шестиугольника равна - ");
        System.out.printf("%.3f", 6 * areaOfTheTriangle(a));
    }

    public static double areaOfTheTriangle(int a) {
        double area = a * sqrt(3) / 4;
        return area;
    }
}
