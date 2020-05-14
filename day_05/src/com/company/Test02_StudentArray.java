package com.company;

import java.util.ArrayList;

/**
 * @author Joker_Dong
 * @date 2020-5-14 17:19
 */

public class Test02_StudentArray {
    public static void main(String[] args) {
        /*
        new ArrayList<Student>();  // <E>表示一种指定的数据类型 ， 叫做泛型
        new ArrayList<String>() ; // <E>表示一种指定的数据类型 ， 叫做泛型
        new ArrayList<Integer>() ; // <E>表示一种指定的数据类型 ， 叫做泛型
*/
        // 使用ArrayList
        ArrayList<String> list = new ArrayList<>();

        // 指定元素添加到集合的尾部
        list.add("张三");
        list.add("张四");
        list.add("张五");
        list.add("张六");
        System.out.println(list.size());

        // ArrayList 数据类型可以是类
        ArrayList<StudentJavaBean> s = new ArrayList<>();
        StudentJavaBean s1 = new StudentJavaBean("刘备",42);
        StudentJavaBean s2 = new StudentJavaBean("关羽",40);
        StudentJavaBean s3 = new StudentJavaBean("张飞",41);
        StudentJavaBean s4 = new StudentJavaBean("赵云",35);

        // 进行添加操作
        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
        // 打印list  s
        System.out.println(s.size());
        System.out.println(s);

        // 遍历ArrayList 第一种方式
        for (int i = 0; i < s.size(); i++) {
            StudentJavaBean st = s.get(i);
            // 访问ArrayList元素 .get()

            System.out.println(st.getName());
        }
    }
}
