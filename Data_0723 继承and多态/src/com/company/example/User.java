package com.company.example;

/**
 * @author Joker_Dong
 * @date 2020-7-23 10:07
 */

public class User {
    private float money;
    private String userName;


    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User(float money, String userName) {
        this.money = money;
        this.userName = userName;
    }

    public void show(){
        System.out.println("用户" + userName +"\t" + "余额为" + money);
    }
}
