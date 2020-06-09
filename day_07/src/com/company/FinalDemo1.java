package com.company;

/**
 * @author Joker_Dong
 * @date 2020-6-9 14:43
 */

public class FinalDemo1 {
    public static void main(String[] args) {
        // 声明一个变量，使用final修饰
        final int al;
        al = 10;
        System.out.println(al);
//        al = 20;  报错 不可重新赋值
        final int b = 100;
//        b = 111;  不可重新赋值
/*
        final int c = 0;
        for (int i = 0; i < 10 ; i++) {
            c = i;
            System.out.println(c);
        }
*/

        // 可以通过编译 可以运行
        for (int i = 0; i < 10; i++) {
            final int c1 = i;   // 因为 c1是局部变量 每次循环是一个新的变量
            System.out.println(c1);
        }

    }
}
