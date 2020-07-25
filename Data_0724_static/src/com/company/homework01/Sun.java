package com.company.homework01;

/**
 * @author Joker_Dong
 * @date 2020-7-24 19:12
 */

public class Sun extends Star implements Universe{
    @Override
    public void doAnyThing(){
        System.out.println("太阳吸引着九大行星旋转");
    }

    @Override
    public void shine(){
        System.out.println("光照八分钟 到达地球");
    }

}
