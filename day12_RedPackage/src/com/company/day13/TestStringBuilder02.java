package com.company.day13;

/**
 * @author Joker_Dong
 * @date 2020-7-28 11:26
 */

public class TestStringBuilder02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello").append(" world").append(" java");
        String str = sb.toString();
        System.out.println(str);
    }
}
