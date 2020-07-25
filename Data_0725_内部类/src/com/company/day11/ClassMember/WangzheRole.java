package com.company.day11.ClassMember;

/**
 * @author Joker_Dong
 * @date 2020-7-25 14:24
 */

public class WangzheRole {
    FaShuAttack faShuAttack;

    public void setFaShuAttack(FaShuAttack faShuAttack) {
        this.faShuAttack = faShuAttack;
    }
    // 法术攻击
    public void fashuSkillAttack(){
        System.out.println("发动法术攻击'");
        faShuAttack.fashuAttack();
        System.out.println("攻击完毕");
    }
}
