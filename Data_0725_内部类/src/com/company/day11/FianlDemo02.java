package com.company.day11;

/**
 * @author Joker_Dong
 * @date 2020-7-25 9:16
 */

public class FianlDemo02 {
    public static void main(String[] args) {
        final User user1 = new User();

        User user2 = new User();

        System.out.println(user1 == user2);

        // user1 = new User; 报错指向了新的对象 地址值改变
    }
}
