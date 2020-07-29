package com.company.day13;

import java.util.Calendar;

/**
 * @author Joker_Dong
 * @date 2020-7-28 9:07
 */

public class TestCalendar03 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        // 设置年
        int year = calendar.get(Calendar.YEAR);    // 常量每个字母都要大写
        System.out.println(year + "年");
        // 设置月
        int month = calendar.get(Calendar.MONTH) + 1;    // 常量每个字母都要大写
        System.out.println(month + "月");      // 月份从0开始计算
        // 设置日
        int day = calendar.get(Calendar.DAY_OF_MONTH);   // 日从1开始
        System.out.println(day + "日");

//        calendar.add(day,2);
//        System.out.println(day);
//
        calendar.add(Calendar.DAY_OF_MONTH,2);
        int dayChange = calendar.get(Calendar.DAY_OF_MONTH); // 再次赋值并输出
        System.out.println(dayChange);

//        calendar.add(Calendar.YEAR,-3);
//        System.out.println(day);

    }
}
