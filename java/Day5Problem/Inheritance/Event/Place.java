package Day5Problem.Inheritance.Event;

public abstract class Place {
    private String placeName;
    private int capacity;
    private String placeDescription;
    private int workingHours;

    public Place(String placeName, int capacity, String placeDescription, int workingHours) {
        this.placeName = placeName;
        this.capacity = capacity;
        this.placeDescription = placeDescription;
        this.workingHours = workingHours;
    }

    public abstract void showEvents();

    public String getPlaceName() {
        return placeName;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getPlaceDescription() {
        return placeDescription;
    }

    public int getWorkingHours() {
        return workingHours;
    }
}
