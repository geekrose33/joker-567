package com.company;

public interface Liveable1 {
    // 定义默认方法
    // 可以重写也可以继承 但是只能通过实现类来调用

    // 继承默认方法
    public default void fly(){
        System.out.println("天上飞");
    }


}
