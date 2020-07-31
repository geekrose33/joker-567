package com.company.day16.第三周测试;

import java.util.ArrayList;

/**
 * @author Joker_Dong
 * @date 2020-7-31 19:17
 */

public class Java50_1 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("第" + n + "个月会有兔子数：" + RabbitNum(n));
    }
    public static int RabbitNum(int monthNum){
        // 迭代：调用自己
        return monthNum == 1 || monthNum == 2? 1 : RabbitNum(monthNum - 1) + RabbitNum(monthNum - 2);


    }
}
