package com.company;

public interface LiveAble {
    // 静态方法
    public static void run(){
        System.out.println("跑起来");
    }
    public abstract void run1();

    // JDK9 有私有方法
    // 将func1和func2两个方法封装到默认方法 func中

    // func1
    private void func1(){
        System.out.println("function1跑起来----私有方法");
    }
    // func2
    private void func2(){
        System.out.println("function2跑起来----私有方法");
    }
    public default void func(){
        this.func1();
        this.func2();
    }
    // 多实现抽象方法重名
    public void show();

    // 多实现默认方法重名
    public default void method(){
        System.out.println("Livable");
    }

}
