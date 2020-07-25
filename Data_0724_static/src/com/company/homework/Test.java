package com.company.homework;

/**
 * @author Joker_Dong
 * @date 2020-7-24 19:01
 */

public class Test {
    public static void main(String[] args) {
        A.showB10();
        A.showC10(); // 静态方法不需要经过创建对象 直接通过接口或者类去调用方法
        B b = new B();
        b.showA();
        B.showD();
    }
}
