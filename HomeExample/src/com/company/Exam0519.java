package com.company;


import javax.print.DocFlavor;

/**
 * @author Joker_Dong
 * @date 2020-5-19 19:27
 */

public class Exam0519 {
    public static void main(String[] args) {
     /*   String str = new String();
        str = "abc";

        char [] chars = {'a','b','c'};
        String str2 = new String(chars);

        System.out.println(str);
        System.out.println(str2);
        char[] chars1 = str.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            chars1[i] = 'b';
        }
        System.out.println(chars1);
        for (int i = 0; i < chars1.length; i++) {
            System.out.println(chars1[i]);
        }
        System.out.println(str.equals(str2));

        byte bytes[] = {77,66,55};
        String str3 = new String(bytes);*/

        String str1 = new String();
        str1 = "Hello,";
        // String类中的 concat 方法
        // 在原字符串末尾添加字符串
        System.out.println(str1.concat("World！"));
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }
        // Sring类的 indexOf 方法
        // 返回子字符串第一次出现位置的索引
        System.out.println(str1.indexOf("el"));
        // String类的 substring 方法
        // 返回源字符串[beginIndex,endIndex)的子字符串
        System.out.println(str1.substring(2));
        System.out.println(str1.substring(2, 6));// substring 的 endIndex 的值取不到


    }
}
