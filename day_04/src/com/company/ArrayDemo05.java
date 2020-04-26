package com.company;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

/**
 * @author Joker_Dong
 * @date 2020-4-26 16:22
 */

public class ArrayDemo05 {
    public static void main(String[] args) {

    sayHello("韩梅梅");

        //之前学到的方法都是基本数据类型作为参数
        //使用数组作为方法的参数
    int arr[] = {1,3,5,7,9};
    printArray(arr);


    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }



    public static void  sayHello(String name){
        System.out.println("Hello"+ name);
    }
}
