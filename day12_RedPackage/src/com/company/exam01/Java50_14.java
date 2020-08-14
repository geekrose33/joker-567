package com.company.exam01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Joker_Dong
 * @date 2020-8-12 22:23
 */

public class Java50_14 {
    public static void main(String[] args) {
        // 题目：输入某年某月某日，判断这一天是这一年的第几天？
//        Scanner scan = new Scanner(System.in).useDelimiter("\\D");//匹配非数字
//        System.out.print("请输入当前日期（年-月-日）:");
//        int year = scan.nextInt();
//        int month = scan.nextInt();
//        int date = scan.nextInt();
//        scan.close();
//        System.out.println("今天是"+year+"年的第"+analysis(year,month,date)+"天");




        dayOfDate();
    }

    //判断天数
    private static int analysis(int year, int month, int date){
        int n = 0;
        int[] month_date = new int[] {0,31,28,31,30,31,30,31,31,30,31,30};
        if((year%400)==0 || ((year%4)==0)&&((year%100)!=0))
            month_date[2] = 29;
        for(int i=0;i<month;i++)
            n += month_date[i];
        return n+date;
    }



    public static void dayOfDate(){
        try {

            System.out.println("请输入一个时间 格式为1999-09-09");
            String starttime = new Scanner(System.in).nextLine();

            Calendar instance = Calendar.getInstance();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

            Date date1 = simpleDateFormat.parse(starttime);
            instance.setTime(date1);

            int dayofyear = instance.get(Calendar.DAY_OF_YEAR);
            System.out.println(dayofyear);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
