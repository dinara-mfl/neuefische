package schule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String vorname;
    private String nachname;
    private int studentenId;
    private static int kursId = 0;
    private final Map<Integer, Kurs> kurse = new HashMap();

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
        kursId++;
        kurse.put(kursId, kurs);
    }

    public HashMap<Integer, Kurs> getKurse() {
        return new HashMap<>(kurse);
    }

    @Override
    public String toString() {
        return vorname + " " + nachname + " (ID: " + studentenId + ")";
    }
}
