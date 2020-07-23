package Homework2;

/**
 * @author Joker_Dong
 * @date 2020-6-14 20:55
 */

public class Player {
    public boolean choose;

    public void FightAbleselect(String str) {

        System.out.println("请选择角色： ");
        if (str == "武力角色") {
            System.out.println("选择战士");
            Warrior warrior = new Warrior();
            showWarritor(warrior);
        } else if (str == "法力角色") {
            System.out.println("选择法师");
            Master master = new Master();
            showMaster(master);
        } else {

            System.out.println("请做出合法选择");
        }


    }

    public void showMaster(Master master) {
        master.specialFight();
        master.commonFight();
    }

    public void showWarritor(Warrior warrior) {
        warrior.specialFight();
        warrior.commonFight();
    }
}

