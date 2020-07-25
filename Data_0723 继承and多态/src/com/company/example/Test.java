package com.company.example;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Joker_Dong
 * @date 2020-7-23 10:11
 */

public class Test {
    public static void main(String[] args) {

        Manager manager = new Manager(500, "群主");
        Member member1 = new Member(100, "成员甲");
        Member member2 = new Member(100, "成员乙");
        Member member3 = new Member(100, "成员丙");
        manager.show();
        member1.show();
        member2.show();
        member3.show();
        System.out.println("请输入金额");
        Scanner scanner = new Scanner(System.in);
        int sendmoney = scanner.nextInt();
        System.out.println("请输入发几个红包");
        int count = scanner.nextInt();

        // 调用发红包
        ArrayList<Integer> redList = manager.sendRedPackage(sendmoney, count);


        // 调用收红包
        member1.getRedPackage(redList);
        member2.getRedPackage(redList);
        member3.getRedPackage(redList);

        manager.show();
        member1.show();
        member2.show();
        member3.show();
    }
}
