package com.accenture.democode.skillchecks.skillcheck3.problem2;

public class Vehicle {

    // --- Data ---
    private int doors;
    private int seats;
    private int wheels;

    // --- Constructor ---

    // default constructor
    public Vehicle() {
        System.out.println("Building a vehicle...");
    }

    // constructor to initialize doors, seats, and wheels
    public Vehicle(int doors, int seats, int wheels) {
        this.doors = doors;
        this.seats = seats;
        this.wheels = wheels;
    }

    // --- Getters and Setters ---
    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    // --- Methods ---
    public void drive() {
        System.out.println("Driving a vehicle");
    }

}
