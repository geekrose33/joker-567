package com.company;

/**
 * @author Joker_Dong
 * @date 2020-7-23 16:59
 */

public class StringDemo03 {
    public static void main(String[] args) {
        String s = "hello world";
        // 转化为字符数组
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        // 转化为字符数组
        byte[] bytes = s.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);

        }
    }
}
