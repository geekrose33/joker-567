package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Joker_Dong
 * @date 2020-6-14 18:36
 */

public class EvenNumTest {
    public static void main(String[] args) {
        // 创建一个样本数据
        List<Integer> srcList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            srcList.add(i);
        }

        // 调用获取所有偶数的方法
        List<Integer> evenNumList = getEvenNum(srcList);
        System.out.println(evenNumList);

    }

    // 获取某集合中所有的偶数
    // 此时List<Integer> List 作为了getEvenNum()方法的参数
    public static List<Integer> getEvenNum(List<Integer> list) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            if (integer % 2 == 0) {
                arrayList.add(integer);
            }

        }

        // 因为getEvenNum方法返回类型是List<Integer>
        // array List 是 List 的子类，所以arrayList是可以返回的
        // 接口对应的类型作为返回值类型
        return arrayList;
    }
}
