package Day5Problem.Inheritance.Event;

public class Theater extends Building {

    public Theater(String placeName, int capacity, String placeDescription, int workingHours) {
        super(placeName, capacity, placeDescription, workingHours);
    }

    @Override
    public void showArea() {
        int size = getCapacity() * 12;
        System.out.println("Theater area : " + size);
    }

    @Override
    public void showEvents() {
        System.out.println("Events ready to be hosted!!");
    }
}
