package com.company.exam;

/**
 * @author Joker_Dong
 * @date 2020-8-6 8:25
 */

public class Student_test {
    public static void main(String[] args) {
        Student student1 = new Student("张三", 23);
        Student student2 = new Student("张三", 23);
        Student student3 = new Student("张四", 23);
        Student student4 = new Student("张三", 22);
        System.out.println(student1.equals(student2));
        System.out.println(student1.equals(student3));
        System.out.println(student1.equals(student4));
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
    }
}

