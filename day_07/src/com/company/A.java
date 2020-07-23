package com.company;

public interface A {// 接口名

    // 抽象方法：使用abstract修饰 可以省略
    // 没有方法体 该方法供子类实现使用
    // 格式：public abstract void method()

    // 默认方法：使用default修饰，不可以省略
    // 功能是供子类调用或者子类重写
    public default void method() {
        // 执行语句
    }

    // 静态方法：使用static修饰 供接口调用
    public static void method2() {
        // 方法体 用static修饰
    }
    // 私有方法：使用private修饰 供接口中的默认方法
    // 或者静态方法调用
    // private void method(){}
}

