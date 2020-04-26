package com.company;

/**
 * @author Joker_Dong
 * @date 2020-4-26 14:51
 */

public class ArrayDemo02 {
    public static void main(String[] args) {

        //定义数组
        int[] arr = new int[4];
        //对数组进行赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 6;
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);

        //定义数组arr2
        int arr2[] = arr;
        //地址值赋值给arr2

        arr2[1] = 8;
        System.out.println(arr[1]);

        // 数组越界
        // 一、下标超范围
        // 二、数组中没有空间

        // 数组的空指针异常
        // 意味着arr不会保存数组的地址了，也就是不允许数组的操作了
        int []arr3 = null;
        //System.out.println(arr3[1]);//空指针异常java.lang.NullPointerException
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
}
