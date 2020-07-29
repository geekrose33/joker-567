package com.company.day13.doudizhu;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/**
 * @author Joker_Dong
 * @date 2020-7-28 16:16
 * 斗地主 的 洗牌和发牌动作
 * 规则：使用54张牌打乱顺序 三个玩家参与 没人17张牌 最后剩三张底牌
 * - 准备牌 ：每张牌的花色和数字组成
 * - 发牌
 * - 显示牌
 * -
 */

public class Poker {
    public static void main(String[] args) {
        // 准备牌
        // 创建牌盒，存储牌
        List<String> pokerBox = new ArrayList<>();
        // 创建数字和花色 集合
        List<String>num = new ArrayList<>();
        List<String> color = new ArrayList<>();

        // 添加花色
        color.add("红桃♥");
        color.add("方片♦");
        color.add("黑桃♠");
        color.add("朝花♣");
        for (int i = 2; i <= 10; i++) {
            num.add(i + "");
        }
        num.add("J");
        num.add("Q");
        num.add("K");
        num.add("A");
        // 生产牌，拼接花色和数字
        for (String c : color
             ) {
           // 每次拿到一种花色
            for (String n : num) {
                // 每次拿到一个数字 拼接
//                String s = color + num;
//                pokerBox.add(s);
//
                pokerBox.add(c + n);
            }
        }
        pokerBox.add("大王");
        pokerBox.add("小王");
//        System.out.println(pokerBox);
        // 洗牌
        Collections.shuffle(pokerBox);
//        System.out.println(pokerBox);
        // 发牌 创建player1 player2 player3 底牌四个集合
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (int i = 0; i < pokerBox.size(); i++) {
            String card = pokerBox.get(i);
            // 判断i值，先判断
            if (i >= 51){
                dipai.add(card);
            }else{
                if (i%3 == 0){
                    player1.add(card);
                }else if (i%3 == 1){
                    player2.add(card);
                }else {
                    player3.add(card);
                }
            }
        }

        // look look
        System.out.println("王思聪的牌： " + player1);
        System.out.println("林更新的牌： " + player2);
        System.out.println("陈赫的牌： " + player3);
        System.out.println("底牌： " + dipai);

    }
}
