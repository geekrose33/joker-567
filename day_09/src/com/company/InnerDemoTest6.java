package com.company;

/**
 * @author Joker_Dong
 * @date 2020-6-14 18:14
 */

public class InnerDemoTest6 {
    public static void main(String[] args) {
        WangZheRole role1 = new WangZheRole();

        // 设置角色的法术技能
        role1.setFaShuSkill(new FaShuSkill() {
            @Override
            public void faShuAttack() {
                System.out.println("发射爱心");
            }
        });

        //  发动法术攻击
        role1.faShuSkillAttack();

        // 发动法术攻击
        role1.faShuSkillAttack();


        // 更换技能
    }
}
