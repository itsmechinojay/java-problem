package com.accenture.democode.day6.interfaces;

public interface Shape {

    public static final int MAX_SIZE = 10;

    // implicitly abstract method
    double calculateArea(double size);

    // default methods allow body
    default void someMethod() {

    }

    // JDK 10 or above
//    private void privateMethod() {
//
//    }



}
