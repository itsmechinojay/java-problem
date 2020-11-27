package com.accenture.democode.skillchecks.skillcheck5.problem1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Raffle {

    public static void main(String[] args) {

        try {

            // read file and store to list
            String filename = "./files/participants.txt";
            List<String> names = Files.readAllLines(Paths.get(filename));

            // scanner for user input
            Scanner scanner = new Scanner(System.in);
            String userInput;

            do {
                // delay effect
                delay();

                // generate a random index
                int randomIndex = (int) (Math.random() * names.size());

                // use random index to select a name
                System.out.println(names.get(randomIndex));

                // prompt to continue or quit
                System.out.println();
                System.out.print("'q' to quit / [Enter] to continue: ");
                userInput = scanner.nextLine();
                System.out.println();
            } while (false == userInput.equalsIgnoreCase("q")); // alternate condition: !userInput.equalsIgnoreCase("q")

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    // method for delay effect
    public static void delay() {
        // print '-' 20 times with a delay of 250 ms per '-'
        for (int i = 0; i < 20; i++) {
            try {
                System.out.print('-');
                Thread.sleep(250); // sleeps the program for 250ms
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
        System.out.print("> ");
    }


}
