package com.company.day15.lambda表达式;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Joker_Dong
 * @date 2020-7-30 15:31
 */

public class Demo05 {
    public static void main(String[] args) {

        Person[] array = {
                new Person("项羽333", 33),
                new Person("项羽88888888", 38),
                new Person("项羽7777777", 37),
                new Person("项羽5555", 35)
        };
//        new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getName().length() - o2.getName().length();
//            }
//
//            @Override
//            public boolean equals(Object obj) {
//                return false;
//            }
//        };
        Arrays.sort(array,new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().length() - o2.getName().length();
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        });
        System.out.println(Arrays.toString(array));


    }

}
