import static java.lang.Math.*;

public class Method_09 {
    /* Task 09
    Даны числа X, Y, Z, Т — длины сторон четырехугольника.
    Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
     */
    public static void main(String[] args) {
        int sideA = 6;
        int sideB = 10;
        int sideC = 11;
        int sideD = 12;
        boolean isTriangleExists = inspectionTriangle(sideA, sideB, sideC, sideD);
        if (isTriangleExists) {
            System.out.printf("Площадь четырехугольника равна %.2f", squareQuadrilateral(sideA, sideB, sideC, sideD));
        } else {
            System.out.println("Четырехугольника с такими сторонами не существует");
        }
    }

    //разобъем четырехугольник на 2 треугольника, один из которых прямоугольный
    //недостающая сторона второго треугольника, не прямоугольного
    public static double hypotenuse(int sideA, int sideB) {
        return sqrt(sideA * sideA + sideB * sideB);
    }

    //определим площадь четырехугольника как сумма площадей двух треугольников
    public static double squareQuadrilateral(int sideA, int sideB, int sideC, int sideD) {
        double area1 = (sideA * sideB) / 2; //определим площадь прямоугольного треугольника
        double sideE = hypotenuse(sideA, sideB);
        double halfPerimetr = (sideC + sideD + sideE) / 2; //полупериметр второго треугольника
        //определяем площадь второго треугольника по формуле Герона
        double area2 = sqrt(halfPerimetr * (halfPerimetr - sideC) * (halfPerimetr - sideD) * (halfPerimetr - sideE));
        return area1 + area2; //возвращаем площадь четырехугольника (сумма площадей двух треугольников)
    }

    //проверка существования второго треугольника
    public static boolean inspectionTriangle(int sideA, int sideB, int sideC, int sideD) {
        double sideE = hypotenuse(sideA, sideB); //недостающая сторона второго треугольника
        if (sideC > 0 && sideD > 0 && sideE > 0) {
            if (sideC + sideD > sideE && sideC + sideE > sideD && sideD + sideE > sideC) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}