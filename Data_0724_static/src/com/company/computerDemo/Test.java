package com.company.computerDemo;

/**
 * @author Joker_Dong
 * @date 2020-7-24 16:40
 */

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.run();
        // 多态 父类类型引用子类对象
        USB mouse = new Mouse();
        // 电脑使用鼠标
        computer.useUSB(mouse);


        Keyboard keyboard = new Keyboard();
        computer.useUSB(keyboard);

        computer.shutDown();

    }
}
