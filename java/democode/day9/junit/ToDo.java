package com.accenture.democode.day9.junit;

import java.time.LocalDate;
import java.util.Objects;

public class ToDo {

    private String task;
    private LocalDate completionDate;
    private boolean isDone;

    public ToDo(String task, LocalDate completionDate, boolean isDone) {
        this.task = task;
        this.completionDate = completionDate;
        this.isDone = isDone;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public LocalDate getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(LocalDate completionDate) {
        this.completionDate = completionDate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "task='" + task + '\'' +
                ", completionDate=" + completionDate +
                ", isDone=" + isDone +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToDo toDo = (ToDo) o;
        return isDone == toDo.isDone &&
                Objects.equals(task, toDo.task) &&
                Objects.equals(completionDate, toDo.completionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(task, completionDate, isDone);
    }
}
