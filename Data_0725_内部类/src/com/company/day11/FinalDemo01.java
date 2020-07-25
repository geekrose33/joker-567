package com.company.day11;

/**
 * @author Joker_Dong
 * @date 2020-7-25 9:05
 */

public class FinalDemo01 {
    public static void main(String[] args) {
        // 声明一个变量 被final修饰
        final int a;
        a = 10;
//        a = 20;      不可以
        final int b = 20;
//        b = 20;      不可以

        // 不能通过编译 变量c 经过final修饰 不能更改它的值

//        final int c = 0;
//        for (int i = 0; i < 5; i++) {
//            c = i;
//            System.out.println(c);
//        }
//
        // 能通过编译是因为每一次循环都创建了一个新的变量d 没有二次赋值
        for (int i = 0; i <5 ; i++) {
            final int d = i;
            System.out.println(d);
        }

    }
}
