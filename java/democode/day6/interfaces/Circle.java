package com.accenture.democode.day6.interfaces;

public class Circle implements Shape, Graphics, Comparable {

    private String circleName; // defaults to null
    private double diameter; // defaults to 0.0

    @Override
    public double calculateArea(double size) {
        return Math.PI * Math.pow(size, 2);
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
