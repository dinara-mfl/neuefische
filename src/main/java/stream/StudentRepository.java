package stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentRepository {

    public void gibDateiAus(String csv) throws IOException {
        Stream<String> zeilen = Files.lines(Path.of(csv));
        zeilen.forEach(System.out::println);
    }

    public List<String> entferneHeader(String csv) throws IOException {
        Stream<String> zeilen = Files.lines(Path.of(csv));
        return zeilen
                .skip(1)
                .collect(Collectors.toList());
    }

    public List<Student> leseStudenten(String csv) throws IOException {
        try (Stream<String> zeilen = Files.lines(Path.of(csv))) {
            return zeilen
                     .skip(1)
                    .map(this::zuStudent)
                    .filter(student -> student != null)
                    .distinct()
                    .toList();
        }
    }

    public List<Student> verarbeiteZeilen(String csv) throws IOException {
        Stream<String> zeilen = Files.lines(Path.of(csv));

        return zeilen
                .map(this::zuStudent)
                .filter(student -> student != null)
                .distinct()
                .collect(Collectors.toList());
    }

    private Student zuStudent(String zeile) {
        String[] t = zeile.split(",", -1);
        if (t.length != 4) return null;

        int id = Integer.parseInt(t[0].trim());
        String name = t[1].trim();
        String plz = t[2].trim();
        int age = Integer.parseInt(t[3].trim());

        return new Student(id, name, plz, age);
    }
}
