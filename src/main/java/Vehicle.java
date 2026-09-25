public class Vehicle {
    private String manufacturer;
    private String model;
    private int year;

    public Vehicle(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    public void info() {
        System.out.print("\n" + "Manufacture: " + manufacturer + ". Model: " + model + ". Year " + year);
    }
}
