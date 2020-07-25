package com.company.day11.InterfaceDemo;

import java.util.ArrayList;

/**
 * @author Joker_Dong
 * @date 2020-7-25 14:37
 */

public class Demo01 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        ArrayList<Integer> evenList = getEvenNum(arrayList);
        System.out.println(evenList);
    }

    public static ArrayList<Integer> getEvenNum(ArrayList<Integer> list){
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0){
                evenList.add(list.get(i));
            }else{
                continue;
            }
        }

        return evenList;
    }
}
