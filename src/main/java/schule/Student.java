package schule;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String vorname;
    private String nachname;
    private int studentenId;
    private final List<Kurs> kurse = new ArrayList<>();

    public Student(String vorname, String nachname, int studentenId) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.studentenId = studentenId;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getStudentenId() {
        return studentenId;
    }

    public void addKurs(Kurs kurs) {
        kurse.add(kurs);
    }

    public List<Kurs> getKurse() {
        return new ArrayList<>(kurse);
    }

    @Override
    public String toString() {
        return vorname + " " + nachname + " (ID: " + studentenId + ")";
    }
}
