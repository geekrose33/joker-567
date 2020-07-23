package com.company;

/**
 * @author Joker_Dong
 * @date 2020-5-23 8:23
 */

public class StringExam_01 {
    public static void main(String[] args) {
/*
        String str1 = new String("abc");
        System.out.println(str1);
        String str2 = "abc";
        String str3 = "ABC";
        // String 类 的equals、equalsIgnore方法
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println("------------------------------------");
        System.out.println(str1.equalsIgnoreCase(str3));
*/

        char[] data = {'a', 'b', 'c'};
        System.out.println(data.clone() != data);
        System.out.println(data.clone());


    }
}
