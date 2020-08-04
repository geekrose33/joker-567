package com.company.exam;

import java.util.Objects;

/**
 * @author Joker_Dong
 * @date 2020-7-27 14:25
 */

public class Person {
    private String name;
    private int age;


   public Person(String name, int age){
       this.name = name;
       this.age = age;
   }
//    @Override
////    public String toString(){
////        return "Person{ name = " + name + ", age = " + age + "}";
////    }

    // 默认继承Object类
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public boolean equals(Object object){
//       // 如果对象的地址值一样 则认为相同
//        if (this == object){
//            return true;
//        }
//        // 如果参数为空 或者类型信息不一样 则认为不同
//        if (object == null || getClass() != object.getClass())
//            return false;
//        // 对象不为空 类型信息一样 转换为当前类型
//        Person person = (Person)object;
//        // 要求基本类型相等 并且将引用类型交给objects类的equals静态方法
//        return this.age == person.age && Objects.equals(this.name,person.name);
//
//    }


//    @Override
//    public boolean equals(Object object) {
//        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
//        Person person = (Person) object;
//        return age == person.age &&
//                name.equals(person.name);
//    }


    @Override
    public boolean equals(Object object){
       if (this == object){
           return true;
       }
       if (object == null || this.getClass() != object.getClass()){
           return false;
       }
        Person person = (Person) object;
       return this.age == person.age && Objects.equals(this.name,person.name);

    }


}
