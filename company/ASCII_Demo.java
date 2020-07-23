package com.company;

public class ASCII_Demo {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c);
        int j = 45;
        System.out.println(c + j);

        int i = 20;
        i = i + 1;
        System.out.println(i);
        // s+=1 只运算一次并带有强制类型转换
        // short s;
        // s = s + 1;  s = 1为int类型 赋值给short类型的s 就会报错

        // 自增运算
        int a = 1;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);


    }
}
