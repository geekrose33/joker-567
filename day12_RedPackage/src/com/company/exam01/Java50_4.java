package com.company.exam01;

import java.util.ArrayList;

/**
 * @author Joker_Dong
 * @date 2020-8-14 8:15
 */

public class Java50_4 {
    public static void main(String[] args) {
        primeNum(20);
    }
    public static void primeNum(int num){
        ArrayList<Integer> primeList = new ArrayList<>();
        primeList.add(num);
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                System.out.println("公因数： " + i);
                num = num/i;
                primeList.add(i);
                continue;
            }else{
                System.out.println(i + "不是公因数");
            }
        }
        for (int i = 0; i < primeList.size(); i++) {
            System.out.print(primeList.get(i) + "\t");
        }

    }
}
