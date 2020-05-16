package com.company;

/**
 * @author Joker_Dong
 * @date 2020-5-15 20:48
 */

public class Example {
    private int price;
    private String logo;

    public Example(){
        System.out.println("无参方法被调用");
    }
    public Example(int price,String logo){
        System.out.println("有参方法被调用");
        this.logo = logo;
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getLogo(){
        return logo;
    }
    public void setLogo(String logo){
        this.logo = logo;
    }
}
