package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Joker_Dong
 * @date 2020-5-14 18:27
 */

public class Test02_ArrayList {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(1001);
            list.add(num);
        }

        // 调用一个方法 筛选出List 里面的偶数组成的新集合
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("---------------------------");
        System.out.println(printEvenList(list));
        System.out.println("-------------");
        ArrayList<Integer> list1 = printEvenList(list);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }


    }

    public static ArrayList<Integer> printEvenList(ArrayList<Integer> list){
        // 创建一个小集合 存储偶数
        ArrayList<Integer> smallList = new ArrayList<>();
        // 遍历传入的list
        for (int i = 0; i < list.size(); i++) {
            // 获取每一个元素
            Integer num = list.get(i);
            if (num%2 == 0){
                smallList.add(num);
            }
        }
        return smallList;

    }

}
