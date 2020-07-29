package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Joker_Dong
 * @date 2020-7-27 19:39
 */

public class TestDate07 {
    public static void main(String[] args) {
        toFormat();
    }
    public static void toFormat(){
        // 获取当前时间
        Date date = new Date();

        // 转化为字符串
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");

        // 转换格式
        String s = simpleDateFormat.format(date);
        // 输出
        System.out.println(s);

    }
}
