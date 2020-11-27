package com.accenture.democode.day6.abstraction;

public abstract class Car implements Vehicle {

    private String brandName;

    public Car(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

}
