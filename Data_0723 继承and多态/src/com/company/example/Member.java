package com.company.example;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Joker_Dong
 * @date 2020-7-23 10:12
 */

public class Member extends User {

    // 收红包
    int membernum;

    public Member(float money, String userName) {
        super(money, userName);
    }
    public void getRedPackage(ArrayList<Integer> list){
        Random random = new Random();
        int index = random.nextInt(list.size());
        // Integer money = list.get(index);

        // 收完之后删除
        Integer removeMoney = list.remove(index);

        // 更新余额
        float money = super.getMoney();
        float updateMoney = money + removeMoney;
        super.setMoney(updateMoney);

    }
}
