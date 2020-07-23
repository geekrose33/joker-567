package com.company;

/**
 * @author Joker_Dong
 * @date 2020-5-16 19:52
 */

public class Shift {
    public static void main(String[] args) {
        int i = 1 << 10;
        System.out.println(i);
        int j = 1 << 5;
        System.out.println(j);
        System.out.println(getShift(5));
    }

    public static int getShift(int num) {
        int j = num << 10;
        return j;

    }
}
