package com.company.Homework;

/**
 * @author Joker_Dong
 * @date 2020-6-7 19:05
 */

public class Sun extends Star implements Universe {

    @Override
    public void doAnything() {
        System.out.println("doAnything 被重写");
    }

    public void shine() {
        System.out.println("太阳发光");
    }

}
