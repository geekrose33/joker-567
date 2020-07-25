package com.company;

import java.util.Scanner;

/**
 * @author Joker_Dong
 * @date 2020-7-23 17:11
 */

public class StringAI {
    public static void main(String[] args) {
        // 价值一个亿的ai 机器人
        Scanner scanner = new Scanner(System.in);

        String str;
        while (true){
            str = scanner.next();  // 字符串用next
            str = str.replace("吗","");
            str = str.replace("?","！");
            System.out.println(str);
        }
    }
}
