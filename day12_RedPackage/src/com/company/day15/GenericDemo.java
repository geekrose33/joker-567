package com.company.day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Joker_Dong
 * @date 2020-7-30 8:51
 */

public class GenericDemo {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        // 把泛型删掉后默认为Object类
        list.add("abc");
        list.add("def");
//        list.add("def");

        // 已经明确了类型，在使用迭代器的时候，迭代器也同样知道遍历元素的具体类型
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            // 使用iterator控制元素后 在这里可以直接获取String类型
            System.out.println(str.length());
        }

//        System.out.println(list);

    }
}
