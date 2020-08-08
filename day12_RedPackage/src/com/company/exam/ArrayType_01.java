package com.company.exam;

/**
 * @author Joker_Dong
 * @date 2020-8-8 19:19
 */

public class ArrayType_01 {
    public static void main(String[] args) {
        // 数组Array
        int []arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        // System类的arraycopy方法
        int []arr1 = new int[3];
        System.arraycopy(arr,0,arr1,0,3);
        System.out.println(arr); // arr是数组的引用（地址值）不能输出实际的数组内的值

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        



    }
}
