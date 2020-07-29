package com.company.day13;

/**
 * @author Joker_Dong
 * @date 2020-7-28 11:44
 */

public class BaoZhuangDemo {
    public static void main(String[] args) {
        Integer integer = new Integer(4);  // 划线表示过时
        // 基本------》包装
        int i1 = integer.intValue();
        // 包装------》基本


        Integer i = Integer.valueOf(4);

        Integer i2 = 5;   // 自动装箱
        i2 = i2 + 5;   // 自动拆箱   i2原来为integer
        int a = 100;
        System.out.println("a的值" + a);  // 基本类型自动装箱为字符串


    }
}
