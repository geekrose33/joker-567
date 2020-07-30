package com.company.day15.myGeneric;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Joker_Dong
 * @date 2020-7-30 9:49
 */

public class TestGenericDemo03 {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<>();
        Collection<String> list2 = new ArrayList<>();
        getElement(list1);
        getElement(list2);
    }
    public static void getElement(Collection<?> coll){
        // <?> 可以接收任意类型

    }
}
