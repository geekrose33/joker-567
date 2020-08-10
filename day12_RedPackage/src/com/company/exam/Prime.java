package com.company.exam;

import java.util.ArrayList;

/**
 * @author Joker_Dong
 * @date 2020-8-11 7:45
 */

public class Prime {
    public static void main(String[] args) {
        primeNum(100,200);
    }
    public static void primeNum(Integer startNum,Integer endNm){

        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = startNum; i <= endNm; i++) {
            numList.add(i);
        }
        ArrayList<Integer> primeNum = new ArrayList<>();
        for (Integer num:numList
             ) {
            // 判断
            for (int i = 2; i <= Math.sqrt(num) ; i++) {
                if (num%i == 0){

                    break;
                }else{
                    primeNum.add(num);
                    break;
                }
            }

        }
        System.out.println(primeNum);


    }

}
