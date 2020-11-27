package com.accenture.democode.day4;

public class ControlFlow {

    public static void main(String[] args) {

        // if-else
        boolean cond = 3 > 4;
        boolean cond2 = false;
        if (cond2 == cond) { // avoid assignment in if statements
            System.out.println("if (cond2=cond)");
            System.out.println("cond2: " + cond2);
        }

        char label = 'f';
        String gender;
        if (label == 'f') {
            gender = "Female";
        } else {
            gender = "Male";
        }

        // switch
        char inputNum = '1';
        switch (inputNum) {
            case '1':
                System.out.println("Entered 1");
                break;
            case '2':
                System.out.println("Entered 2");
                break;
            default:
                System.out.println("Others..");
        }

        String activity = "Variables";
        switch (activity) {
            case "Datatype":
                System.out.println("Selected activity is Datatype");
                break;
            case "Variables":
                System.out.println("Selected activity is Variables");
                break;
            default:
                System.out.println("Others");
        }
    }
}
