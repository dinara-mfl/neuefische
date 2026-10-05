package lombok;

@Data
@AllArgsConstructor
@Builder
public class Student {

    private int id;
    private String name;
    private String address;
    private int grade;
}