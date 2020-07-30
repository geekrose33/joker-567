package com.company.day15.lambda表达式;

import java.util.Arrays;

/**
 * @author Joker_Dong
 * @date 2020-7-30 16:32
 */

public class Demo06 {
    public static void main(String[] args) {
        Person[] array = {
                new Person("貂蝉",23),
                new Person("妲己",26),
                new Person("西施",25),
                new Person("杨玉环",29),
        };
        Arrays.sort(array,(Person a,Person b)->{ // ->为compare
        return a.getAge() - b.getAge();
    });// Comparator接口
        for (Person person:array
             ) {
            System.out.println(person);
        }


    }
}
