package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Joker_Dong
 * @date 2020-7-27 16:29
 */

public class MyBtith {
    public static void main(String[] args) throws ParseException {
        figureDay();
    }
    public static void figureDay() throws ParseException {
        System.out.println("请输入出生日期,格式：YYYY年MM月dd日");
        String birthdayString = new Scanner(System.in).next();
        // 将生日字符串转化成Date对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY年MM月dd日");
        Date date = simpleDateFormat.parse(birthdayString);
        System.out.println(date);
        // 调用simpleDateFormat 的parse（String ------> Date）
        Date currentDate = new Date();


        // 1.获取当前时间对应的毫秒值
        long time1 = new Date().getTime();
        // 2.获取出生日期到现在的毫秒值
//        String str = "1999年3月1日";
//        long time2 = simpleDateFormat.parse(str);
        long time2 = date.getTime();


        // 3.相减
        long resultDateTime = time1 - time2;
        if (resultDateTime < 0){
            System.out.println("老铁你逗我呢 你还没出生呢");
        }else{
            long result = resultDateTime / 3600000 / 24;
            System.out.println(result + "天数");
        }
//        System.out.println((time1 - date)/3600000);

    }
}
