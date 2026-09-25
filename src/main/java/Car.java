public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String manufacturer, String model, int year, int numberOfDoors) {
        super(manufacturer, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void info() {
        super.info();
        System.out.print(". Number of doors: " + numberOfDoors);
    }
}
