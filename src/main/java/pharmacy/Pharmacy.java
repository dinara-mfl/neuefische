package pharmacy;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    private final Map<String, Medication> medications = new HashMap<>();

    public int getCount() {
        return medications.size();
    }

    public void save(Medication medication) {
        medications.put(medication.getName(), medication);
    }

    public Medication find(String medicationName) {
        return medications.get(medicationName);
    }

    public void delete(String medicationName) {
        medications.remove(medicationName);
    }

    public void printAll() {
        for (Medication medication: medications.values()) {
            System.out.println("Name: " + medication.getName() + ", Price: "
                    + medication.getPrice()
                    + ", Available: " + medication.getAvailable());
        }
    }
}