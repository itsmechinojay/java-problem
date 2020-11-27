package com.accenture.democode.skillchecks.skillcheck1;

import java.util.Scanner;

public class FullName {

    public static void main(String[] args) {
        // --- Input ---

        // ask for user input
        Scanner scanner = new Scanner(System.in);

        // ask for first name
        System.out.print("Enter first name: ");
        String firstname = scanner.next();

        // ask for last name
        System.out.print("Enter last name: ");
        String lastname = scanner.next();

        // --- Process ---
        String fullname = firstname + " " + lastname;

        // --- Output ---
        System.out.println("Your full name is " + fullname);
    }
}
