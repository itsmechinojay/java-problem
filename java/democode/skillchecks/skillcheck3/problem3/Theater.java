package com.accenture.democode.skillchecks.skillcheck3.problem3;

// Theater is a normal class to create an object of it
public class Theater extends Building {

    @Override
    public void showArea() {
        // use getter for capacity since capacity is
        // private in Place class
        int area = getCapacity() * 12;
        System.out.println("Theater area: " + area);
    }

    @Override
    public void showEvents() {
        System.out.println("Events ready to be hosted!!");
    }
}
