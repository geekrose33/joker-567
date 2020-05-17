package com.company;

import java.util.Scanner;

/**
 * @author Joker_Dong
 * @date 2020-5-17 17:09
 */

public class StringDemo07 {
    // 键盘录入一个字符串 统计字符中大小写字母及数字字符的个数
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int Big = 0;
        int Small = 0;
        int num = 0;
        byte[] bytes = str.getBytes();
        for (int i = 0; i < str.length(); i++) {
            if (bytes[i] >= 97) {
                Small += 1;

            } else if (65 <= bytes[i] && bytes[i] <= 90) {
                Big += 1;
            } else if (48 <= bytes[i] && bytes[i] <= 57) {
                num += 1;
            }
        }
        System.out.println("大写字母个数为： " + Big);
        System.out.println("小写字母个数为： " + Small);
        System.out.println("数字个数为： " + num);

    }


}
