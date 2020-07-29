package com.company.day14;

import java.util.HashMap;
import java.util.Set;

/**
 * @author Joker_Dong
 * @date 2020-7-29 10:33
 */

public class TestStudent {
    public static void main(String[] args) {
        // 创建map
        HashMap<Student, String> map = new HashMap<>();
        // 添加元素
        map.put(new Student("刘能",33),"锦州");
        map.put(new Student("赵四",28),"葫芦岛");
        map.put(new Student("小沈阳",35),"大连");
        map.put(new Student("宋小宝",42),"营口");
//        Set<Student> keySet = map.keySet();
        // 遍历
        for (Student key : map.keySet()){
//            System.out.println(key);// 输出键值对象的地址值
            System.out.println(key + "----- " + map.get(key));
        }

    }
}
