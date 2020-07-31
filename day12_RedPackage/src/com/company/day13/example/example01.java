package com.company.day13.example;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Joker_Dong
 * @date 2020-7-28 13:53
 */

public class example01 {
    public static void main(String[] args) throws ParseException {
        System.out.println(birday());

    }
    public static long birday() throws ParseException {
        System.out.println("请输入2020-01-01格式的生日日期");
        String s = new Scanner(System.in).next();
        // 输入的字符串转换为日期
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");
        Date date = simpleDateFormat.parse(s);
        // 求出距离生日日期的毫秒数
        long starttime = date.getTime();
        Calendar instance = Calendar.getInstance();
        instance.clear();
        instance.setTime(date);

        long timeInMillis = instance.getTimeInMillis();
        System.out.println(timeInMillis);

        System.out.println(starttime);
        return (starttime - timeInMillis)/(3600*1000*24);


    }
}
