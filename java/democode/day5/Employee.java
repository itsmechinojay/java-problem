package com.accenture.democode.day5;

/*
- eid: String
- level: int

+ work: void

 */
public class Employee {

    protected String eid;
    protected int level;
    double salary;

    // --- constructor ---
    public Employee() {
        // default contructor
    }

    public Employee(String eid) {
        this.eid = eid;
    }

    public Employee(String eid, int level) {
        this.eid = eid;
        this.level = level;
    }

    // --- getters and setters ---

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // --- methods ---
    public void work() {
        System.out.println(eid + " is working");
    }

    public static String employeeMessage(String eid, int level) {
        return eid + " is level " + level;
    }
}
