package com.company.day15.myGeneric;

/**
 * @author Joker_Dong
 * @date 2020-7-30 9:21
 */

public class TestGenericMethod {
    public static void main(String[] args) {
        MyGenericMethod mgm = new MyGenericMethod();
        // 在调用方法时，确定泛型的类型
        mgm.show("罗斯");
        mgm.show("德里克");
        mgm.show(123);

    }
}
