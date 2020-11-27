package com.accenture.democode.day6.abstraction;

public class CarDemo {

    public static void main(String[] args) {
//        Car car = new Car("Toyota");

        Car myCar = new Honda(); // Toyota is a Car; Car is not a Toyota

        myCar.start();
        myCar.stop();
    }

}
