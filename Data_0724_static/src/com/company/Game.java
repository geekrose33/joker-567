package com.company;

import java.util.ArrayList;

/**
 * @author Joker_Dong
 * @date 2020-7-24 9:58
 */

public class Game {
    public static int number;
    public static ArrayList<String> list;

    // 作用 给类变量进行初始化值
    static{
        number = 2;
        list = new ArrayList<String>();
        list.add("I");
        list.add("L");
        list.add("Y");
    }
}
