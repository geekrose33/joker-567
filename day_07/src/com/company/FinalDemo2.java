package com.company;

/**
 * @author Joker_Dong
 * @date 2020-6-9 14:53
 */

public class FinalDemo2 {
    public static void main(String[] args) {

        // final修饰引用数据类型
        // 引用类型的局部变量 被final修饰
        // 只能指向一个对象 地址值是不能改变的
        // 但是不影响对象内部成员变量值的修改

        final User1 user1 = new User1();
        // User1的地址值不能改变
//        User1 = new User1();

        User1 user2 = new User1();
        System.out.println(user1 == user2);
        System.out.println(user1.getName());
        user1.setName("李四");
        System.out.println(user1.getName());

    }
}
