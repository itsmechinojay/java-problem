package udemyclass;
//Exercise 16
public class FirstLastDigitSum {
    public static void main(String[] args){
        System.out.println(sumFirstAndLastDigit(123));
    }

    public static int sumFirstAndLastDigit(int number){

        int num = number;
        if (num < 0){
            return -1;
        }
        else {
            int lastDigit = num % 10;

            String num2 = String.valueOf(number);
            String stringNum = "";

            int length = num2.length();
            for (int i = length - 1; i >= 0; i--) {
                stringNum = String.valueOf(num2.charAt(i));
            }

            int firstDigit = Integer.parseInt(stringNum);

            return firstDigit + lastDigit;
        }
    }
}
