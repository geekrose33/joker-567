package com.company.day15.myGeneric;

/**
 * @author Joker_Dong
 * @date 2020-7-30 9:08
 */

public class TestGenericDemo {
    public static void main(String[] args) {
        // 创建一个泛型为String的类
        MyGenericClass<String> mine = new MyGenericClass<>();
//        不写默认为Object类
//        MyGenericClass mine1 = new MyGenericClass<>();
        mine.setMvp("哈登");
        // 传入什么类型就是什么类型
        String mvp = mine.getMvp();
        System.out.println(mvp);

        MyGenericClass<Integer> mine2 = new MyGenericClass<>();
        mine2.setMvp(13);
        Integer mine2Mvp = mine2.getMvp();
        System.out.println(mine2Mvp);
    }
}
