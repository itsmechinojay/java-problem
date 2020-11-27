package udemyclass;
//Exercise 8
public class AreaCalculator {

    public static void main(String[] args) {
        double test1 = area(-1);
        double test2 = area(5, 0);
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        } else {
            double radiusCircle = radius * radius * Math.PI;
            return radiusCircle;
        }
    }

    public static double area(double x, double y) {
        if (x < 0 || y <0) {
            return -1;
        } else {
            double areaTriangle = x * y;
            return areaTriangle;
        }
    }

}
