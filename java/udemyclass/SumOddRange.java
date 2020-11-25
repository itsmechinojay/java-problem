package udemyclass;
//Exercise 14
public class SumOddRange {

    public static void main(String[] args) {
        int test = sumOdd(1, 100);
        System.out.println(test);

    }

    public static boolean isOdd(int num) {
        if (num > 0) {
            if (num % 2 == 0) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (end >= start && start > 0 && end > 0) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum = sum + i;
                }
            }
            return sum;
        } else {
            return -1;
        }
    }

}
