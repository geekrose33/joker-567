package com.company.exam.staticTest;

import java.util.ArrayList;

/**
 * @author Joker_Dong
 * @date 2020-8-11 8:05
 */

public class NarcissisticNum {
    public static void main(String[] args) {
        NarcissisticNumber(100,999);
    }
    public static void NarcissisticNumber(Integer startNum,Integer endNum){
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = startNum; i <= endNum ; i++) {
            numList.add(i);
        }
        ArrayList<Integer> narciNum = new ArrayList<>();
        for (Integer num:numList
             ) {
            // 判断
            int individualNum = num%10;
            int tenNum = (num%100 - individualNum)/10;
            int hundred = (num - individualNum - tenNum * 10)/100;
            // Math.paw(n,m) Java.lang中Math包装类里的paw方法
            // 求n的m次方
            if (num == Math.pow(individualNum,3) + Math.pow(tenNum,3) + Math.pow(hundred,3)){
                narciNum.add(num);
            }else{
                continue;
            }
        }
        System.out.println(narciNum);

    }
}
