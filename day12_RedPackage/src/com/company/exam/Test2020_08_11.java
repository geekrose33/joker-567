package com.company.exam;

/**
 * @author Joker_Dong
 * @date 2020-8-11 18:49
 */

public class Test2020_08_11 {
    public static void main(String[] args) {
        down(100.00,1);
    }
    // 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；
    // 再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
    public static void down(Double heigh,Integer num){
        Double length = 0.0;
        for (int i = 0; i < num; i++) {
            heigh = heigh/2;
            length = length + heigh*3;
        }
        System.out.println("一共经历了" + length + "米");
        System.out.println("第" + num + "次，高度为： " + heigh);
    }
}
