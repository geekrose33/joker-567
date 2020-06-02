package com.company;

/**
 * @author Joker_Dong
 * @date 2020-6-2 12:35
 */

public class Zi extends Fu{
    int num = 6;
    // 重写父类的方法 建议使用该注解进行标识
    /*
    public void show() {
        // 调用父类的成员变量
        System.out.println("Fu num:" + super.num); // 继承来的
        // 调用子类的成员变量
        System.out.println("Zi num:" + this.num);
    }*/
    @Override
    public void show() {
        System.out.println("Zi类show的方法被执行");
    }

}
