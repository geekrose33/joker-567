package com.company.day11.ClassMember;

/**
 * @author Joker_Dong
 * @date 2020-7-25 14:14
 */

public class Test {
    public static void main(String[] args) {
        Weapon weapon = new Weapon("98k",9999);

        Armour armour = new Armour("一级甲",5000);

        Role role = new Role();
        // 设置武器
        role.setWeapon(weapon);
        // 设置防御
        role.setArmour(armour);
        // 攻击
        role.attack();
        role.wear();


    }
}
