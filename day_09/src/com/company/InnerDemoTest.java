package com.company;

/**
 * @author Joker_Dong
 * @date 2020-6-14 14:23
 */

public class InnerDemoTest {
    public static void main(String[] args) {
        // 创建外部类对象
        Person person = new Person();

        // 创建内部类对象
        // 格式：
        Person.Heart heart = person.new Heart();
        // 调用内部类方法
        heart.jump();

        // 调用外部类方法
        boolean live = person.isLive();
        System.out.println(live);

        person.setLive(false);
        System.out.println(live);
        heart.jump();
    }
}
