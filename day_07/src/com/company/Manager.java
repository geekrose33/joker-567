package com.company;

import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.util.ArrayList;

/**
 * @author Joker_Dong
 * @date 2020-6-5 19:15
 */

public class Manager extends User{
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }
    // 定义发红包方法
    public ArrayList<Integer> send(int totalMoney, int count){
        ArrayList<Integer> redList = new ArrayList<>();

        // 1.看群主余额有多少钱 余额不足要通知
        int leftmoney = super.getMoney();
        if (leftmoney < totalMoney){
            System.out.println("余额不足");
            return redList;
        }
        // 2.从群主余额扣钱
        super.setMoney(leftmoney - totalMoney);

        // 3.发红包分成count份
        int avg = totalMoney/count;
        int mod = totalMoney & count; //余数 也就是零头部分

        // 如果除不开 将零头放到最后一个红包里


        // 4.将余额一个一个放到集合中
        // 前：放count-1
        for(int i = 0; i < count-1; i++){
            redList.add(avg);
        }

        // 放count个
        int last = avg + mod;
        redList.add(last);
        return redList;


    }


}
