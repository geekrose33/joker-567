package com.company;

import java.util.Objects;

/**
 * @author Joker_Dong
 * @date 2020-6-14 14:18
 */

public class Person {
    private String name;
    private int age;
    private boolean live = true;

    // 创建内部类
    class Heart {
        public void jump() {
            // 直接访问外部成员
            if (live) {
                System.out.println("心脏还在跳");
            } else {
                System.out.println("挂了-，-");
            }
        }
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", live=" + live +
                '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }












  /*  @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Person person = (Person) object;
        return age == person.age &&
                live == person.live &&
                name.equals(person.name);
    }*/

}
