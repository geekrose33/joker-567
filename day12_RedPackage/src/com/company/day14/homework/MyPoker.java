package com.company.day14.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/**
 * @author Joker_Dong
 * @date 2020-7-29 13:54
 */

public class MyPoker {
    public static void main(String[] args) {
        HashMap<Integer, String> pokerSet = new HashMap<>();

        // 先做牌放入扑克集合
        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<String> colors = new ArrayList<>();
        Collections.addAll(numbers,"2","3","4","5","6","7","8","9","10","J","Q","K","A");
        Collections.addAll(colors,"红桃♥","方片♦","黑桃♠","朝花♣");
        int count = 1;
        pokerSet.put(count++,"大王");
        pokerSet.put(count++,"小王");

        for (String color:colors){
            for (String number:numbers){
                String card = color + number;
                pokerSet.put(count++,card);
            }
        }
//        System.out.println(pokerSet);
        // 提取扑克对应的key放入四个编号集合中
        Set<Integer> pokerKey = pokerSet.keySet();
        ArrayList<Integer> pokerList = new ArrayList<>();
        // 把提取出来的keY放入arraylist中
        pokerList.addAll(pokerKey);
        Collections.shuffle(pokerList);
//        System.out.println(pokerList);
        // 把编号一次分给对应的角色
        ArrayList<Integer> noP1 = new ArrayList<>();
        ArrayList<Integer> noP2 = new ArrayList<>();
        ArrayList<Integer> noP3 = new ArrayList<>();
        ArrayList<Integer> noDiPai = new ArrayList<>();
        for (int i = 0; i < pokerList.size(); i++) {
            if (i >= 51){
                Integer noCardDi = pokerList.get(i);
                noDiPai.add(noCardDi);
            } else if (i%3 == 0) {
                Integer noCard1 = pokerList.get(i);
                noP1.add(noCard1);
            }else if (i %3 == 1){
                Integer noCard2 = pokerList.get(i);
                noP2.add(noCard2);
            }else{
                Integer noCard3 = pokerList.get(i);
                noP3.add(noCard3);
            }

        }
        // 排个序 把键的编号分完 就可以分牌了
        Collections.sort(noP1);
        Collections.sort(noP2);
        Collections.sort(noP3);
        Collections.sort(noDiPai);

        // 创建收牌的角色
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (Integer i1:noP1
             ) {
            String card1 = pokerSet.get(i1);
            player1.add(card1);
        }
        for (Integer i2:noP2
             ) {
            String card2 = pokerSet.get(i2);
            player2.add(card2);
        }
        for (Integer i3:noP3
             ) {
            String card3 = pokerSet.get(i3);
            player3.add(card3);
        }
        for (Integer i4:noDiPai
             ) {
            String card4 = pokerSet.get(i4);
            dipai.add(card4);
        }
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(dipai);

    }
}
