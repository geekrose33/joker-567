package com.company.day15.myGeneric;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Joker_Dong
 * @date 2020-7-30 9:59
 */

public class TestGenericDemo04 {
    public static void main(String[] args) {
        // 已知object类、String类、Number类、Integer类、其中Number类是Integer的父类
        Collection<Integer> list1 = new ArrayList<>();
        Collection<String> list2 = new ArrayList<>();
        Collection<Number> list3 = new ArrayList<>();
        Collection<Object> list4 = new ArrayList<>();

        getElement01(list1); // Integer是Number的子类 所以可以使用
//        getElement01(list2);  String不是Number的子类 报错
        getElement01(list3);
//        getElement01(list4);  Object是Number父类 报错
//        getElement02(list1);  下限以下
        getElement02(list3); // 本类 可以使用
    }
    public static void getElement01(Collection<? extends Number> coll){
        // 泛型的上限 此时必须是Number类型或者子类
    }
    public static void getElement02(Collection<? super Number> coll){
        // 泛型的下限 此时必须是Number类型或者父类
    }
}
