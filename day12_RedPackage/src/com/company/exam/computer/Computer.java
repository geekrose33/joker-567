package com.company.exam.computer;

/**
 * @author Joker_Dong
 * @date 2020-8-10 20:12
 */

public class Computer implements USB{

    public void open(){
        System.out.println("嘀嘀嘀！开机了！");
        new Computer().useUsb();
    }

    public void close(){
        new Computer().dropUsb();
        System.out.println("嘀嘀嘀！关机了！");
    }

    @Override
    public void useUsb() {
        System.out.println("开启USB 功能");
    }
    public void useUsb(Keyboard keyboard){
        keyboard.useUsb();
    }
    public void useUsb(Moniter moniter){
        moniter.useUsb();
    }


    @Override
    public void dropUsb() {
        System.out.println("关闭USB 功能");
    }
    public void dropUsb(Keyboard keyboard) {
        keyboard.dropUsb();
    }
    public void dropUsb(Moniter moniter) {
        moniter.dropUsb();
    }
    public void useComputer(){
        Computer computer = new Computer();
        Keyboard keyboard = new Keyboard();
        Moniter moniter = new Moniter();

        computer.open();
        computer.useUsb(keyboard);
        computer.useUsb(moniter);
        computer.dropUsb(moniter);
        computer.dropUsb(keyboard);
        computer.close();
    }
}
