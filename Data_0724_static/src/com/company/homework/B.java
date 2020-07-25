package com.company.homework;

/**
 * @author Joker_Dong
 * @date 2020-7-24 19:00
 */

public class B implements A {
    @Override
    public void showA(){
        System.out.println("接口A的方法showA被重写");
    }
    public static void showD(){
        System.out.println("DDDD");
    }
}
