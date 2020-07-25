package com.company;

import java.util.ArrayList;

/**
 * @author Joker_Dong
 * @date 2020-7-24 11:11
 */

public class TestDynamic {
    public static void main(String[] args) {
        Animal cat1 = new Cat();  // 多态
        cat1.eat(); // 执行重写后的方法

        Animal dog1 = new Dog();
        dog1.eat();

        showCatEat((Cat) cat1);
        showDogEat((Dog) dog1);
        // 以上两个方法 均可以被showAnimalEat(Animal animal)方法替代
        // 执行效果一致
        showAniamlEat(cat1);
        showAniamlEat(dog1);

//        List list = new ArrayList<>()
        System.out.println("---------------------------------------------");

        Animal a = new Cat(); // 向上转型
        a.eat();
//        Cat c = (Cat) a; // 向下转型才能调用子类特有的方法
//        c.catchMouse();
//
//        Dog d = (Dog) a;
//        d.watchHouse(); //ClassCastException
//        // 为了避免转型发生异常 最好先做个判断
        // 变量名 instanceOf 数据类型

        if (a instanceof Cat){
            Cat c = (Cat) a;
            c.catchMouse();
        }else if (a instanceof Dog){
            Dog d = (Dog) a;
            d.watchHouse();
        }

    }

    public static void showCatEat(Cat cat){
        cat.eat();

    }
    public static void showDogEat(Dog dog){
        dog.eat();
    }
    public static void  showAniamlEat(Animal animal){
        animal.eat();
    }

}
