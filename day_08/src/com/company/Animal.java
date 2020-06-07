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
    // 无法重写静态方法 只能通过接口名去实现


}
