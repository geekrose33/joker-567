package com.company;

public interface Zi1 extends Fu1, Fu2 {

    @Override
    default void sameName() {
        System.out.println("Zi1---");
    }
    // 父接口同名只需要重写一次
    // 子接口重写默认方法需要保留default关键字

}
