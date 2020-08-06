package com.company.exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Joker_Dong
 * @date 2020-8-6 8:03
 */

public class Map_Entry {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("吕布", "貂蝉");
        map.put("孙策", "大乔");
        map.put("周瑜", "二乔");
        map.put("刘备", "甘夫人");
        System.out.println(map.get("吕布"));
        System.out.println(map.remove("吕布"));
        System.out.println(map.containsKey("吕布"));
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry:entries
             ) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
