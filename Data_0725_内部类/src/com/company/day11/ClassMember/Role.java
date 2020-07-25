package com.company.day11.ClassMember;

import java.io.LineNumberReader;

/**
 * @author Joker_Dong
 * @date 2020-7-25 11:42
 */

public class Role {
    int id;
    int blood;  // 生命值
    String name;

    // 添加武器属性
    Weapon weapon;   // 对象作为成员变量
    Armour armour;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armour getArmour() {
        return armour;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }


    // 攻击
    public void attack(){
        System.out.println("使用" + weapon.getName() + ", 造成了" + weapon.getHurt() + "点伤害");

    }
    // 防御
    public void wear(){
        // 增加防御
        this.blood += armour.getProtect();
        System.out.println("穿上了" + armour.getName() + "生命值增加了"+ armour.getProtect());
    }

}
