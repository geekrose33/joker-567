package HomeWork1;

/**
 * @author Joker_Dong
 * @date 2020-6-14 20:24
 */

public class Curriculum extends Teacher {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(Teacher teacher) {
        System.out.println("课程名称： " + this.name);
        System.out.println("授课老师： " + teacher.getName());

    }
}
