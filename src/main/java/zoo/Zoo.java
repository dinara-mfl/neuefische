package zoo;

import java.util.List;

public record Zoo(List<Animal> animals) {

    public long getTotalFoodGramsPerDay() {
        long total = 0;
        for (Animal animal: animals) {
            total += animal.species().foodGramsPerDay();
        }
        return total;
    }
}
