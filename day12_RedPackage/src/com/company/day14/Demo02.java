package com.company.day14;

import java.util.HashMap;
import java.util.Set;

/**
 * @author Joker_Dong
 * @date 2020-7-29 9:10
 */

public class Demo02 {
    public static void main(String[] args) {
        // 创建map对象
        HashMap<String, String> map = new HashMap<>();


        map.put("吕布","貂蝉");
        map.put("孙策","大乔");
        map.put("周瑜","二乔");
        map.put("刘备","甘夫人");
        // 获取所有的键
        Set<String> keySet = map.keySet();  // 返回set集合 set无序不重复
        // 遍历所有的键
        for (String key : keySet
             ) {
//            System.out.println(key);
            String val = map.get(key);
            System.out.println(key + "和" + val + "是一对");
        }



    }
}
