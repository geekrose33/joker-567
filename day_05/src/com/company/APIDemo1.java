package com.company;

import java.util.Scanner;

/**
 * @author Joker_Dong
 * @date 2020-5-13 12:06
 * API application programming interface 应用程序接口
 */

public class APIDemo1 {
    public static void main(String[] args) {

        // 1.Scanner 类

        Scanner scanner = new Scanner(System.in);
        // System.in是指通过键盘录入数据
        // 除了java.lang下的类 不需要导入，其他的必须导入才能使用
        // 导包的格式： import.包名.类名;
        // 调用方法 变量名.方法名（）;
        int i = scanner.nextInt();
        System.out.println(i);

        // 2.Random 类
        // 3.ArrayList 类


    }
}
