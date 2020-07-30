package com.company.day15.lambda表达式;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/**
 * @author Joker_Dong
 * @date 2020-7-30 15:02
 */

public class Demo04 {
    public static void main(String[] args) {
        // 给年龄排序
        Person[] array = {
                new Person("貂蝉",23),
                new Person("妲己",26),
                new Person("西施",25),
                new Person("杨玉环",29),
        };
        Comparator<Person> comp = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        };
        // 第二个参数是排序规则
        Arrays.sort(array,comp);
        System.out.println(Arrays.toString(array));
        for (Person person:array
             ) {
            System.out.println(person);
        }
    }

}
