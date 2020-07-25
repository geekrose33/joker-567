package com.company.day11.InnerClassDemo02;

/**
 * @author Joker_Dong
 * @date 2020-7-25 11:14
 */

public class InnerDemo {
    public static void main(String[] args) {

        /*
        * 等号左边：是多态赋值 接口类型引用指向子类对象
        * 等号右边：是匿名内部类，定义并创建该接口的子类对象
        *
        * */

        // 匿名内部类 合四步为一步
        FlyAble f = new FlyAble(){
            @Override
            public void fly(){
                System.out.println("起飞！");
            }
        };
        f.fly();

        showFly(f);  // 接口作为形参传入方法
        showFly(new FlyAble(){
            @Override
            public void fly(){
                System.out.println("起飞！");
            }
        });


    }
    public static void showFly(FlyAble flyAble){
        flyAble.fly();
    }
}
