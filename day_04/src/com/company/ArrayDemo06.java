package com.company;

/**
 * @author Joker_Dong
 * @date 2020-4-26 16:44
 */

public class ArrayDemo06 {
    public static void main(String[] args) {
        // 数组作为方法的返回值
        int[] arr = getArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
// void 无返回值
    public static int[]getArray(){
        int arr[] = {1,2,3,4,5};
        return arr;
        //返回数组地址给调用者
    }
}
