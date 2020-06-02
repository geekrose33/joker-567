package com.company;

/**
 * @author Joker_Dong
 * @date 2020-6-2 12:22
 */

public class ExtendsDemoTest01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        // 属性赋值
        teacher.name = "孔子";
        // 调用printName方法
        teacher.printName();
        // 调用父类的方法
        teacher.work();
    }
}
