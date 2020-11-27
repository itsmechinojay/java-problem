package com.accenture.democode.day6.interfaces;

public class Square implements Shape {
    @Override
    public double calculateArea(double size) {
        return size * size;
    }
}
