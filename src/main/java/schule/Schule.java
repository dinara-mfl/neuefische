package schule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Schule {

    private final List<Student> studenten = new ArrayList<>();

    public void addStudent(Student student) {
        studenten.add(student);
    }

    public void printStudents() {
        for (Student student: studenten) {
            System.out.println(student);
        }
    }

    public Student findStudentById(int studentenId) {
        for (Student student: studenten) {
            if(student.getStudentenId() == studentenId) {
                return student;
            }
        }
        return null;
    }

    public boolean deleteStudent(int studentenId) {
        Student student = findStudentById(studentenId);

        if (student != null) {
            studenten.remove(student);
            return true;
        }
        return false;
    }

    public HashMap<Integer, Kurs> getKurseByStudentId(int studentenId) {
        Student student = findStudentById(studentenId);

        if (student != null) {
            return student.getKurse();
        }

        return new HashMap<>();
    }
}
