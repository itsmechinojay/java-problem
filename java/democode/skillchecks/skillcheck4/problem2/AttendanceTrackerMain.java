package com.accenture.democode.skillchecks.skillcheck4.problem2;

import java.util.Scanner;

public class AttendanceTrackerMain {

    public static void main(String[] args) {

        // create attendance tracker object
        AttendanceTracker attendanceTracker = new AttendanceTracker();

        // scanner object for user input
        Scanner scanner = new Scanner(System.in);
        String userInput;

        // continuously run program to enter for eid
        do {
            // ask learner's eid
            attendanceTracker.askLearnerEid();

            System.out.print("Would you like to enter another EID? (y/n) ");
            userInput = scanner.nextLine();
        } while (userInput.equalsIgnoreCase("y"));

        // display list of attendees when no longer needed to enter eid
        System.out.println();
        attendanceTracker.displayAttendance();
    }
}
