package com.company.myredbag;

import java.util.ArrayList;

/**
 * @author Joker_Dong
 * @date 2020-7-27 11:09
 */

public class NormalMode implements OpenMode {

    @Override
    public ArrayList<Integer> divide(final int totalMoney,final int totalCount){
        ArrayList<Integer> arrayList = new ArrayList<>();

        int avg = totalMoney/totalCount;
        int mod = totalMoney%totalCount;

        for (int i = 0; i < totalCount - 1; i++) {
            arrayList.add(avg);
        }
        arrayList.add(avg + mod);
        return arrayList;
    }

}
