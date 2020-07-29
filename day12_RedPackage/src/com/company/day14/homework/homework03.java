package com.company.day14.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * @author Joker_Dong
 * @date 2020-7-29 20:12
 */

public class homework03 {
    public static void main(String[] args) {
        ArrayList<String> province = new ArrayList<>();
        Collections.addAll(province,"黑龙江省", "浙江省", "江西省", "广东省", "福建省");
        ArrayList<String> capital = new ArrayList<>();
        Collections.addAll(capital,"哈尔滨","杭州","南昌","广州","福州");
        HashMap<String, String> relation = new HashMap<>();
        int count = 0;
        for (String str1:province
             ) {
            relation.put(str1,capital.get(count));
            // arrayList从0开始计数
            count++;
        }
        System.out.println(relation);
    }
}
