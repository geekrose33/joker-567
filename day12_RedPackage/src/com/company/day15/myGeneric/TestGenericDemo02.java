package com.company.day15.myGeneric;

/**
 * @author Joker_Dong
 * @date 2020-7-30 9:14
 */

public class TestGenericDemo02 {
    public static void main(String[] args) {
        MyGenericClass02<String> star01 = new MyGenericClass02<>();
        star01.setStar("周星驰");
        System.out.println(star01.getStar());


    }
}
