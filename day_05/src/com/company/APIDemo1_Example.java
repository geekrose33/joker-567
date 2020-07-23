package com.company;

import java.util.Scanner;

/**
 * @author Joker_Dong
 * @date 2020-5-13 12:30
 */

public class APIDemo1_Example {
/*
    public static void main(String[] args) {
        System.out.println("请输入两个数据");
        Scanner s1 = new Scanner(System.in);
        int i = s1.nextInt();
        Scanner s2 = new Scanner(System.in);
        int j = s2.nextInt();
        System.out.println("两个数据的和为"+ (i + j));

        System.out.println("请输入三个数据");
        Scanner s3 = new Scanner(System.in);
        int a = s3.nextInt();
//        Scanner s4 = new Scanner(System.in);
        int b = s3.nextInt();
//        Scanner s5 = new Scanner(System.in);
        int c = s3.nextInt();

        if (a>b && a>c){
            System.out.println("最大值为" + a);
        }else if (b>a && b>c){
            System.out.println("最大值为" + b);
        }else{
            System.out.println("最大值为" + c);
        }

        // 三目运算符
        int temp = (a > b ? a : b);
        int max = (temp > c? temp : c);
        System.out.println("max" + max);

    }
*/

    // 匿名对象，（没有名字的对象）指创建对象灭有返回值
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数");
        int i = new Scanner(System.in).nextInt();
        // 匿名对象 链式连接
        System.out.println(new Scanner(System.in).nextInt());


    }

}
