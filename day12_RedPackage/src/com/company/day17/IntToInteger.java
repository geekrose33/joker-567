package com.company.day17;

import java.util.ArrayList;

/**
 * @author Joker_Dong
 * @date 2020-8-1 8:28
 */

public class IntToInteger {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,6};
        System.out.println(toInteger(arr));
    }
    public static ArrayList<Integer> toInteger(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int a:arr
             ) {
            list.add(a);
        }
        return list;


    }

}
