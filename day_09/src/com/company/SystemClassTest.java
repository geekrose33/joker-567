package com.company;

import java.util.Scanner;

/**
 * @author Joker_Dong
 * @date 2020-6-14 21:23
 */

public class SystemClassTest {
    public static void main(String[] args) throws InterruptedException {
        // Scanner scanner = new Scanner(System.in);

        // 获取当前系统时间与1970年 01月 01日 00点 00分
        // 之间的毫秒差
        // System.out.println(System.currentTimeMillis());

        long start = System.currentTimeMillis();
        // 中间是一个程序
        Thread.sleep(3000);
        long end = System.currentTimeMillis();
        System.out.println("共耗时" + (end - start) + "ms");

    }
}
