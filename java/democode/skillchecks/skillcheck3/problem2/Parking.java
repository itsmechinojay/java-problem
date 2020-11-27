package com.accenture.democode.skillchecks.skillcheck3.problem2;

public class Parking {

    public static void main(String[] args) {

        // Create a vehicle object
        Vehicle vehicle = new Vehicle();

        // Display door, seats, and wheels using getters
        System.out.println("\tnumber of doors: " + vehicle.getDoors());
        System.out.println("\tnumber of seats: " + vehicle.getSeats());
        System.out.println("\tnumber of wheel: " + vehicle.getWheels());

        // Drive by calling the drive() method
        vehicle.drive();

        Car car = new Car();
        System.out.println("\tnumber of doors: " + car.getDoors());
        System.out.println("\tnumber of seats: " + car.getSeats());
        System.out.println("\tnumber of wheel: " + car.getWheels());
        car.drive();
    }
}
