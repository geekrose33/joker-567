package com.company;

/**
 * @author Joker_Dong
 * @date 2020-6-7 14:23
 */

public class Animal implements LiveAble{

    @Override
    public void run1() {
        System.out.println("抽象方法---跑起来");
    }

    @Override
    public void func() {

    }

    @Override
    public void show() {
        System.out.println("show() 重写");

    }
    // 如果默认方法有重名的 必须重写一次

    // 无法重写静态方法 只能通过接口名去实现


}
