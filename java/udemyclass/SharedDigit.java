package udemyclass;
//Exercise 18
public class SharedDigit {

    public static void main(String[] args){
        System.out.println(hasSharedDigit(13,22));

    }

    public static boolean hasSharedDigit(int num1 , int num2) {

        if (num1 < 10 || num2 >99 || num1 >99 || num2< 10) {
            return false;
        } else {
            int x = num1 % 10;
            int y = num2 % 10;
            num1 /= 10;
            num2 /= 10;
            if ((num1 == num2 || num1 == y || x == num2 || x == y)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
