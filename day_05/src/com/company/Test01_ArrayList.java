package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Joker_Dong
 * @date 2020-5-14 18:00
 */

public class Test01_ArrayList {
    public static void main(String[] args) {
        // 生成10个1到33之间的随机整数 添加到集合里 并且遍历输出
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < 10; j++) {
            int i = random.nextInt(34);
            list.add(i);

        }
        System.out.println("随机生成数字个数： " + list.size());
        /*for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        */
        printArrayList(list);
    }

    // 自定义方法打印List
    public static void printArrayList(ArrayList<Integer> list){
        // 拼接左括号

        System.out.print(" { ");
        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            // 获取元素
            Integer num = list.get(i);
            if (i != list.size()-1){
                System.out.print(num + " ,");
            }else {
                System.out.print(num);

            }
        }

        // 拼接右括号
        System.out.print(" } ");

    }

}
