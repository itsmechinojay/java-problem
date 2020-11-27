package udemyclass;
//Exercise 7
public class TeenNumberChecker {
    public static void main(String[] args) {
        boolean test = hasTeen(22, 15, 24);
        System.out.println(test);
    }

    public static boolean hasTeen(int age, int age2, int age3) {
        if ((age >= 13 && age <= 19) ||
                (age2 >= 13 && age2 <= 19) ||
                (age3 >= 13 && age3 <= 19)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int age){
        if (age >= 13 && age <= 19){
            return true;
        } else{
            return false;
        }
    }
}
