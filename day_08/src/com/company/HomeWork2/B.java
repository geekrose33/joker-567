package com.company.HomeWork2;

/**
 * @author Joker_Dong
 * @date 2020-6-7 20:00
 */

public class B implements A{
    public static void showD(){
        System.out.println("D");
    }


    @Override
    public void showA() {
        System.out.println("A");
    }
}
