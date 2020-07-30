package com.company.exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Joker_Dong
 * @date 2020-7-30 18:19
 */

public class day_0730 {
    public static void main(String[] args) {
        //用map集合存储多个手机对象和他的价格，
        // 使用增、删、改value、通过key输出值的信息（get）、
        // 获取map中全部的keys、values，使用entrySet方法并实现getKey、getValue方法
        HashMap<Phone, Integer> phone = new HashMap<>();
        Phone phone1 = new Phone("三星", 5000);
        Phone phone2 = new Phone("苹果", 7000);
        Phone phone3 = new Phone("华为", 6000);
        // 增加
        phone.put(phone1,phone1.getPrice());
        phone.put(phone2,phone2.getPrice());
        phone.put(phone3,phone3.getPrice());

        // 删除
        phone.remove(phone1);
        // 改
        phone.put(phone3,8000);
        System.out.println(phone.get(phone1));
        System.out.println(phone.get(phone2));

        Set<Phone> phoneSet = phone.keySet();
        ArrayList<Phone> phoneArrayList = new ArrayList<>();
        phoneArrayList.addAll(phoneSet);
        System.out.println(phoneArrayList);
        Set<Map.Entry<Phone, Integer>> phoneEntry = phone.entrySet();
        for (Map.Entry<Phone, Integer> entry:phoneEntry){
            Phone key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(value + " = " + key);
        }
    }
}
