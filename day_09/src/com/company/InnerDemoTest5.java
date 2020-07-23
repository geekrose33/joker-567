package com.company;

/**
 * @author Joker_Dong
 * @date 2020-6-14 15:45
 */

public class InnerDemoTest5 {
    public static void main(String[] args) {
        Weapon weapon1 = new Weapon("M4A1", 1210);

        Armour armour1 = new Armour("三级甲", 555);

        Role role = new Role();
        // 设置武器属性
        role.setWp(weapon1);

        // 设置盔甲属性
        role.setAr(armour1);
        role.wear();
        role.attack();
    }
}
