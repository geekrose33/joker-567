package com.company;

public class Main {

    public static void main(String[] args) {

        Zi zi = new Zi();
        System.out.println(zi.age);

        // Zi类的name属性是继承自Fu类
        zi.name = "子类的名字";
        System.out.println(zi.name);
        zi.work();

        Fu fu = new Fu();
        fu.work();
    }
}
