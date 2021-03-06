package com.accenture.democode.skillchecks.skillcheck4.problem2;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AttendanceTracker {

    // initialize list
    private List<Learner> learners = new ArrayList<>();

    public AttendanceTracker() {
        // default constructor
    }

    public Learner timeInLearner(String eid) {
        // check if eid already timed-in
        for (Learner learner: learners) {

            // return null if eid already exists
            if (eid.equals(learner.getEid())) {
                return null;
            }
        }

        // create learner object with eid and current time
        Learner learner = new Learner(eid, LocalTime.now());
        learners.add(learner);

        return learner;
    }

    public void displayAttendance() {
        System.out.println("Learners' Attendance");
        for (int i=0; i < learners.size(); i++) {
            Learner learner = learners.get(i);
            System.out.println((i+1) + " " + learner.getEid() + "\t" + learner.getTimeIn());
        }
    }

    public void askLearnerEid() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter eid: ");
        String eid = scanner.nextLine();

        Learner learner = timeInLearner(eid);

        // if learner already timed-in
        if (learner == null) {
            System.out.println("Learner '" + eid + "' already timed in.");
        } else {
            System.out.println("Learner '" + learner.getEid() + "' timed in at " + learner.getTimeIn());
        }

        System.out.println();
    }
}
