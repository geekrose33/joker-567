package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Joker_Dong
 * @date 2020-6-5 19:20
 * 普通成员类
 */

public class Member extends User{
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }
    // 收红包
    public void receive(ArrayList<Integer> list){
        // 从众多的红包中随机选一个
        int index = new Random().nextInt(list.size());
        // 1.获取堆积索引

        // 2.根据索引从集合中删除领完的那个红包
      /*  int receiveMoney = list.get(index);
        int delMoney = list.remove(index);*/
        int delMoney = list.remove(index);
        // 3.查看当前会员还有多少钱
        int money = super.getMoney();
        // 4.重新设置一个余额
        super.setMoney(money + delMoney);



    }
}
