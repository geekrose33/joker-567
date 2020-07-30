package com.company.day15.lambda表达式;

/**
 * @author Joker_Dong
 * @date 2020-7-30 14:37
 */

public class Demo02 {
public static void main(String[] args) {
        // 格式: (参数类型 参数名称)-> {代码语句}
        invoke(()->{
        System.out.println("lambda的饭好了");
        });
}
public static void invoke(Cook cook){
        cook.makeFood();
}
}
