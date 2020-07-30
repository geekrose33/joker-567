package com.company.day15.exceptionDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Joker_Dong
 * @date 2020-7-30 11:34
 */

public class Demo3 {
    public static void main(String[] args) throws ParseException {
        String s = "1994-01-1";
        timeFormat(s);

    }
    public static void timeFormat(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM");
        Date date = sdf.parse(str);
        System.out.println(date);
    }
}
