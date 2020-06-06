package com.company;

/**
 * @author Joker_Dong
 * @date 2020-6-6 22:22
 */

public class AnimalLiveable implements Liveable {
    @Override
    public void eat() {
        System.out.println("一顿吃");
    }

    @Override
    public void sleep() {
        System.out.println("呼呼睡");
    }
}
