package com.company;

/**
 * @author Joker_Dong
 * @date 2020-6-14 14:33
 */

public class InnerDemoTest2 {
    public static void main(String[] args) {
        FlyAble f = new FlyAble(){
            @Override
            public void fly() {
                System.out.println("起飞飞飞飞飞飞飞");
            }
        }; // 这是一句话

        // 调用fly方法
        f.fly();
    
    }

}
