package lombok;

import java.util.List;

public class UniversityService {

    public double berechneDurchschnittsnoteCourse(Course course) {
        return course.getStudents().stream()
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0.0);
    }

    public double berechneDurchschnittsnoteIniversity(University university) {
        return university.courses().stream()
                .flatMap(course -> course.getStudents().stream())
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0.0);
    }

    public List<Student> findeStudentenMitMindestnoteGut(University university) {
        return university.courses().stream()
                .flatMap(course -> course.getStudents().stream())
                .filter(student -> student.getGrade() <= 2.0)
                .distinct()
                .toList();
    }
}
