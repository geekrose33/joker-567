package com.company.exam01;

/**
 * @author Joker_Dong
 * @date 2020-8-12 18:17
 */

public class Demo01_0812 {
    public void show(){
        System.out.println("233333333333333");
    }
    public void byshow(){
        this.show();
    }


    public static void main(String[] args) {
//        System.out.println(4&7);
//        int  []a[]   =   new   int[10][10];
//        int  a1[][] =   new   int[][];
        int a2[][] = new int[10][];

        new Demo01_0812().byshow();
    }

}
