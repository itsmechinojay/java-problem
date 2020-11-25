package Day5Problem.Inheritance.Event;

public abstract class Building extends Place {

    public Building(String placeName, int capacity, String placeDescription, int workingHours) {
        super(placeName, capacity, placeDescription, workingHours);
    }

    public abstract void showArea();

}
