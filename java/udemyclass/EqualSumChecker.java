package udemyclass;

public class EqualSumChecker {

    public static void main(String[] args) {
        boolean test = hasEqualSum(1,-1,0);
        System.out.println(test);
    }

    public static boolean hasEqualSum(int num1, int num2, int num3) {
        int sum = num1 + num2;
        if (sum == num3) {
            return true;
        } else {
            return false;
        }
    }

}
