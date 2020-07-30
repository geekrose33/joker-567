package com.company.day15.lambda表达式;

/**
 * @author Joker_Dong
 * @date 2020-7-30 18:10
 */

public class Demo_Drink {
    public static void main(String[] args) {
        invokeDrink("喝红牛",(string) -> {
            System.out.println(string);
        });

    }
    public static void invokeDrink(String string,Drink drink){
        drink.drink(string);
    }
}
