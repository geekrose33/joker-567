package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Joker_Dong
 * @date 2020-5-16 14:20
 */

public class RandomExam {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(101);

        System.out.println("请输入您要猜测的数字 (100以内)");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (true){
            if (num < i){
                System.out.println("输入的数字小了，请重新输入");
                num = scanner.nextInt();
                continue;
            }else if (num > i){
                System.out.println("输入的数字大了，请重新输入");
                num = scanner.nextInt();
                continue;
            }else {
                System.out.println("猜对了！");
                break;
            }
        }
    }
}
