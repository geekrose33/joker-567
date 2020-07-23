package com.company;

/*
 *
 * @author Joker_Dong
 * @date 2020-4-26 15:27
 */


public class ArrayDemo04 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int t;
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println("数组长度为" + arr.length);

        for (int j = 0; j < arr.length / 2; j++) {
            t = arr[j];
            arr[j] = arr[(arr.length - 1) - j];
            arr[(arr.length - 1) - j] = t;
        }

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + "  ");
        }

        /*for (int min =0,max = arr.length-1;min <= max; min++ , max--){
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
        }
        // 重新遍历反转的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }*/
    }
}