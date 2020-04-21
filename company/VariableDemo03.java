package com.company;

public class VariableDemo03 {
    public static void main(String[] args) {

        byte a = 5;
        System.out.println(a);
        //变量未声明不能使用

        {
            //大括号包裹起来的代码叫代码块
            //让变量尽早的可以从内从消失，节约资源 提高效率
            //Java等高级编程语言  叫GC 垃圾回收
            double b = 21.12;
            System.out.println(b);

        }

//        System.out.println(b);    该行不能使用
        //变量可以一行声明多个

        int z = 10,x = 11,c = 12;
        System.out.println(z);
        //python中声明变量
        //a,b,c = 10,20,30


    }


}
