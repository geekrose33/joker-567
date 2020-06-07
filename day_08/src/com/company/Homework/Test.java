package com.company.Homework;

/**
 * @author Joker_Dong
 * @date 2020-6-7 19:06
 */

public class Test {
    public static void main(String[] args) {
        Star star = new Star();
        star.shine();

        Star sun= new Sun();
        sun.doAnything();



        sun = new Star();
        sun.shine();
    }
}
