package com.company;

import java.util.Arrays;

/**
 * @author Joker_Dong
 * @date 2020-5-19 20:27
 */

public class Exam0519_02 {
    public static void main(String[] args) {
        String str = new String();
        str = "abcde";
        System.out.println(str);
        char[] chars={'a','b','c'};
        System.out.println(chars);
        byte[] bytes = str.getBytes();
        // String 类 的转换方法getBytes
        // 字符串值不可变 只能通过转换为数组形式来修改

        char arr[] = {'a','b','c','d'};
        System.out.println(arr); // 数组无法直接输出 可以通过字符串形式输出
        System.out.println(Arrays.toString(arr)); // 调用Arrays类的静态方法 字符串形式输出arr
    }
}
