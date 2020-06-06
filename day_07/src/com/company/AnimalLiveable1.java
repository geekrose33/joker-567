package com.company;

/**
 * @author Joker_Dong
 * @date 2020-6-6 22:33
 */

public class AnimalLiveable1 implements Liveable1{
    // 继承 什么都可以不用写，直接调用即可

    // 重写

    @Override
    public void fly() {
        System.out.println("骄傲的在飞飞飞");
    }
}
