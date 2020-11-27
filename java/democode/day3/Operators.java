package com.accenture.democode.day3;

public class Operators {

    public static void main(String[] args) {

        // Arithmetic Operators
        // PEMDAS
        int sum = 2 + 3;
        double diff = 2.0 - 4;
        long product = 5 * 7;
        float quotient = 6 / 2.0f + (float)diff;
        double quotient2 = 6 / 2.0f;
        int rem = 5 % 2;

        char character = 'a' + 1; // 8-bit

        System.out.println(character);

        // Logical Operators
        boolean and = true && true; // returns true if all conditions are true
        boolean or = true || true; // returns true if one of the condition is true
        boolean not = !true;

        // Relational Operators
        boolean gt = 5 > 9;
        boolean gte = 5 >= 9;
        boolean lt = 5 < 9;
        boolean lte = 5 <= 9;
        boolean eq = 8 == 8;
        boolean neq = 9 != 0;

        String msg = "hello world";
        String name = "jeremy";

        boolean strEq = msg == name; // not recommended
        boolean strEqCorrect = msg.equals(name); // recommended way to compare strings

        // Ternary Operator
        char g = 'm';
        String gender = g == 'm' ? "Male" : "Female";
    }
}
