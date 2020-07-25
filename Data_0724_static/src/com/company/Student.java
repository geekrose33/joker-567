package com.company;

/**
 * @author Joker_Dong
 * @date 2020-7-24 9:27
 */

public class Student {
    private String name;
    private int age;
    // 学号
    private int sid;

    // 声明一个类变量记录学生数量
    public static int numberOfStudent;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.sid = ++numberOfStudent;
    }

    public void show(){
        System.out.println("学员： name = " + this.name + ", age = " + this.age
        + ", sid = " + this.sid);
    }

    // 定义一个静态方法
    public static void showNum(){
        System.out.println(numberOfStudent);
    }

}
