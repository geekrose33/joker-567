package com.company;

/**
 * @author Joker_Dong
 * @date 2020-7-24 11:09
 */

public class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("小猫吃鱼");
    }
    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
