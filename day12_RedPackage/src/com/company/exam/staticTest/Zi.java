package com.company.exam.staticTest;

/**
 * @author Joker_Dong
 * @date 2020-8-9 16:58
 */

public class Zi extends Fu {
    static int staticNum;
    public String str;
    static {
        // 由于静态变量先于静态代码块执行，所以静态变量已经进行了初始化 可以通过静态代码块进行赋值
        staticNum = 10;
        System.out.println("子类静态代码块被调用");
    }
    public static void staticZiMethod(){
        System.out.println("子类静态方法被执行");
    }
    {
        str = "子类非静态代码块被执行";
        System.out.println(str);
    }
    public void ZiMehod(){
        str = "子类非静态方法把非静态代码块给非静态变量赋的值给修改了";
    }
    public Zi(String str){
        super(str);
        System.out.println("子类无参构造被执行");
    }


}
