package com.accenture.democode.day6.abstraction;

public class CarFactory {

    // factory method
    public Car getCarType(String carName) {
        if ("honda".equalsIgnoreCase(carName)) {
            return new Honda();
        } else if ("toyota".equalsIgnoreCase(carName)) {
            return new Toyota();
        } else {
            return null;
        }
    }
}
