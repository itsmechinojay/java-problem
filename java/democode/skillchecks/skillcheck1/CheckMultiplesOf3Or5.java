package com.accenture.democode.skillchecks.skillcheck1;

public class CheckMultiplesOf3Or5 {

    public static void main(String[] args) {
        // --- Input ---
        int number = 9;

        // --- Process ---
        boolean isMultipleOf3 = (number % 3) == 0;
        boolean isMultipleOf5 = (number % 5) == 0;
        boolean isMulitpleOf3Or5 = isMultipleOf3 || isMultipleOf5;

        // --- Output ---
        System.out.println("Is the number " + number + " either a multiple of 3 or 5? " + isMulitpleOf3Or5);

    }

}
