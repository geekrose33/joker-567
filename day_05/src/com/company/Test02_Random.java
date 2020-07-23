package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Joker_Dong
 * @date 2020-5-14 15:56
 */

public class Test02_Random {
    // 游戏开始生成一个1到100之间的随机整数 number 玩家猜测一个数字guess number
    // 系统提示猜大了还是小了
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(101);
        System.out.println("请输入您要猜测的数字（1~100）");
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        for (int k = 0; ; k++) {

            if (i < j) {
                System.out.println("您猜大了 请重新输入");
                j = scanner.nextInt();
                continue;
            } else if (i > j) {
                System.out.println("您猜小了 请重新输入");
                j = scanner.nextInt();
                continue;
            } else {
                System.out.println("猜对了");
                break;
            }
        }
    }
}
