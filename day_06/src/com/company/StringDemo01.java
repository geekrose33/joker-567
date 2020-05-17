package com.company;

/**
 * @author Joker_Dong
 * @date 2020-5-17 14:35
 */

public class StringDemo01 {


    // instanceof 判断是否为要判断的数据类型 返回true false
    // （String）anObject强制类型转换为String类型
    public static void main(String[] args) {
        // String 的equal方法
        // 创建字符串
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "HELLO";
        // equals(Object anObject)
        //          将此字符串与指定的对象比较
        // 相同的话为true 不同为false
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));
        boolean b = s1.equals(s3);
        System.out.println(b);

        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s2)); //igorecase忽略大小写
        System.out.println(s1.equalsIgnoreCase(s3));

        // 扩展：大厂面试题 （重点中的重点）

        // 基本数据类型比较用 ==

        // 引用数据类型比较的是 地址值

        // String的equals是如何实现的


    }

        // 基本类型数据 == 比较真实值
    // 引用数据 == 比较地址值

}
