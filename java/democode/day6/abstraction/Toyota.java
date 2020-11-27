package com.accenture.democode.day6.abstraction;

public class Toyota extends Car implements ManualTransmissionCar {

    public Toyota() {
        super("Toyota");
    }

    @Override
    public void start() {
        System.out.println(getBrandName() + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(getBrandName() + " is stopping...");
    }

    @Override
    public void shiftGear() {
        System.out.println("Change gear");
    }
}
