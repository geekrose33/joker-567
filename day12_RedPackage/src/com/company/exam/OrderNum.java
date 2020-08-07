package com.company.exam;

import java.util.*;

/**
 * @author Joker_Dong
 * @date 2020-8-6 21:02
 */

public class OrderNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>();



        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 6; i++) {
            int j = scanner.nextInt();
            map.put(i,j);
//            list.add(j);
        }
//        System.out.println(list);
//        System.out.println(map.size());

        System.out.println("排序前：" + map);
        Map<Integer, Integer> numOrder = numOrder(map, 3);
        System.out.println("排序后" + numOrder);
//        System.out.println(list);



    }
    public static Map<Integer,Integer> numOrder(HashMap<Integer,Integer> map, int m){

        HashMap<Integer, Integer> toMap = new HashMap<>();
        for (int i = 0; i < map.size(); i++) {
            if (i >= map.size() - m){
                for (int j = 0; j < m; j++) {

                    toMap.put(j,map.get(i++));

                }


            }else{
                toMap.put(i+m,map.get(i));
            }


        }

        return toMap;

    }
}
