package com.company;

/**
 * @author Joker_Dong
 * @date 2020-5-14 16:40
 */

public class Test01_StudentArray {
    // 创建一个学生数组 存储 刘关张赵 的学生信息
    public static void main(String[] args) {


        StudentJavaBean[] students = new StudentJavaBean[4];



        StudentJavaBean student1 = new StudentJavaBean("刘备",42);
        StudentJavaBean student2 = new StudentJavaBean("关羽",40);
        StudentJavaBean student3 = new StudentJavaBean("张飞",41);
        StudentJavaBean student4 = new StudentJavaBean("赵云",35);
        students [0] = student1;
        students [1] = student2;
        students [2] = student4;
        students [3] = student4;
        for (int i = 0; i < 4; i++) {
            System.out.println(students [i].getName() + students [i].getAge());
        }
        /*
        for (int i = 0; i < students.length; i++) {
            StudentJavaBean s = students[i];
            System.out.println(s.getName() + s.getAge());
        }
*/




    }


}
