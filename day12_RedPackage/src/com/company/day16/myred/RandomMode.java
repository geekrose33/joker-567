package com.company.day16.myred;

import com.company.day16.myred.utils.OpenMode;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Joker_Dong
 * @date 2020-7-31 18:26
 */

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();

        int leftMoney = totalMoney;
        Random random = new Random();
        for (int i = 0; i < totalCount - 1; i++) {
            int Money = random.nextInt(totalMoney / totalCount * 2);
            list.add(Money);
            leftMoney = leftMoney - Money;

        }
        list.add(leftMoney);
        return list;

    }
}
