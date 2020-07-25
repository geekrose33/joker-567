package com.company.sendRedBag;

/**
 * @author Joker_Dong
 * @date 2020-7-24 19:35
 */

public class User implements DealMoney {
    private String userName;
    private double balance; // balance是余额的意思
    static double redBag = 0;
    static double oneMoney;

    @Override
    public void sendMoney(double money,int count){
        if (money > balance){
            System.out.println("余额不足");
        }else{
        setBalance(getBalance() - money);
        redBag = redBag + money;
        oneMoney = money/count;
        System.out.println("用户" + userName + "发出了金额为" + money + "的红包 只有" + count +"份 快来抢");
        }
    }
    @Override
    public void receiveMoney(){
        setBalance(getBalance() + oneMoney);
        redBag = redBag - oneMoney;
        System.out.println("用户" + userName + "抢到了红包");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public User(String userName, double balance) {
        this.userName = userName;
        this.balance = balance;
    }

    public void show(){
        System.out.println("用户" + userName + "余额为： " + balance);
    }

}
