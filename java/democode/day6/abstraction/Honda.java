package com.accenture.democode.day6.abstraction;

public class Honda extends Car {

    public Honda() {
        super("Honda");
    }

    @Override
    public void start() {
        System.out.println(getBrandName() + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(getBrandName() + " is stopping...");
    }
}
