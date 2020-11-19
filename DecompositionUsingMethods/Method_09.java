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
        boolean chek = inspectionOfTheTriangle(sideA, sideB, sideC, sideD);
        if (chek) {
            System.out.print("Площадь четырехугольника равна ");
            System.out.printf("%.2f", squareOfAQuadrilateral(sideA, sideB, sideC, sideD));
        } else {
            System.out.println("Четырехугольника с такими сторонами не существует");
        }
    }
    //разобъем четырехугольник на 2 треугольника, один из которых прямоугольный

    //недостающая сторона второго треугольника
    public static double hypotenuse(int sideA, int sideB) {
        double hypotenuse = sqrt(sideA * sideA + sideB * sideB);
        return hypotenuse;
    }

    //определим площадь четырехугольника как сумма площадей двух треугольников
    public static double squareOfAQuadrilateral(int sideA, int sideB, int sideC, int sideD) {
        double area1 = (sideA * sideB) / 2; //определим площадь прямоугольного треугольника
        double sideE = hypotenuse(sideA, sideB);
        double p = (sideC + sideD + sideE) / 2; //полупериметр второго треугольника
        //определяем площадь второго треугольника по формуле Герона
        double area2 = sqrt(p * (p - sideC) * (p - sideD) * (p - sideE));
        return area1 + area2; //возвращаем площадь четырехугольника (сумма площадей двух треугольников)
    }

    //проверка существования второго треугольника
    public static boolean inspectionOfTheTriangle(int sideA, int sideB, int sideC, int sideD) {
        double sideE = hypotenuse(sideA, sideB); //недостающая сторона второго треугольника
        boolean chek;
        if (sideC > 0 && sideD > 0 && sideE > 0) {
            if (sideC + sideD > sideE && sideC + sideE > sideD && sideD + sideE > sideC) {
                chek = true;
            } else {
                chek = false;
            }
        } else {
            chek = false;
        }
        return chek;
    }
}
