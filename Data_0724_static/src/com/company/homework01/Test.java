package com.company.homework01;

/**
 * @author Joker_Dong
 * @date 2020-7-24 19:14
 */

public class Test {
    public static void main(String[] args) {
        Star star = new Star();
        star.shine();

        Universe universe = new Sun();
        universe.doAnyThing();
        // 接口作为引用创建子类对象 多态的方式调用方法

        Sun sun = (Sun) universe;  // 向下转型
        sun.shine();
    }

}
