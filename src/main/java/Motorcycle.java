public class Motorcycle extends Vehicle {
    private String typ;

    public Motorcycle(String manufacturer, String model, int year, String typ) {
        super(manufacturer, model, year);
        this.typ = typ;
    }

    public String getTyp() {
        return typ;
    }

    @Override
    public void info() {
        super.info();
        System.out.print(". Typ: " + typ);
    }
}
