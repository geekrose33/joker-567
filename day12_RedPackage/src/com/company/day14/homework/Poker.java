package com.company.day14.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/**
 * @author Joker_Dong
 * @date 2020-7-29 11:31
 */

public class Poker {
    public static void main(String[] args) {
        // 创建map集合
        HashMap<Integer, String> pokerMap = new HashMap<>();
        // 花色和数字
        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<String> colors = new ArrayList<>();
        Collections.addAll(colors,"红桃♥","方片♦","黑桃♠","朝花♣");
        Collections.addAll(numbers,"2","3","4","5","6","7","8","9","10","J","Q","K","A");
        int count = 1;
        pokerMap.put(count++,"大王");
        pokerMap.put(count++,"小王");
        // 初始化其他牌
        for (String color:colors
             ) {
            for (String number:numbers){
                String card = color + number;
                pokerMap.put(count++,card);
            }
        }
        System.out.println(pokerMap);
        // 打乱顺序  打乱键的顺序
        Set<Integer> numberSet = pokerMap.keySet();  // set无序不重复
        ArrayList<Integer> numberList = new ArrayList<>(); // list有序可重复
        numberList.addAll(numberSet);
        Collections.shuffle(numberList);
        System.out.println(numberList);
        // 创建三个玩家 和 底牌 编号集合
        ArrayList<Integer> noP1 = new ArrayList<>();
        ArrayList<Integer> noP2 = new ArrayList<>();
        ArrayList<Integer> noP3 = new ArrayList<>();
        ArrayList<Integer> noDiPai = new ArrayList<>();

        // 不发牌 发编号
        for (int i = 0; i < numberList.size(); i++) {
            Integer no = numberList.get(i);
            if (i >= 51){
                noDiPai.add(no);
            }else if (i%3 == 0){
                noP1.add(no);
            }else if (i%3 == 1){
                noP2.add(no);
            }else{
                noP3.add(no);
            }
        }
        // 对编号进行排序
        Collections.sort(noP1);
        Collections.sort(noP2);
        Collections.sort(noP3);
        Collections.sort(noDiPai);
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        // 遍历
        for (Integer i1:noP1
             ) {
            String card1 = pokerMap.get(i1);
            player1.add(card1);
        }
        for (Integer i2:noP2
        ) {
            String card2 = pokerMap.get(i2);
            player2.add(card2);
        }
        for (Integer i3:noP3
        ) {
            String card3 = pokerMap.get(i3);
            player3.add(card3);
        }
        for (Integer i4:noDiPai
        ) {
            String card4 = pokerMap.get(i4);
            dipai.add(card4);
        }
        System.out.println("马云" + player1);
        System.out.println("马化腾" + player2);
        System.out.println("王健林" + player3);
        System.out.println("底牌" + dipai);
    }
}
