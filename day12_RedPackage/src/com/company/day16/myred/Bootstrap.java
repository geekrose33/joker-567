package com.company.day16.myred;

/**
 * @author Joker_Dong
 * @date 2020-7-31 18:25
 */

public class Bootstrap {
    public static void main(String[] args) {
        MyRedTitle redTitle = new MyRedTitle("手气红包");
        redTitle.setOwnerName("金主爸爸");

//    NormalMode normalMode = new NormalMode();
//        redTitle.setOpenWay(normalMode);

        RandomMode randomMode = new RandomMode();
        redTitle.setOpenWay(randomMode);
    }
}
