package com.company;

/**
 * @author Joker_Dong
 * @date 2020-7-23 16:46
    获取功能的方法
 */

public class GetDemo02 {

    public static void main(String[] args) {

        String s = "hello world";

        // 获取字符串的长度
        System.out.println(s.length());
        System.out.println("---------------------------------");
        String s2 = s.concat("**haha");
        System.out.println(s2);

        System.out.println("---------------------------------");
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));

        System.out.println("---------------------------------");
        // indexOf 返回第一次出现的索引
        // 没有目标第一次出现的索引 返回-1
        System.out.println(s.indexOf("l"));  // 从0计数
        System.out.println(s.indexOf("s"));

        System.out.println("---------------------------------");
        // subString 从start index 开始剪切
        System.out.println(s.substring(0));
        System.out.println(s.substring(5));



    }

}
