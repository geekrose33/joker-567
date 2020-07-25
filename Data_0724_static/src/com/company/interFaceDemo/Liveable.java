package com.company.interFaceDemo;

import java.security.PublicKey;

public interface Liveable {
    // 定义抽象方法
    public abstract void eat();

    public abstract void sleep();

    public default void fly() {
        System.out.println("起飞飞飞飞");
        func1();
        func2();
    }

    private void func1(){
        System.out.println("func1");
    }

    private void func2(){
        System.out.println("func2");
    }


    public static void run() {
        System.out.println("嗷嗷跑");
    }

}
