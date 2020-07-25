package com.company;

/**
 * @author Joker_Dong
 * @date 2020-7-23 15:19
 */

public class StringDemo01 {
    public static void main(String[] args) {
        byte bytes[] = {97,98,99};
        String s1 = new String(bytes);

        String s2 = "hello";
        String s3 = "Hello";
        String s4 = "HeLLO";

        System.out.println(s2.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
        // equalsIgnoreCase 忽略字符串大小写

        System.out.println(s2 == s2);
        // 比较地址值

        System.out.println("--------------------------------------");
        int i = 2;
        int j = 2;
        char m = '2';
        System.out.println(i == j);
            // == 比较的是两个对象的内容
        System.out.println(i == m);

        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.equals(obj1));/// 所有对象都会有equals方法


    }


}
