package com.company.example01;

/**
 * @author Joker_Dong
 * @date 2020-7-23 14:14
 */

public class C extends B {
    private int numc = 30;
    @Override
    public void showA(){
        System.out.println("A类中numa： " + super.getNuma());
    }
    @Override
    public void showB(){
        System.out.println("B类中numb： " + super.numb);
    }
    public void showC(){
        System.out.println("C类中numc:： " + numc);
    }

}
