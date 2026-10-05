package lombok;

import java.util.List;

@Builder
public record University(int id, String name, List<Course> courses) {}