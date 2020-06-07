package com.company;

/**
 * @author Joker_Dong
 * @date 2020-6-7 18:15
 */

public class DynamicTest2 {
    public static void main(String[] args) {
        // 向上转型
        Animal cat = new Cat();
        cat.eat();

        // 向下转型  强制转换
    /*
        Cat c = (Cat) cat;
        c.eat();
    */

        // 转型异常  ClassCastException
        // instance of 判断对象属于某种类型
      /*  if (cat instanceof Animal){
            Cat c = (Cat) cat;
            c.eat();
        }else {
            System.out.println("不是父类类型 不能强制准换");
        }
*/
      /*  JiaFei jiaFei = new JiaFei();
        if (jiaFei instanceof Cat){
            JiaFei fei = (JiaFei)jiaFei;
            jiaFei.eat();
        }else{
            System.out.println("不是父类类型 不能强制准换");

        }*/

        // Dog dog = (Dog) cat;
        // 转换异常 ClassCastException
        // dog.eat();



    }
}
