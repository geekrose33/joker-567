package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Joker_Dong
 * @date 2020-5-11 18:33
 * * 构造方法     特殊的方法
 * * 面向对象：属性 方法（C/Python中的函数）
 * * 当对象被创建的时候 构造方法用来初始化该对象 给对象的成员变量赋予初始值
 * * 构造方法的格式：
 * *         修饰符 构造方法名（参数列表）{方法体}
 * * 写法上 1.方法名与所在类的名字相同 2.没有返回值 所以不需要指定返回类型 也不需要void
 * * 小贴士：无论你是否定义了构造方法，所有类都有构造方法，因为java为你提供了一个无参构造方法
 * * 一旦你自己定义了构造方法，Java自动提供的默认无参构造方法就会失效
 */

public class Student {
    public static void main(String[] args) {
        new Scanner(System.in); // new 的过程就是创建对象的过程
        new Random();

    }

    private String name;
    private int age;

    // 无参构造方法
    public Student() {
        System.out.println("无参构造方法被调用了");
    }

    // 有参的构造方法 初始化学生类的时候就给成员变量一个初始值
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("有参构造方法被调用了 " + this.name);
    }
    // 1.如果你不提供构造方法，系统会默认给你一个构造方法
    // 2.如果你提供了构造方法，系统不会给你提供一个构造方法
    // 3.构造方法是可以重载的，既可以定义参数，也可以不定义参数


}
