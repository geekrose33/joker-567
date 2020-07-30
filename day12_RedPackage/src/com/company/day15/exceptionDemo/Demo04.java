package com.company.day15.exceptionDemo;

import java.io.FileNotFoundException;

/**
 * @author Joker_Dong
 * @date 2020-7-30 14:13
 */

public class Demo04 {
    public static void main(String[] args) {
        try {
            read("xiaomiMi.txt");
        }catch (Exception e) {
            // try中抛出什么异常,在括号里就捕获什么异常
            e.printStackTrace();
            System.out.println("---------------------------");
            System.out.println(e);
            // 打印异常详细信息
        }finally {
            System.out.println("不管try和catch执行什么了,我这里都会执行");
            System.out.println("我是接盘侠");
        }
        System.out.println("end");
    }
    public static void read(String path) throws FileNotFoundException {
        if (!path.equals("xiaomimi.txt")){
            throw new FileNotFoundException("你的文件怎么消失了呢");
        }
    }
}
