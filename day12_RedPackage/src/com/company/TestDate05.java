package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Joker_Dong
 * @date 2020-7-27 17:03
 */

public class TestDate05 {
    public static void main(String[] args) throws ParseException {
        toFormat();
    }
    public static void toFormat() throws ParseException {
        // 输入格式为 2018-03-04 字符串
        System.out.println("请输入格式为2018-03-04的字符串");
        String time = new Scanner(System.in).next();


        // 转化格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");
        // parse(String -----> date)
        Date date = simpleDateFormat.parse(time);
        // 再转化（date ------> String）

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("YYYY年MM月dd日");
        String s = simpleDateFormat1.format(date);
        System.out.println(s);

        // 输出
//        String s = simpleDateFormat.format(date);
//        System.out.println(s);

    }
}
