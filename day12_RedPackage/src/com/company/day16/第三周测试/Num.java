package com.company.day16.第三周测试;

/**
 * @author Joker_Dong
 * @date 2020-7-31 17:43
 */

public class Num {
//    public static void main(String[] args){
//        int a = 2;
//        int b = 1;
//        int mid = 0;
//        int count = 0;
//        for (int i = 0;i < 20; i++){
//            count = count + a/b;
//            mid = b;
//            b = a;
//            a = a + mid;
//        }
//        System.out.println("前20项和为： " + count);
//
//    }
    public static void main(String[] args) {
        int x = 2, y = 1, t;
        double sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += (double) x / y;
            t = y;
            y= x;
            x= y+t;
            System.out.println("第"+i+"次相加，和是"+sum) ;

        }
    }
}