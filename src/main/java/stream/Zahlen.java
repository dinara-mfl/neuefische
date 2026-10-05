package stream;

import java.util.List;
import java.util.stream.Collectors;

public class Zahlen {

    public List<Integer> filtereGeradeZahlen(List<Integer> zahlen) {
        List<Integer> filtered = zahlen.stream()
                .filter(zahl -> zahl%2 == 0)
                .collect(Collectors.toList());
        return filtered;
    }

    public List<Integer> verdoppleZahlen(List<Integer> zahlen) {
        List<Integer> filtered = zahlen.stream()
                .map(zahl -> zahl*2)
                .collect(Collectors.toList());
        return filtered;
    }

    public List<Integer> sortiereAufsteigend(List<Integer> zahlen) {
        List<Integer> filtered = zahlen.stream()
                .sorted()
                .toList();
        return filtered;
    }

    public int berechneSumme(List<Integer> zahlen) {
        int filtered = zahlen.stream()
                .reduce(0, Integer::sum);
        return filtered;
    }

    public void gibZahlenAus(List<Integer> zahlen) {
        zahlen.forEach(System.out::println);
    }

    public List<Integer> verarbeiteZahlen(List<Integer> zahlen) {
        List<Integer> filtered = zahlen.stream()
                .filter(zahl -> zahl%2 == 0)
                .map(zahl -> zahl * 2)
                .sorted()
                .collect(Collectors.toList());
        return filtered;
    }
}