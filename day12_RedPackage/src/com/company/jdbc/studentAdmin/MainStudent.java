package com.company.jdbc.studentAdmin;

import com.company.jdbc.studentAdmin.dao.impl.StudentDaoImpl;
import com.company.jdbc.studentAdmin.domain.Student;

import java.util.List;

/**
 * @author Joker_Dong
 * @date 2020-8-6 15:47
 */

public class MainStudent {
    public static void main(String[] args) {
        System.out.println("---------- 欢迎登陆 low 版学生管理系统------------");
        StudentDaoImpl studentDao = new StudentDaoImpl();

        System.out.println("-------------学生列表--------------------");

        List<Student> list = studentDao.findAll();
        for (Student student:list
             ) {
            System.out.println(student);
        }

        System.out.println("-------------保存列表--------------------");

        Student student = new Student("王五","男",60,"沈阳","166666666");
        studentDao.save(student);

        List<Student> list1 = studentDao.findAll();
        for (Student student1:list1
             ) {
            System.out.println(student1);
        }
        // 修改
        System.out.println("-------------修改列表--------------------");
        student.setScore(60);
        studentDao.update(student);
        List<Student> list2 = studentDao.findAll();
        for (Student student1:list1
        ) {
            System.out.println(student1);
        }

        // 删除

        studentDao.remove(6);
        List<Student> list3 = studentDao.findAll();
        for (Student student1:list1
        ) {
            System.out.println(student1);
        }
    }
}
