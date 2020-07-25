package com.company;

/**
 * @author Joker_Dong
 * @date 2020-7-24 8:26
 */

public class Example_0724 {
    public static void main(String args[]){
        Vehicle vehicle = new Car();
        vehicle.print();
    }
}

interface Vehicle {
    default void print(){
        System.out.println("我是一辆车!");
    }
    // 默认方法：接口可以有实现方法 而不需要类去实现
    // 为了解决接口的修改和现有的实现不兼容的问题

    static void blowHorn(){
        System.out.println("按喇叭!!!");
    }
    // 静态方法
}

interface FourWheeler {
    default void print(){
        System.out.println("我是一辆四轮车!");
    }
}

class Car implements Vehicle, FourWheeler {
    public void print(){
        Vehicle.super.print();

        FourWheeler.super.print();
        Vehicle.blowHorn();
        System.out.println("我是一辆汽车!");
    }
}