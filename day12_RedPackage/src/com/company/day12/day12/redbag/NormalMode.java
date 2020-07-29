package com.company.day12.day12.redbag;

import com.company.day12.day12.redbag.utils.OpenMode;

import java.util.ArrayList;

/**
 * @author lbf
 * @date 2020/7/27 9:21
 */
public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide( final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        //100/3
        int avg = totalMoney / totalCount;
        int mod = totalMoney % totalCount; //零头

        for (int i = 0; i < totalCount - 1; i++) {
            list.add(avg);
        }
        //零头放在最后一个包中
        list.add(avg + mod);
        return list;
    }
}
