package com.accenture.democode.day8;

public class PL {

    private int id;
    private String language;

    public PL(int id, String language) {
        this.id = id;
        this.language = language;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "PL{" +
                "id=" + id +
                ", language='" + language + '\'' +
                '}';
    }
}
