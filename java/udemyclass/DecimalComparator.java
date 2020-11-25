package udemyclass;
//Exercise 5
public class DecimalComparator {
    public static void main(String[] args) {
        boolean test = areEqualByThreeDecimalPlaces(-3.1756, -3.176);
        System.out.println(test);
    }

    public static boolean areEqualByThreeDecimalPlaces(double num, double num2) {
        double a = (int) (num * 1000) / 1000.0 ;
        double b = (int) (num2 * 1000) / 1000.0 ;
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
}
