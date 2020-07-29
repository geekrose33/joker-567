package com.company.day14;

import java.util.HashMap;

/**
 * @author Joker_Dong
 * @date 2020-7-29 19:57
 */

public class homework01 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        // 添加元素
        map.put("我","大帅比");
        map.put("你","大丑比");
        map.put("他","一般般");
        // 访问元素
        System.out.println(map.get("我"));
        // 访问是否有指定键
        System.out.println(map.containsKey("你"));
        System.out.println(map.remove("他"));

        System.out.println(map.get("他"));
        System.out.println(map);
    }
}
