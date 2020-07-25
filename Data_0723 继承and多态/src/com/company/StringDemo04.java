package com.company;

/**
 * @author Joker_Dong
 * @date 2020-7-23 17:07
 */

public class StringDemo04 {
    public static void main(String[] args) {
        String s = "111222333@qq.com";
        String [] strings = s.split("@");
        //
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        String s1 = "aa/bb/cc/dd";
        String [] strings1 = s1.split("/");
        for (int i = 0; i < strings1.length; i++) {
            System.out.println(strings1[i]);
        }
    }
}
