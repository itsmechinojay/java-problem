package udemyclass;

//Exercise 17
public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(1234));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            number = number * -1;
            return -1;
        } else {
            String num = String.valueOf(number);
            String stringNum = "";

            int length = num.length(), evenSum = 0;
            for (int i = length - 1; i >= 0; i--) {
                stringNum = String.valueOf(num.charAt(i));
                int evenNum = Integer.parseInt(stringNum);
                if (evenNum % 2 == 0) {
                    evenSum = evenSum + evenNum;
                }
            }
            return evenSum;
        }
    }
}

