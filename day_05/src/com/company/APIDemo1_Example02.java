package com.company;

import java.util.Scanner;

/**
 * @author Joker_Dong
 * @date 2020-5-13 16:49
 */

public class APIDemo1_Example02 {
    public static void main(String[] args) {
        // 匿名对象可以作为方法的参数和返回值
        // 1.作为参数
        /*Scanner s = new Scanner(System.in);
            // 匿名对象作为方法的接收参数
        imput(s);
        */
        imput(new Scanner(System.in));
    }
    public static void imput(Scanner scanner){
        System.out.println(scanner);
    }
}
