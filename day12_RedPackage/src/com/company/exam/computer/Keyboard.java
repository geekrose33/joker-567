package com.company.exam.computer;

/**
 * @author Joker_Dong
 * @date 2020-8-10 20:10
 */

public class Keyboard implements USB{
    @Override
    public void useUsb() {
        System.out.println("开始使用键盘");
    }

    @Override
    public void dropUsb() {
        System.out.println("关闭键盘");
    }
}
