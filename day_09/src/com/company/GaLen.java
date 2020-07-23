package com.company;

/**
 * @author Joker_Dong
 * @date 2020-6-14 14:39
 */

public abstract class GaLen {
    public double hp = 800.01;

    public int agressivity = 100;

    public abstract void bigsword();

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public void levelUp() {
        System.out.println("升级了！血量UP!");
        this.hp = hp + 200;
        System.out.println("升级了！攻击力UP!");
        this.agressivity = agressivity + 50;
    }

    public int getAgressivity() {
        return agressivity;
    }


}
