package com.accenture.democode.skillchecks.skillcheck3.problem3;

// Place must be an abstract to create an abstract method
public abstract class Place {

    private String placeName;
    private int capacity;
    private String placeDescription;
    private int workingHours;

    // --- Getters and Setters ---
    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getPlaceDescription() {
        return placeDescription;
    }

    public void setPlaceDescription(String placeDescription) {
        this.placeDescription = placeDescription;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public abstract void showEvents();
}
