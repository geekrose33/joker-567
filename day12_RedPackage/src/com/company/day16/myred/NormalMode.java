package com.company.day16.myred;

import com.company.day16.myred.utils.OpenMode;

import java.util.ArrayList;

/**
 * @author Joker_Dong
 * @date 2020-7-31 18:26
 */

public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        // 把钱放入list中 再返回
        ArrayList<Integer> list = new ArrayList<>();
        int avg = totalMoney/totalCount;
        int mod = totalMoney%totalCount;
        for (int i = 0; i < totalCount - 1; i++) {
            list.add(avg);
        }
        list.add(avg + mod);
        return list;

    }
}
