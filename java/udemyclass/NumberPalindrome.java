package udemyclass;
//Exercise 15
public class NumberPalindrome {
    public static void main(String[] args) {
        boolean test = isPalidrome(101);
        System.out.println(test);
    }

    public static boolean isPalidrome(int number) {
        if (number < 0){
            number = number * -1;
        }
        String num = String.valueOf(number);
        String reverse = "";

        int length = num.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + num.charAt(i);
        }

        if (num.equals(reverse)){
            return true;
        } else{
            return false;
        }

    }
}
