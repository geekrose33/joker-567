package HomeWork1;

/**
 * @author Joker_Dong
 * @date 2020-6-14 20:19
 */

public class Teacher extends Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void rollCall(Student student) {
        if (student.isOrChu()) {
            System.out.println("学生出勤情况: " + student.getName() + " 出勤");
        } else {
            System.out.println("学生出勤情况: " + student.getName() + " 迟到");
        }

    }

}
