package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Joker_Dong
 * @date 2020-6-7 16:53
 */

public class DynamicTest1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(120);
        list.add(119);
        list.add(110);
        list.add(120);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        int a = 100;
        // 变成double 100.00 向下转型


    }
}
