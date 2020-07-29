package com.company.myredbag;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Joker_Dong
 * @date 2020-7-27 11:09
 */

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney,final int totalCount){

        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();

        int leftMoney = totalMoney;
        int leftCount = totalCount;

        for (int i = 0; i < totalCount - 1; i++) {
            int randomMoney = random.nextInt(totalMoney / totalCount * 2);
            arrayList.add(randomMoney);
            leftMoney = leftMoney - randomMoney;
        }
        arrayList.add(leftMoney);
        return arrayList;
    }
}
