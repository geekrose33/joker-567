package com.company.day12.day12.redbag;

import com.company.day12.day12.redbag.utils.OpenMode;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author lbf
 * @date 2020/7/27 9:21
 */
public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {

        /*
        随机分配  totalMoney 单位是分
        最少1分钱，最多不超过剩下金额平均数的两倍，在发红包的同时 应该i越发越少
        随机金额公式：  1 + random.nextInt(最多不超过剩下金额平均数的两倍)
        */
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        // 分别代表剩下多少钱和剩下多少份
        int leftMoney = totalMoney;
        int leftCount = totalCount;

        // 随机发钱n-1个，最后一个不需要随机
        for (int i = 0; i < totalCount - 1; i++) {
            // 随机出来的金额
            int money = 1 + random.nextInt(leftMoney/leftCount*2);
            // 将随机出来的金额放入集合
            list.add(money);
            leftCount--;
            // 剩下的份数减一
            leftMoney = leftMoney - money;

        }
        // 处理最后一个
        list.add(leftMoney);
        return list;


    }



}
