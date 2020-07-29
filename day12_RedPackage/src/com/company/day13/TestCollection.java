package com.company.day13;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Joker_Dong
 * @date 2020-7-28 14:48
 */

public class TestCollection {
    public static void main(String[] args) {
        // 使用多态形式创建集合对象
        Collection<Object> coll = new ArrayList<>();
        // add 方法
        coll.add("小鲁班");
        coll.add("小小鲁班");
        coll.add("大鲁班");
        System.out.println(coll);
        // 判断集合是否为空
        System.out.println(coll.contains("小鲁班"));
        System.out.println(coll.contains(1111));
        // 删除一个元素
        System.out.println(coll.remove("小小鲁班"));  // remove
        System.out.println("删除之后" + coll);

        // isEmpty():判断当前集合是否为空
        System.out.println(coll.isEmpty());
        // size()：返回集合中元素的个数
        System.out.println(coll.size());
        // toArray()
        Object[] objects = coll.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
        // clear(): 清空集合中所有元素
        coll.clear();
        System.out.println(coll);
        // 清空集合元素 但是集合名字（引用）还在

    }
}
