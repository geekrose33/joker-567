package com.company;

import java.awt.font.GlyphMetrics;
import java.util.ArrayList;

/**
 * @author Joker_Dong
 * @date 2020-5-17 19:17
 * 静态代码块
 * 作用：常用于给类变量进行初始化赋值
 */

public class Game {
    public static int number;
    public static ArrayList<String> List;

    /*
        private int num;
    */
    // 静态代码块
    static {
        number = 3;
      /*  List.add("张三");
        List.add("李四");
        List.add("王五");*/
        System.out.println("这是静态代码块");
    }

    // 类中方法外 随着类的加载而执行一次，优先于main方法和构造方法 执行
    public Game() {
        System.out.println("无参构造方法被执行");
    }

   /* public Game(int num){
        System.out.println("有参方法被调用");
        this.num = num;
    }*/
}
