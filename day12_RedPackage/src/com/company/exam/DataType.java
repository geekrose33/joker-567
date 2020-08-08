package com.company.exam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Joker_Dong
 * @date 2020-8-6 7:38
 */

public class DataType {
    public static void main(String[] args) throws ParseException {
//        // float 型
//        float i = 1.3f;
////        float j = 1.3;  float 占4个字节 32位 而小数默认为double的8个字节
//        // 在定义为float类型时 需要在后边加一个f
//        System.out.println(1.3/10);
//        System.out.println(i/10);
//        System.out.println(1.3f);
//        short s =  1;
////        s = s + 1;   1默认为int类型 所以需要强制类型转换为int
//        s = (short)(s + 1); // 后边的加法默认为int 转换为short类型即可
//        System.out.println(s);
//        byte i1 = 2;
//        byte i2 = 3;
////        byte i3 = i1 + i2; // b1 b2为变量， byte类型的变量在运算时会自动转型为int
//        byte i3 = (byte)(i1 + i2);
//        byte i4 = 2 + 3; // 2和3都是常量，在编译的时候会直接把值赋给i4
//
        // 字符串 --------》 Date对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY年MM月dd日");
        String s = simpleDateFormat.format(new Date());
        System.out.println(s);
        String s1 = "1999年8月8日";   // 通过simpleDateFormat 对象格式识别 字符串中的时间 转化为时间
        // 以date 类型输出

        Date dateparse = simpleDateFormat.parse(s1);
        System.out.println(dateparse);

        Date date = new Date();
        System.out.println("新获取的date： " + date);

    }
}
