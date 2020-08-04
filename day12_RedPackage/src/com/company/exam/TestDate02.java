package com.company.exam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * @author Joker_Dong
 * @date 2020-7-27 15:57
 */

public class TestDate02 {
    public static void main(String[] args) {
        // Date -----> String
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(simpleDateFormat);
        Date date = new Date();
        System.out.println(date);

        String str = simpleDateFormat.format(date);
        System.out.println(str);

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = simpleDateFormat1.format(date);
        System.out.println(s);

        // String -----> Date
        String str1 = "2018年9月10日";


    }
}
