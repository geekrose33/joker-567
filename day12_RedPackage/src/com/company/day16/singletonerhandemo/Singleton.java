package com.company.day16.singletonerhandemo;

/**
 * @author Joker_Dong
 * @date 2020-7-31 8:58
 */

public class Singleton {
    private static Singleton instance = new Singleton();
    public static Singleton getInstance(){
        return instance;
    }

    private Singleton() {
    }
}
