package Day5Problem.Inheritance.Car;

import java.util.Scanner;

public class Parking {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Vehicle vehicle = new Vehicle();
        Vehicle vehicle1 = new Vehicle(0,0,0);
        vehicle1.drive();
        Car car = new Car(4,5,4);
        car.drive();
    }

}
