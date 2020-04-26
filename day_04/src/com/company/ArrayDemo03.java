package com.company;

/**
 * @author Joker_Dong
 * @date 2020-4-26 15:12
 * 求数组中的最大值
 */

public class ArrayDemo03 {
    public static void main(String[] args) {
        // 创建一个数组
        int[] arr = {5,15,2000,10000,100,4000};
        // 求arr中最大的那个值

        // 定义一个变量存储数组中最大的值
        int max = arr[0];
        // 假设arr中第一个元素是最大的
        // 遍历数组 取出每一个元素让每一个元素和max进行比较

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max)
                max = arr[i];   // max始终记录最大值
        }
        System.out.println("数组中最大的值是"+max);


    }
}
