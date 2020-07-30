package com.company.exam;

/**
 * @author Joker_Dong
 * @date 2020-7-30 19:37
 */

public class TestMyGeneric {
    public static void main(String[] args) {
        // 创建一个String类型的类
        MyGeneric<String> mine1 = new MyGeneric<>();
        // 不写默认为Object
        mine1.setMusic("Say Something");
        System.out.println(mine1.getClass());
        System.out.println(mine1.getMusic());

        mine1.showClass("音乐");
        System.out.println(mine1.showClass2("音乐"));
        // return的值要接收,或者靠println输出
    }
}
