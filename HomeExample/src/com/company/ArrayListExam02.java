package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Joker_Dong
 * @date 2020-5-16 14:57
 */

public class ArrayListExam02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {

            int j = random.nextInt(100);
            list.add(j);
            System.out.print(list.get(i) + " ");
        }
        System.out.println("-----------------------------");
        System.out.print(getOdd(list) + " ");


    }

    public static ArrayList<Integer> getOdd(ArrayList<Integer> list) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                arrayList.add(list.get(i));
            } else {
                continue;
            }
        }


        return arrayList;
    }
}
