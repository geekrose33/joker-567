package com.company.exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Joker_Dong
 * @date 2020-8-7 20:38
 */

public class iterator {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"路飞");
        map.put(2,"娜美");
        map.put(3,"索隆");
        Set<Integer> integers = map.keySet();

        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
