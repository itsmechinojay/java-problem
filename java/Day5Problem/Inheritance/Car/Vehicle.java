package Day5Problem.Inheritance.Car;

public class Vehicle {
    private int doors;
    private int seats;
    private int wheels;

    public Vehicle() {
        System.out.println("Building a Vehicle...");
    }

    public Vehicle(int doors, int seats, int wheels) {
        this.doors = doors;
        this.seats = seats;
        this.wheels = wheels;
        System.out.println("    number of doors: " + this.doors);
        System.out.println("    number of seats: " + this.seats);
        System.out.println("    number of wheels: " + this.wheels);
    }


    public void drive() {
        if ((this.seats > 0) && (this.wheels>0) && (this.doors > 0)) {
            System.out.println("Driving a Vehicle");
        } else {
            System.out.println("");
        }
    }

}
