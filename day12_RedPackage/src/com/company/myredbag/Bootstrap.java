package com.company.myredbag;

/**
 * @author Joker_Dong
 * @date 2020-7-27 11:12
 */

public class Bootstrap {
    public static void main(String[] args) {
        // 测试需要主方法
        MyRedBag myRedBag = new MyRedBag("今天的运气红包");
        myRedBag.setOwnerName("Joker");

//        NormalMode normalMode = new NormalMode();
        RandomMode randomMode = new RandomMode();
//        myRedBag.setOpenWay(normalMode);
        myRedBag.setOpenMode(randomMode);


    }
}
