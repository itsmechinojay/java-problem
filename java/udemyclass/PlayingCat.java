package udemyclass;
//Exercise 11
public class PlayingCat {
    public static void main(String[] args) {
        boolean test = isCatPlaying(true, 10);
        System.out.println(test);
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            } else {
                return false;
            }
        } else {
            if (temperature >= 25 && temperature <= 35) {
                return true;
            } else {
                return false;
            }

        }
    }
}
