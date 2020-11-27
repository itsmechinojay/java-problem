package com.accenture.democode.day6.abstraction;

import java.util.Scanner;

public class CarFactoryDemo {

    public static void main(String[] args) {

        CarFactory factory = new CarFactory();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a car:");
        System.out.println("\thonda");
        System.out.println("\ttoyota");
        System.out.print("Selection: ");
        String carName = scanner.nextLine();

        Car car = factory.getCarType(carName);
        if (car != null) {
            car.start();
            car.stop();
        } else {
            System.out.println("Unknown car name");
        }

    }
}
