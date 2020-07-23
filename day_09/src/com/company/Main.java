package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
/*
    格式：
        class B{
            class A{

            }
        }

    访问特点：
    1. 内部类可以直接访问外部成员，包括私有成员
    2. 外部类要访问内部类的成员，必须要建立内部类的对象
    3. 格式：
        外部类名.内部类名 对象名 = new 外部类型（）. new 内部类型（）；


*/
        Person person1 = new Person("皮皮虾", 14);
        Person person2 = new Person("皮皮虾", 15);
        System.out.println(person1.equals(person2));

    }


}
