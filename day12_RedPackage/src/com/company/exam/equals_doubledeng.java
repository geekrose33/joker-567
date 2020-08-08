package com.company.exam;

/**
 * @author Joker_Dong
 * @date 2020-8-7 20:54
 */

public class equals_doubledeng {
    public static void main(String[] args) {
        String str = "hello";
        /* String str = "hello"; 是一种特殊的赋值方式
           一 ： 先在内存中找hello 有就让引用str 指向它 没有就创建一个hello对象 让str 指向它
           二 ： 如果没有就创建一个hello对象 让str 指向它

           String str = new String("hello");
            这种方式赋值str 不管内存有没有hello 都新建一个对象（即地址值不同）
         */
        String str1 = "hello";
        String str2 = new String("hello");
        // equals 比较两个对象的内容是否相同
        System.out.println(str1.equals(str));
        System.out.println(str.equals(str2));


        // == 比较两个对象的地址值是否相同
        System.out.println(str1 == str);
        System.out.println(str == str2);
    }
}
