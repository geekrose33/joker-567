package com.company;

/**
 * @author Joker_Dong
 * @date 2020-6-2 22:39
 */

public class Cat extends Animal{
    private String name;
    Cat(String name){
        // this(); 调用本类的构造方法
        // this 必须在构造方法的第一行
        // super 和 this 不能同时出现

        super();

        // super()；1.子类中每个构造方法均有super方法
        // 用来调用父类空参构造
        // 2.手动调用父类的构造会覆盖默认的super
        // 3.super（）必须在构造方法的第一行

        this.name = name;
        System.out.println("Cat 有参构造函数被执行");
    }
    Cat(){  // 无参构造函数
        super();
        System.out.println("Cat 无参构造函数被执行");
    }
    @Override
    public void eat() {
        System.out.println("cat eat");
    }
    public void eatTest(){
        this.eat(); // this 调用本类的方法
        super.eat(); // super 调用父类的方法
    }
}
