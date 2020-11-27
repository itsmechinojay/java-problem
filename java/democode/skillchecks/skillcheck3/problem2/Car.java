package com.accenture.democode.skillchecks.skillcheck3.problem2;

public class Car extends Vehicle {

    // default constructor
    public Car() {
        System.out.println("Building a Car...");
    }

    @Override
    public void drive() {
        System.out.println("Driving a Car");
    }
}
