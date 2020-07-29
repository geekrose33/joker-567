package com.company.day13;

/**
 * @author Joker_Dong
 * @date 2020-7-28 14:09
 */

public class Demo {
    public static void main(String[] args) {
        // "123" ,123
        // 基本类型转换为String类型
        int a = 100;
        String b = "" + a;
        System.out.println(b);  // b 为字符串100

        // String------》基本数据类型
        int i = Integer.parseInt("120");
        // 包装类都有parseXxx静态方法可以将字符串参数转化为对应的基本数据类型
        System.out.println(i);
        // cast 转换
        Integer integer = Integer.valueOf("120");
        System.out.println(integer);  // 包装成Integer
    }
}
