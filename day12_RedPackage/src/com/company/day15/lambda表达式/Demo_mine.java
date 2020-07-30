package com.company.day15.lambda表达式;

/**
 * @author Joker_Dong
 * @date 2020-7-30 15:46
 */

public class Demo_mine {
    public static void main(String[] args) {
        survive(new Fly() {
            @Override
            public void fly() {
                System.out.println("在匿名内部类里实现起飞");
            }
        });

        survive(()->{
            System.out.println("在lambda表达式里实现起飞");
        });

    }
    public static void survive(Fly fly){
        fly.fly();
    }
}
