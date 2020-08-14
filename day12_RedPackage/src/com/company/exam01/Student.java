package com.company.exam01;

/**
 * @author Joker_Dong
 * @date 2020-8-14 20:00
 */

public class Student {


    private int stu_Id;
    private String studentName;
    private int stu_math;
    private int stu_Chinese;
    private int stu_english;

    public Student(int stu_Id, String studentName, int stu_math, int stu_Chinese, int stu_english) {
        this.stu_Id = stu_Id;
        this.studentName = studentName;
        this.stu_math = stu_math;
        this.stu_Chinese = stu_Chinese;
        this.stu_english = stu_english;
    }

    public int getStu_Id() {
        return stu_Id;
    }

    public void setStu_Id(int stu_Id) {
        this.stu_Id = stu_Id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStu_math() {
        return stu_math;
    }

    public void setStu_math(int stu_math) {
        this.stu_math = stu_math;
    }

    public int getStu_Chinese() {
        return stu_Chinese;
    }

    public void setStu_Chinese(int stu_Chinese) {
        this.stu_Chinese = stu_Chinese;
    }

    public int getStu_english() {
        return stu_english;
    }

    public void setStu_english(int stu_english) {
        this.stu_english = stu_english;
    }



}
