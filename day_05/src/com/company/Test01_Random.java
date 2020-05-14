package com.company;

import java.util.Random;

/**
 * @author Joker_Dong
 * @date 2020-5-13 17:05
 */

public class Test01_Random {
    public static void main(String[] args) {
        // Random 类勇于生成伪随机数
        Random random = new Random();
        // [0,n) 的随机整数
        for (int i = 0; i < 10; i++) {
            int j = random.nextInt(2);
            System.out.println("第" + i + "次是： " + j);
        }
    }
}
