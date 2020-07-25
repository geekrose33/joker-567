package com.company.computerDemo;

/**
 * @author Joker_Dong
 * @date 2020-7-24 16:26
 */

public class Keyboard implements USB {

    @Override
    public void open() {
        System.out.println("键盘灯亮了");
    }

    @Override
    public void close() {
        System.out.println("键盘灯灭了");
    }
    public void type(){
        System.out.println("键盘打字");
    }
}
