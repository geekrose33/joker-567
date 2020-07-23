package com.company;

import java.util.Scanner;

/**
 * @author Joker_Dong
 * @date 2020-5-13 16:56
 */

public class APIDemo1_Example03 {
    public static void main(String[] args) {
        // 匿名对象作为返回值
        System.out.println(getScanner());
    }

    public static Scanner getScanner() {
        // 普通方式Scanner的返回值
/*
        Scanner scanner = new Scanner(System.in);
        return scanner;
        */
        // 匿名对象作为方法的返回值

        return (new Scanner(System.in));

    }
}
