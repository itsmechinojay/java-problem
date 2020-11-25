package udemyclass;
//Exercise 13
public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        int days = getDaysInMonth(2, 2020);
        System.out.println(days);
    }

    public static boolean isLeapYear(int year) {
        boolean leapYear = year >= 1 & year <= 9999;
        switch (String.valueOf(leapYear)) {
            case "true":
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            return true;
                        } else {
                            return false;
                        }
                    } else {
                        return true;
                    }
                } else {
                    return false;
                }
            case "false":
                return false;
            default:
                throw new IllegalStateException("Unexpected value: " + leapYear);
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month >= 1 && month <= 12) {
            if (year >= 1 && year <= 9999) {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        return 31;
                    case 2:
                        if (isLeapYear(year)) {
                            return 29;
                        } else {
                            return 28;
                        }
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        return 30;
                    default:
                        return -1;
                }
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }

}
