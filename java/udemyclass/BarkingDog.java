package udemyclass;
//Exercise 3
public class BarkingDog {

    public static void main (String[] args){
        boolean test = shouldWakeUp(false,2);
        System.out.println(test);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking){
            if((hourOfDay < 8 && hourOfDay >= 0) || hourOfDay == 23){
                return true;
            }
            else   {
                return false;
            }
        }else {
            return false;
        }
    }

}
