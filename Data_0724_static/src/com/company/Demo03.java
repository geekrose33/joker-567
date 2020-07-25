package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * @author Joker_Dong
 * @date 2020-7-24 10:07
 */

public class Demo03 {
    public static void main(String[] args) {
//        Arrays.toString()
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = new Random().nextInt(199);

        }
        System.out.println("排序前： " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后： " + Arrays.toString(arr));

    }
}
