package com.company.exam;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Joker_Dong
 * @date 2020-8-8 18:37
 */

public class CalendarType_01 {
    public static void main(String[] args) {
        // Calendar 日历类
        Calendar instance = Calendar.getInstance();
//        instance.get(Calendar.MONTH);

        // 月份month 从0开始计算 通常为 +1使用
//        int i = instance.get(Calendar.MONTH);
//        System.out.println(i);

//        System.out.println(instance.get(Calendar.MONTH));

        int year = instance.get(Calendar.YEAR);
        int month = instance.get(Calendar.MONTH) + 1;
        int day = instance.get(Calendar.DAY_OF_MONTH);

        // 加减法

        System.out.println(instance.get(Calendar.YEAR) + " 年 " + (instance.get(Calendar.MONTH)+1) + " 月 " + instance.get(Calendar.DAY_OF_MONTH) + " 日 " );

        instance.add(Calendar.YEAR, -3);
        instance.add(Calendar.MONTH,1);

        System.out.println(instance.get(Calendar.YEAR) + " 年 " + (instance.get(Calendar.MONTH)+1) + " 月 " + instance.get(Calendar.DAY_OF_MONTH) + " 日 " );
        // date 对象的 getTime 方法是获取毫秒值 而Calendar的方法getTime是获取date对象
        Date time = instance.getTime();
        System.out.println(time);

        long time1 = time.getTime();
        System.out.println(time1);

        // System类的 CurrentTimeMilles
        System.out.println(System.currentTimeMillis());
        Date date = new Date();
        System.out.println(date.getTime());
        System.out.println(date.getTime() == System.currentTimeMillis());


    }
}
