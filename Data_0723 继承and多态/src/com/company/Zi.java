package com.company;

import org.w3c.dom.ls.LSOutput;

/**
 * @author Joker_Dong
 * @date 2020-7-23 9:07
 */

public class Zi extends Fu {
    int age = 10;

    public Zi(){
        super();
        System.out.println("子类被调用");
        }
    public void work(){
        System.out.println("子类的work方法: 使劲工作");
    }

}
