package com.accenture.democode.skillchecks.skillcheck1;

public class CheckAge {

    public static void main(String[] args) {
        // --- Input ---
        int age = 63;

        // --- Process ---
        boolean isMinor = age < 18;
        boolean isAdult = age >= 18;
        boolean isSenior = age >= 60;

        // --- Output ---
        System.out.println("Age: " + age);
        System.out.println("minor? " + isMinor);
        System.out.println("adult? " + isAdult);
        System.out.println("senior? " + isSenior);
    }
}
