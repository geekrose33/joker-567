package com.company.day14;

import java.util.HashMap;

/**
 * @author Joker_Dong
 * @date 2020-7-29 8:41
 */

public class Demo {
    public static void main(String[] args) {
        // 双链列表 key : value 通过键的值访问其值
        // 创建map对象
        HashMap<String, String> map = new HashMap<>();


        map.put("吕布","貂蝉");
        map.put("孙策","大乔");
        map.put("周瑜","二乔");
        map.put("刘备","甘夫人");
        // 如果put时间存在，那么会覆盖之前存在的值
        map.put("刘备","孙尚香");
        System.out.println(map);

        // 访问 get
        String s1 = map.get("刘备");
        System.out.println(s1);

        // 删除 remove
        String s = map.remove("孙策");
        System.out.println(s);

        System.out.println(map.containsKey("刘备"));
        System.out.println(map.containsKey("孙策"));

    }
}
