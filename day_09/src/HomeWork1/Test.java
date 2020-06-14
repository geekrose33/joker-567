package HomeWork1;

/**
 * @author Joker_Dong
 * @date 2020-6-14 20:25
 */

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        student1.setName("小红");
        student2.setName("小亮");
        student3.setName("小明");
        student1.setOrChu(true);
        student2.setOrChu(true);
        student3.setOrChu(false);

        Teacher teacher = new Teacher();
        teacher.setName("张老师");

        Curriculum curriculum = new Curriculum();
        curriculum.setName("Java");


        curriculum.show(teacher);
        teacher.rollCall(student1);
        teacher.rollCall(student2);
        teacher.rollCall(student3);
    }
}
