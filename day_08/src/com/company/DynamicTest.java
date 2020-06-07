package com.company;

/**
 * @author Joker_Dong
 * @date 2020-6-7 16:36
 */

public class DynamicTest {
    public static void main(String[] args) {
        // 多态形式
//        Dog dog = new Dog();
        // 格式： 父类类型 对象名 = new 子类对象
/*        Animal dog = new Dog();
        dog.eat();
        Animal cat = new Cat();
        cat.eat();
 */
        // 多态的好处
        Dog dog = new Dog();
        Cat cat = new Cat();

        showCatEat(cat);
        showDogEat(dog);
        System.out.println("----------------------");
        showAnimalEat(cat);
        // 父类类型接收子类对象
        showAnimalEat(dog);
    }
    public static void showCatEat(Cat cat){
        cat.eat();
    }
    public static void showDogEat(Dog dog){
        dog.eat();
    }
    public static void showAnimalEat(Animal animal){
        animal.eat();
    }
}
