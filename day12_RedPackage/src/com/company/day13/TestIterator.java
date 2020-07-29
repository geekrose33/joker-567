package com.company.day13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Joker_Dong
 * @date 2020-7-28 15:09
 */

public class TestIterator {
    public static void main(String[] args) {
        // 使用多态创建集合对象
        Collection<String> coll = new ArrayList<>();
        coll.add("小鲁班");
        coll.add("后羿");
        coll.add("嫦娥");
        // 遍历
        Iterator<String> iterator = coll.iterator();
        while (iterator.hasNext()){
            // 获取迭代的元素
            String s =iterator.next();
            System.out.println(s);
        }


    }
}
