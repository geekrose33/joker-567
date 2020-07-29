package com.company.day13;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Joker_Dong
 * @date 2020-7-28 16:04
 */

public class TestForEach {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        // for each循环
        for(int a: arr){
            System.out.println(a);
        }
        // 使用多态形式创建集合对象
        Collection<String> coll = new ArrayList<>();
        // add 方法
        coll.add("小鲁班");
        coll.add("小小鲁班");
        coll.add("大鲁班");
        for (String hero: coll){
            System.out.println("当前英雄是： " + hero);
        }

        Collection<String> list = new ArrayList<>();
        list.add("同花顺");
        list.add("炸弹");
        list.add("王炸");
        for(String s : list){
            System.out.println(s);
        }
    }
}
