package pharmacy;

public class Medication {
    private final String name;
    private int price;
    private boolean available;

    public Medication(String name, int price, boolean available) {
        this.name = name;
        this.price = price;
        this.available = available;
    }

    public int getPrice() {
        return price;
    }

    public boolean getAvailable() {
        return available;
    }

    public String getName() {
        return name;
    }
}