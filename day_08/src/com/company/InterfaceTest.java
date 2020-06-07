package com.company;


/**
 * @author Joker_Dong
 * @date 2020-6-7 14:25
 */

public class InterfaceTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
//        animal.run();
//        会报错，无法继承方法也无法调用
//        LiveAble.run();  // 通过接口调用
        System.out.println("----------------------------");
        animal.func();
        Dog dog = new Dog();
        dog.show();
        dog.method();
    }
}
