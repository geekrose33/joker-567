package com.company.day11.ClassMember;

import com.company.Main;

/**
 * @author Joker_Dong
 * @date 2020-7-25 14:27
 */

public class WangzheTest {
    public static void main(String[] args) {

        WangzheRole role = new WangzheRole();
        role.setFaShuAttack(new FaShuAttack() {
            @Override
            public void fashuAttack() {
                System.out.println("安其拉的羊肉串");
            }
        });
        // 法术攻击
        role.fashuSkillAttack();
        // 更换技能
        role.setFaShuAttack(new FaShuAttack() {
            @Override
            public void fashuAttack() {
                System.out.println("大乔叫你回家");
            }
        });
        role.fashuSkillAttack();
    }
}
