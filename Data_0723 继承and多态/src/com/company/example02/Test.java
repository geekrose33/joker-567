package com.company.example02;

/**
 * @author Joker_Dong
 * @date 2020-7-23 14:42
 */

public class Test {
    public static void main(String[] args) {
        Duck duck = new Duck("鸭子",2,"发烧","感冒");
        duck.showMsg();
        duck.showSymptom("发烧");
    }
}
