package Day5Problem.Inheritance.Car;

public class Car extends Vehicle{

    public Car(int doors, int seats, int wheels) {
        System.out.println("Building a Car...");
        System.out.println("    number of doors: " + doors );
        System.out.println("    number of seats: " + seats);
        System.out.println("    number of wheels: " + wheels);
    }


    @Override
    public void drive() {
        System.out.println("Driving a Car...");
    }
}
