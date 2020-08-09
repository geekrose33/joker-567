package com.company.exam;

/**
 * @author Joker_Dong
 * @date 2020-8-9 16:43
 */

public class AsiaPerson extends Person{

    public AsiaPerson(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {
        AsiaPerson person1 = new AsiaPerson("宫崎骏", 50);
        System.out.println(Person.class);
        System.out.println(person1.getClass());
    }
}
