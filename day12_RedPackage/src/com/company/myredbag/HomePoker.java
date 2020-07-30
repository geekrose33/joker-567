package com.company.myredbag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/**
 * @author Joker_Dong
 * @date 2020-7-30 8:21
 */

public class HomePoker {
    public static void main(String[] args) {
        HashMap<Integer, String> pokerSet = new HashMap<>();

        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<String> colors = new ArrayList<>();
        Collections.addAll(numbers,"2","3","4","5","6","7","8","9","10","J","Q","K","A");
        Collections.addAll(colors,"红桃♥","方片♦","黑桃♠","朝花♣");
        int count = 1;
        pokerSet.put(count++,"大王");
        pokerSet.put(count++,"小王");
        for (String color:colors
             ) {
            for (String number:numbers
                 ) {
                String card = color + number;
                pokerSet.put(count++ , card);
            }
        }
//        System.out.println(pokerSet);
        // 把编号key提取出来
        Set<Integer> pokerKey = pokerSet.keySet();
        ArrayList<Integer> pokerList = new ArrayList<>();
        // 把编号放里
        pokerList.addAll(pokerKey);
        Collections.shuffle(pokerList);
        System.out.println(pokerList);

        // 分编号的序号
        ArrayList<Integer> noP1 = new ArrayList<>();
        ArrayList<Integer> noP2 = new ArrayList<>();
        ArrayList<Integer> noP3 = new ArrayList<>();
        ArrayList<Integer> noDiPai = new ArrayList<>();

        for (int i = 0; i < pokerList.size(); i++) {
            if (i >= 51){
                Integer nodi = pokerList.get(i);
                noDiPai.add(nodi);
            }else if (i % 3 == 0){
                Integer no = pokerList.get(i);
                noP1.add(no);
            }else if (i % 3 == 1){
                Integer no = pokerList.get(i);
                noP2.add(no);
            }else{
                Integer no = pokerList.get(i);
                noP3.add(no);
            }
        }
//        System.out.println(noDiPai);
//////        System.out.println(noP1);
//////        System.out.println(noP2);
//////        System.out.println(noP3);

        // 发牌
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
