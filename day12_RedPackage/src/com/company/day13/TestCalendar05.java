package com.company.day13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Joker_Dong
 * @date 2020-7-28 9:25
 */

public class TestCalendar05 {
    public static void main(String[] args) throws ParseException {
        // calendar.getActualMaxinum();
        // 编写一个方法 根据 YYYY-MM获取当月的最后一天
//        getDayNum();
        int lastDay = lastDay(2020, 6);
        System.out.println(lastDay);


    }
    public static void getDayNum() throws ParseException {
        System.out.println("请输入2020-06格式的日期");
        // 输入字符串
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM");
        String s = new Scanner(System.in).next();
        // 转化为日期
        Date date = simpleDateFormat.parse(s);
        System.out.println(date);
        // 识别月份
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int dayMax = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("当月最大日期为" + dayMax + "日");
    }

    public static int lastDay(int year,int month){
        Calendar calendar = Calendar.getInstance();
        calendar.clear();  // 清除所有日期数据
//        if (year != 0){
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,month - 1);
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        return lastDay;

    }

}
