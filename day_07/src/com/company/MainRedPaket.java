package com.company;

import java.util.Scanner;

/**
 * @author Joker_Dong
 * @date 2020-6-5 19:30
 */

public class MainRedPaket {
    public static void main(String[] args) {
        System.out.println("--------------------");
        System.out.println("先显示当前所有人的余额");
        // 一个群主 三个成员
        Manager manager = new Manager("Leader", 100);
        Member a = new Member("A", 0);
        Member b = new Member("B", 0);
        Member c = new Member("C", 0);

        manager.show();
        a.show();
        b.show();
        c.show();
        System.out.println("--------------------");
        System.out.println("请群主输入要发红包金额");
        int money = new Scanner(System.in).nextInt();


        //  显示所有人当前的余额


    }
}
