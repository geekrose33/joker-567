package com.company.sendRedBag;

/**
 * @author Joker_Dong
 * @date 2020-7-24 19:50
 */

public class Test {
    public static void main(String[] args) {

        User user1 = new User("甲", 500);
        User user2 = new User("乙", 400);
        User user3 = new User("丙", 300);
        user1.show();
        user2.show();
        user3.show();
        user1.sendMoney(100,2);
        user2.receiveMoney();
        user3.receiveMoney();
        user1.show();
        user2.show();
        user3.show();
    }
}
