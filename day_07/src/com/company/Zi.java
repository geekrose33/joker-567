package com.company;

/**
 * @author Joker_Dong
 * @date 2020-6-2 12:35
 */

public class Zi extends Fu{
    int num = 6;
    public void show() {
        // 调用父类的成员变量
        System.out.println("Fu num:" + super.num); // 继承来的
        // 调用子类的成员变量
        System.out.println("Zi num:" + this.num);
    }


}
