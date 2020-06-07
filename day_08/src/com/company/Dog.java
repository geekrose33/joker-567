package com.company;

/**
 * @author Joker_Dong
 * @date 2020-6-7 15:06
 */

public class Dog extends Animal implements LiveAble,Pat{
    // 多实现的格式;
//    class 类名 extends 父类名 implements 接口1,接口2---(){}
    // 必须重写接口中所有的抽象方法
    // 可选的是 重写接口中的默认方法

    // 如果抽象方法有重名的，只需要重写一次就可以

    @Override
    public void ShouYang() {

    }

    @Override
    public void func() {

    }

    @Override
    public void show() {
        System.out.println("show() 重写");

    }

    @Override
    public void eat() {
        System.out.println("狗在猛吃");
    }

    @Override
    public void method() {
        System.out.println("子类默认方法重写");
    }

}
