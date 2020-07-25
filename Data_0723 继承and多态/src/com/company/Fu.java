package com.company;

/**
 * @author Joker_Dong
 * @date 2020-7-23 9:06
 */

public class Fu {
    int age = 20;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fu() {
        System.out.println("父类被调用");
    }

    public void work(){
        System.out.println("父类方法被调用: 默默地工作");
    }
}
