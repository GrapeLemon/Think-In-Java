package _20_annotation._02_annotation_handler._03_generate_outside_file;

/**
 * @Author wx-li
 * @Date 2019/9/4 9:16
 **/
@DBTable(name="member")
public class Member {
    @SQLString(30) String firstName;
    @SQLString(50) String lastName;
    @SQLInteger Integer age;
    @SQLString(value = 30,
    constraints = @Constraints(primaryKey = true))
    String handle;
    static int memeberCount;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getHandle() {
        return handle;
    }
}
