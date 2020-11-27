package udemyclass;
//Exercise 19
public class LastDigitChecker {

    public static void main(String[] args){
        System.out.println(hasSameLastDigit(9,99,999));
    }

    public static boolean hasSameLastDigit(int x, int y, int z){

        int a = x % 10;
        int b = y % 10;
        int c = z % 10;

        if(isValid(x) && isValid(y) && (isValid(z)) ) {
            if (a == b || b == c || a == c) {
                return true;
            } else {
                return false;
            }
        }else{
            return false;
        }
    }

    public static boolean isValid(int x){
        if(x > 9 && x<=1000){
            return true;
        }else{
            return false;
        }
    }

}
