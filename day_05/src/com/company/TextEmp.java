package com.company;

/**
 * @author Joker_Dong
 * @date 2020-5-13 11:09
 */

public class TextEmp {
    public static void main(String[] args) {
        EmpJavaBean emp1 = new EmpJavaBean("张三", 9527, "伴读书童", 2000);
        System.out.println(emp1);
        System.out.println(emp1.getName() + emp1.getJobnum() + emp1.getPosition() + emp1.getSalary());
        emp1.setSalary(2500);
        System.out.println(emp1.getSalary());
        EmpJavaBean emp2 = new EmpJavaBean();
        System.out.println(emp2);
    }
}
