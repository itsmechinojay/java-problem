package com.accenture.democode.skillchecks.skillcheck4.problem2;

import java.time.LocalTime;

public class Learner {

    private String eid;
    private LocalTime timeIn;

    public Learner(String eid, LocalTime timeIn) {
        this.eid = eid;
        this.timeIn = timeIn;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public LocalTime getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(LocalTime timeIn) {
        this.timeIn = timeIn;
    }
}
