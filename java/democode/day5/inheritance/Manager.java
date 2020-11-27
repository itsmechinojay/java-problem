package com.accenture.democode.day5.inheritance;

import com.accenture.democode.day5.Employee;

public class Manager extends Employee {

    private String project;

    public Manager(String eid, int level, String project) {
        super(eid, level);
        this.project = project;
    }

    public String getProject() {
        return project;
    }

    @Override
    public void work() {
        System.out.println(eid + " is managing " + project);
    }

}
