package com.company.day14.homework;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Joker_Dong
 * @date 2020-7-29 20:08
 */

public class homework02 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");

        map.put(5,"李晓红");
        map.remove(1);
        map.put(2,"周林");
        System.out.println(map);

    }
}
