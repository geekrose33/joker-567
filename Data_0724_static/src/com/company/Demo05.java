package com.company;

/**
 * @author Joker_Dong
 * @date 2020-7-24 10:26
 */

public class Demo05 {
    public static void main(String[] args) {
        // 计算-10.8 到 5.9 之间 绝对值大于6 小于2.1的整数有多少个
        int count = 0;
        for (double i = -10.8; i <= 5.9; i++) {
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1){
                count++;
            }
        }
        System.out.println(count);
    }
}
