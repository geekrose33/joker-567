package com.company.example03;

import java.util.Scanner;

/**
 * @author Joker_Dong
 * @date 2020-7-24 8:55
 */

public class Demo02 {
    public static void main(String[] args) {
        // 键盘录入一个字符串数据 统计出大写字母 小写字母 数字的个数
        System.out.println("请输入数据");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine(); // 返回一行
        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // 对每个字符进行判断
            if (ch >= 'A' && ch <= 'Z'){
                bigCount++;
            }else if (ch >= 'a' && ch <= 'z'){
                smallCount++;
            }else if (ch >= '0' && ch <= '9'){
                numCount++;
            }else{
                System.out.println("非法字符");
            }
        }

        System.out.println("大写字符： " + bigCount);
        System.out.println("小写字符： " + smallCount);
        System.out.println("数字字符： " + numCount);

    }
}
