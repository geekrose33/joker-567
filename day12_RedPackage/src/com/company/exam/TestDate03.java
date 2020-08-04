package com.company.exam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Joker_Dong
 * @date 2020-7-27 16:21
 */

public class TestDate03 {
    public static void main(String[] args) throws ParseException {
        String str = "2017年9月1日";
        SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = df.parse(str);
        System.out.println(date);


    }
}
