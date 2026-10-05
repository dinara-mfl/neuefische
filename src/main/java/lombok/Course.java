package lombok;

import java.util.List;

@Value
public class Course {

    int id;
    String name;
    @With Teacher teacher;
    List<Student> students;
}
