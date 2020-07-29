package com.company.day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Joker_Dong
 * @date 2020-7-29 9:31
 */

public class DemoExam {
    public static void main(String[] args) {
        HashMap<String, String> phone = new HashMap<>();
        // 添加
        phone.put("HUAWEI","P40");
        phone.put("IPHONE","11 max pro");
        phone.put("MI","10");
        phone.put("OPPO","V30");
        // 访问
        System.out.println(phone.get("HUAWEI"));
        System.out.println(phone.get("MI"));
        // 删除
        System.out.println(phone.remove("OPPO"));


        // 判断集合是否包含指定键值
        System.out.println(phone.containsKey("IPHONE"));

        // Entry 对象
        Set<Map.Entry<String, String>> phoneSet = phone.entrySet();
        for (Map.Entry<String, String> entry:phoneSet
             ) {
            System.out.println(entry.getKey() + "·" + entry.getValue());
            }

    }
}
