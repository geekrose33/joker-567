package com.company.exam01;

import java.util.ArrayList;
import java.util.Scanner;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.FileNotFoundException;

/**
 * @author Joker_Dong
 * @date 2020-8-14 19:55
 */
//题目：有五个学生，每个学生有3门课的成绩，从键盘输入以上数据（包括学生号，姓名，三门课成绩），
//        计算出平均成绩，将原有的数据和计算出的平均分数存放在磁盘文件"stud"中。


public class Java50_50 {
    public static void main(String[] args) throws FileNotFoundException {

        PrintStream ps = new PrintStream("e:/stud.txt");

        ArrayList<Student> students = student(5);
        System.setOut(ps);
        figureChinese(students);
        figureMath(students);
        figureEnglish(students);
        PrintStream out = System.out;


    }
    public static ArrayList<Student> student(int n){
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            System.out.println("请输入第" + (i+1) + "位同学的学生号，姓名，三门课成绩");
            System.out.println("学号： ");
            int stu_id = new Scanner(System.in).nextInt();
            System.out.println("姓名： ");
            String stu_name = new Scanner(System.in).nextLine();
            System.out.println("语文成绩： ");
            int stu_Chinese = new Scanner(System.in).nextInt();
            System.out.println("数学成绩： ");
            int stu_math = new Scanner(System.in).nextInt();
            System.out.println("英语成绩： ");
            int stu_english = new Scanner(System.in).nextInt();

            Student instance = new Student(stu_id, stu_name, stu_Chinese, stu_math, stu_english);
            students.add(instance);

        }
        return students;
    }
    public static void figureChinese(ArrayList<Student> students){
        int n = students.size();
        int Chinese = 0;
        int sum = 0;
        int avg = 0;
        for (Student student:students){
             Chinese = student.getStu_Chinese();
             sum += Chinese;
        }
        avg = sum/n;
        System.out.println("语文平均分是： " + avg);
    }
    public static void figureMath(ArrayList<Student> students){
        int n = students.size();
        int Math = 0;
        int sum = 0;
        int avg = 0;
        for (Student student:students){
            Math = student.getStu_math();
            sum += Math;
        }
        avg = sum/n;
        System.out.println("数学平均分是： " + avg);
    }
    public static void figureEnglish(ArrayList<Student> students){
        int n = students.size();
        int English = 0;
        int sum = 0;
        int avg = 0;
        for (Student student:students){
            English = student.getStu_english();
            sum += English;
        }
        avg = sum/n;
        System.out.println("英语平均分是： " + avg);
    }




}
