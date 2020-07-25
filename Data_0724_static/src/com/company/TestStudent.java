package com.company;

/**
 * @author Joker_Dong
 * @date 2020-7-24 9:30
 */

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("joker1",30);
        Student s2 = new Student("joker2",40);
        Student s3 = new Student("joker3",50);
        s1.show();
        s2.show();
        s3.show();
        System.out.println(Student.numberOfStudent);

        Student s4 = new Student("joker3",50);
        // 调用静态方法
        Student.showNum();

    }
}
