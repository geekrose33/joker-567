package com.company;

/**
 * @author Joker_Dong
 * @date 2020-6-14 15:14
 */

public class InnerDemoTest4 {
    public static void main(String[] args) {
        /*
         * 1. 等号右边 定义并创建该接口的子类对象
         * 2. 等号左边 是多态 接口类型引用指向子类对象
         * */

        FlyAble f = new FlyAble() {
            @Override
            public void fly() {
                System.out.println("起飞飞飞飞飞飞飞");
            }
        }; // 这是一句话

        // 在实际开发中常用的形式
        showFly(new FlyAble() {
            @Override
            public void fly() {
                System.out.println("起飞飞飞飞飞飞飞");
            }
        });


    }

    // 将带有匿名内部类作为方法的参数进行传递
    public static void showFly(FlyAble f) {
        f.fly();
    }
}
