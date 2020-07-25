package com.company.day11.ClassMember;

/**
 * @author Joker_Dong
 * @date 2020-7-25 11:43
 */

public class Weapon {
    String name;
    int hurt; // 伤害

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHurt() {
        return hurt;
    }

    public void setHurt(int hurt) {
        this.hurt = hurt;
    }

    public Weapon(String name, int hurt) {
        this.name = name;
        this.hurt = hurt;
    }
}
