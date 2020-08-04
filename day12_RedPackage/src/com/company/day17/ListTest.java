package com.company.day17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * @author Joker_Dong
 * @date 2020-8-1 7:45
 */

public class ListTest {
//    public static void main(String[] args) {
//        System.out.println(TestMethod());
//    }
//    public static String TestMethod(){
//        System.out.println("请输入一段字符");
//        String str = new Scanner(System.in).next();
//        int aNum = 0;
//        int bNum = 0;
//        int cNum = 0;
//        int dNum = 0;
//        int other = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == 'a'){
//                aNum++;
//            }else if (str.charAt(i) == 'b'){
//                bNum++;
//            }else if (str.charAt(i) == 'c'){
//                cNum++;
//            }else if (str.charAt(i) == 'd'){
//                dNum++;
//            }else{
//                other++;
//            }
//        }
//        return "a: " + aNum + ",b: " + bNum + ",c: " + cNum
//                + ",d: " + dNum + ",其他字符： " + other;
//
//    }
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        // 多态 父接口类型指向子类对象
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        System.out.println("a: " + listMethod(list,"a"));
        System.out.println("b: " + listMethod(list,"b"));
        System.out.println("c: " + listMethod(list,"c"));

    }
    public static int listMethod(Collection<String>collection, String str){

        int count = 0;
        for (String string:collection){
            if (str.equals(string)){
                count ++;
            }
        }
        return count;
    }
}
