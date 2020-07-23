package com.company;

import com.sun.org.apache.xerces.internal.dom.CDATASectionImpl;

/**
 * @author Joker_Dong
 * @date 2020-5-14 18:56
 * 自己实现一个ArrayList
 * v 1.1
 */

public class OwnArrayList_01 {
    // 定义成员变量
    // data 数组 存储数据
    private int[] data;
    // 集合中有效元素的个数 小于等于容量
    private int size;

    // 构造函数,传入数组的初始容量
    public OwnArrayList_01(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    // 定义无参构造方法 默认容量是10
    public OwnArrayList_01() {
        this(10);
    }

    // 构造方法
    // 获取数组中的元素的个数
    public int getSize() {
        return size;
    }

    // 获取数组中的容量
    public int getCapacity() {
        return data.length;
    }

    // 获取数组是否为空
    public boolean isEmpty() {
        return size == 0;
    }
}
