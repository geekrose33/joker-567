package com.company;

public class TypeDemo04 {
    public static void main(String[] args) {


        // 数据类型转换
        // 如果数据类型不一致，需要数据类型转换
        // 1.自动类型转换   也叫隐式转换
        // 是指小类型自动提升为大类型
        // 将取值范围小的类型自动提升为取直范围大的类型
        // 2.强制类型转换   也叫显示转换
        int a = 10;
        int b = 20;
        //通过输出语句输出变量a和b的和
        System.out.println(a + b);
        int c = a + b;
        System.out.println(c);
        System.out.println("*******************************");

        int aa = 30;
        byte bb = 40;
        //定义cc接受aa bb的和
        int cc = aa + bb;
        System.out.println(cc);


        // 定义两个int类型的变量a和b, 分别赋 值为10, 20.
        //通过输出语句打印变量a和b的和.
        //定义int类型的变量c, 接收变量a和b的和.
        //打印变量c的值.
        //定义两个变量aa和bb, 一个是int类型的数据, 另一个是byte类型的数据.
        //定义变量cc接收 变量aa和bb的和.
        //分别设置变量cc的数据类型为byte类型和int类型, 观察结果并打印.

        // 强制类型转换 显示转换  大类型转换为小类型：
        double d = 30.5;
        int dd = (int) d;
        System.out.println(dd);
        // 数据类型 变量名 = （强制转换类型）被转换的数值；


    }
}
