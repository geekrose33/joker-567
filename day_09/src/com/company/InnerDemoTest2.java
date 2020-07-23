package com.company;

/**
 * @author Joker_Dong
 * @date 2020-6-14 14:33
 */

public class InnerDemoTest2 {
    public static void main(String[] args) {
        FlyAble f = new FlyAble() {
            @Override
            public void fly() {
                System.out.println("起飞飞飞飞飞飞飞");
            }
        }; // 这是一句话

        // 调用fly方法
        f.fly();


        GaLen gaLen = new GaLen() {

            public void bigsword() {
                System.out.println("德玛西亚！！！！！！！！！！！！");
            }

        };
        gaLen.bigsword();
        System.out.println(gaLen.getHp());
        gaLen.levelUp();
        System.out.println("血量为： " + gaLen.getHp());
        System.out.println("攻击力为： " + gaLen.getAgressivity());
        gaLen.levelUp();
        System.out.println("血量为： " + gaLen.getHp());
        System.out.println("攻击力为： " + gaLen.getAgressivity());

    }

}
