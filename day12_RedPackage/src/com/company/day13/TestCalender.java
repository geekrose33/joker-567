package com.company.day13;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Joker_Dong
 * @date 2020-7-28 8:41
 */

public class TestCalender {
    public static void main(String[] args) {
        // 创建calendar对象
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        // 设置年
        int year = calendar.get(Calendar.YEAR);    // 常量每个字母都要大写
        System.out.println(year + "年");
        // 设置月
        int month = calendar.get(Calendar.MONTH) + 1;    // 常量每个字母都要大写
        System.out.println(month + "月");      // 月份从0开始计算
        // 设置日
        int day = calendar.get(Calendar.DAY_OF_MONTH);   // 日从1开始
        System.out.println(day + "日");

    }
}
