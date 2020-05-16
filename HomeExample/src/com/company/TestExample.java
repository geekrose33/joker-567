package com.company;

/**
 * @author Joker_Dong
 * @date 2020-5-15 20:48
 */

public class TestExample {
    public static void main(String[] args) {
        Example example = new Example();
        System.out.println(example);
        System.out.println(example.getPrice());
        System.out.println(example.getLogo());
        example.setLogo("Google");
        example.setPrice(800);
        System.out.println(example.getLogo());
        System.out.println(example.getPrice());
    }
}
