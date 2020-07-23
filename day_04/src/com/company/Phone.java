package com.company;

/**
 * @author Joker_Dong
 * @date 2020-4-26 19:16
 */

public class Phone {

    String logo;
    int price;
    String color;

    public void sendMessage(String name) {
        System.out.println("给" + name + "发短信");
    }

    public void callSomebody() {
        System.out.println("打电话");
    }
}
