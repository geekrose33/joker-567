package com.company.exam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author Joker_Dong
 * @date 2020-7-30 18:45
 */

public class day15_recall {
    public static void main(String[] args) {
        // 迭代器Iterator
        Collection<String> list = new ArrayList<>();
        Collections.addAll(list,"bad","normal","good","perfect");
        Iterator<String> iterator = list.iterator();
        // 迭代器Iterator 的方法
        // hasNest()判断是否有下一个对象 返回值为true/false
        // next() 返回迭代的下一个对象
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }




    }
}
