package com.company.interFaceDemo;

import java.util.ArrayList;

/**
 * @author Joker_Dong
 * @date 2020-7-24 14:38
 */

public class TestInterface {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.eat();
        animal.sleep();
        animal.fly();
        Liveable.run();

    }
}
