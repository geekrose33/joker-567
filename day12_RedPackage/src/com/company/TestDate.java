package com.company;

import java.util.Date;

/**
 * @author Joker_Dong
 * @date 2020-7-27 15:13
 */

public class TestDate {
    public static void main(String[] args) {
        // 创建日期对象，返回当前的时间
        System.out.println(new Date());
        // Mon Jul 27 15:18:54 CST 2020

        // 创建日期对象 把当前的毫秒值转化成日期对象
        System.out.println(new Date(0L));

        // 把当前日期对象换算成对应的时间毫秒值
        System.out.println(new Date().getTime());

        int i = 0;
        while (true){
            if (i == 1000000000){
                break;
            }
            i++;
        }

        System.out.println(new Date().getTime());

    }
}
