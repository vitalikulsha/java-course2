import static java.lang.Math.*;

public class Method_04 {
    /* Task 04
    На плоскости заданы своими координатами n точек. Написать метод(методы),
    определяющие, между какими из пар точек самое большое расстояние.
    Указание. Координаты точек занести в массив
     */
    public static void main(String[] args) {
        int n = 5; //количество точек
        int min = -100;
        int max = 100;
        int[][] matrix = new int[n][2]; // первый столбец - координата Х, второй столбец - координата Y
        System.out.println("Матрица координат точек: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (random() * ((max - min) + 1) + min);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int[] point = maxDistanceBetweenPoints(matrix);
        System.out.println("Наибольшее расстояние между точками №" + point[0] + "(" + matrix[point[0]][0] +
                "," + matrix[point[0]][1] + ") и №" + point[1] + "(" + matrix[point[1]][0] +
                "," + matrix[point[1]][1] + ")");
    }

    public static int[] maxDistanceBetweenPoints(int[][] matrix) {
        double maxDistance = Double.MIN_VALUE;
        int idFirstPoint = 0;
        int idSecondPoint = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                int distanceX = matrix[i][0] - matrix[j][0]; //расстояние между точками по Х
                int distanceY = matrix[i][1] - matrix[j][1]; //расстояние между точками по Y
                double distance = sqrt(pow(distanceX, 2) + pow(distanceY, 2)); //расстояние между точками
                if (distance > maxDistance) {
                    maxDistance = distance; //находим максимальное расстояние между точками
                    idFirstPoint = i; //первая точка
                    idSecondPoint = j; //вторая точка
                }
            }
        }
        int[] point = {idFirstPoint, idSecondPoint};
        return point;
    }
}
