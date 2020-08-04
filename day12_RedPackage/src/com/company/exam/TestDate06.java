package com.company.exam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Joker_Dong
 * @date 2020-7-27 18:46
 */

public class TestDate06 {
    public static void main(String[] args) throws ParseException {
        // 输入格式为 2018-03-04 字符串
        System.out.println("请输入格式为2018-03-04的字符串");

        String time = new Scanner(System.in).next();

        // 转化格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");

        Date date = simpleDateFormat.parse(time);
        System.out.println(date);


        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("YYYY年MM月dd日");

        String s = simpleDateFormat1.format(date);

        System.out.println(s);





        // parse(String -----> date)
//        Date date = simpleDateFormat.parse(time);
        // 再转化（date ------> String）

//        System.out.println(date);
    }
}
