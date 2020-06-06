package com.company;

/**
 * @author Joker_Dong
 * @date 2020-6-6 22:24
 */

public class InterfaceDemoTest {
    public static void main(String[] args) {
        AnimalLiveable animalLiveable = new AnimalLiveable();
        animalLiveable.eat();
        // 类实现了接口 并 实现了所有抽象方法
        animalLiveable.sleep();

    }
}
