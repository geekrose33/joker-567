package com.company;
import java.util.Scanner;
/**
 * @author Joker_Dong
 * @date 2020-5-13 12:30
 */

public class APIDemo1_Example {
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



    }
}
