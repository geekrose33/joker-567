package com.company.day13;

/**
 * @author Joker_Dong
 * @date 2020-7-28 10:11
 */

public class TestSystem01 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时" + (end - start));
    }
}
