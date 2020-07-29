package com.company.day14.homework;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Joker_Dong
 * @date 2020-7-29 10:59
 */

public class MapTest {
    public static void main(String[] args) {
        // 控制台输入 统计上面字符出现的次数
        System.out.println("请输入一串字符");
        String s = new Scanner(System.in).next();
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0 ; i < s.length(); i++){
//            char c = s.charAt(i);  获取单个字符
            String s1 = s.substring(i,i+1);


            if (!map.containsKey(s1)){
                // 如果不存在，那就是一个
                map.put(s1, 1);
            }else {
                // 如果已经有了，那就得加一
                Integer c = map.get(s1);
                map.put(s1,++count);
                // 先自增之后再赋值
            }

        }
        System.out.println(map);
    }
}
