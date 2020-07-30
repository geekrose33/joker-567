package com.company.day15.myGeneric;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Joker_Dong
 * @date 2020-7-30 10:26
 */

public class TestMyGenericExam {
    public static void main(String[] args) {
        MyGenericExam<String> exam = new MyGenericExam<>();
        exam.setStar("周星驰");
        System.out.println(exam.getStar());
//        Collection<Integer> list = new ArrayList<>();
//        list.add(666);
//        showStar(list); // 需要是Number的父类
        Collection<Object> list = new ArrayList<>();
        list.add(666);
        showStar(list);

        showStar01(list);
    }
    public static void showStar(Collection< ? super Number> coll){
        System.out.println(coll +"的类是： " + coll.getClass() + "是Number类的父类或本类 可以使用该方法");
    }

    public static void showStar01(Collection< ? extends Object> coll){
        System.out.println(coll + "的类是： " + coll.getClass() + "是Object类的子类或本类 可以使用该方法");
    }

}
