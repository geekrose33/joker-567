package com.company.day13;

/**
 * @author Joker_Dong
 * @date 2020-7-28 11:14
 */

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
//        builder.append("hello");
//        builder.append("hello");
        StringBuilder builder1 = builder.append("hello");
        System.out.println("builder = " + builder);
        System.out.println("builder1 = " + builder1);
        System.out.println(builder == builder1);

        // 可以添加任何类型
        builder.append("world");
        builder.append(true);
        builder.append(1000);

        // 在我们开发中，会遇到调用一个方法后，返回一个对象的情况，
        // 然后使用返回的对象继续调用方法
        // 这种我们可以使用链式编程的方式

        builder.append("haha").append("哈哈").append(true).append(1000);

        System.out.println(builder);

    }
}
