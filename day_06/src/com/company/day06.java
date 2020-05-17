package com.company;



/**
 * @author Joker_Dong
 * @date 2020-5-17 14:21
 */

public class day06 {
    public static void main(String[] args) {
        // String 类（java.lang包里的String类）
        String s1 = "abc";
        System.out.println(s1);
        s1 += 'd';
        String s2 = "abc";
        System.out.println(s2);
        System.out.println(s1);
        System.out.println(new String("abc"));
        // 上面abc的创建相当于 new String传入char型数组
        char data[] = {'a','b','c'};
        String str = new String(data);
        // String 是底层字符数组实现的




    }
}
