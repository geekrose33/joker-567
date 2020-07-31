package com.company.day16;

import com.company.day16.singletonerhandemo.Singleton;

/**
 * @author Joker_Dong
 * @date 2020-7-31 9:03
 */

public class Test {
    public static void main(String[] args) {
//        new com.company.day16.singletonlanhandemo.Singleton()
//        Singleton singleton = new Singleton();
        Singleton instance = Singleton.getInstance();


    }
}
