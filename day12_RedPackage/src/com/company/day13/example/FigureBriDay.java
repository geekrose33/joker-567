package com.company.day13.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Joker_Dong
 * @date 2020-7-31 8:08
 */

public class FigureBriDay {
    public static void main(String[] args) throws ParseException {
        showBirDay();
    }
    public static void showBirDay() throws ParseException {
        System.out.println("请输入出生日期 格式如1990-00-00");
        String str = new Scanner(System.in).next();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");
        Date date = simpleDateFormat.parse(str);
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.setTime(date);

        System.out.println(calendar.getTime());
        long timeMillis = System.currentTimeMillis();
        long timeInMillis = calendar.getTimeInMillis();

        System.out.println("天数为： " + (timeMillis - timeInMillis)/(3600*1000*24));

    }
}
