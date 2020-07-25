package com.company.example;

import java.util.ArrayList;

/**
 * @author Joker_Dong
 * @date 2020-7-23 10:09
 */

public class Manager extends User {


    // 发红包
    public ArrayList<Integer> sendRedPackage(int sendMoney,int count){
        ArrayList<Integer> redList = new ArrayList<>();

        // 判断
        if(sendMoney > super.getMoney()){
            System.out.println("余额不足");
        }
        // 扣钱
        super.setMoney(getMoney()-sendMoney);
        // 每个人的钱
        int avg = sendMoney/count;
        // 除不开余出来的钱
        int mod = sendMoney%count;

        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);

        }
        int last = avg + mod;
        redList.add(last);

        return redList;
    }

    public Manager(float money, String userName) {
        super(money, userName);
    }
}
