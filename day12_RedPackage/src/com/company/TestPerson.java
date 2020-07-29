package com.company;

import com.company.Person;

/**
 * @author Joker_Dong
 * @date 2020-7-27 14:27
 */

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("张三",20);
        Person person1 = new Person("张三", 11);
        Person person2 = new Person("张三", 20);

        System.out.println(person.equals(person1));
        System.out.println(person.equals(person2));

        System.out.println(person);
        // 返回类的全限定名＋地址值

    }
}
