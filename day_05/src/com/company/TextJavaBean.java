package com.company;

/**
 * @author Joker_Dong
 * @date 2020-5-11 19:02
 */

public class TextJavaBean {
    // JavaBean 是一种Java的标准规范
    // 符合JavaBean的类 1.要求类必须是具体的 和 公共的 2.并且具有无参构造方法
    // 3.提供用来操作成员变量的 set 和 get 方法
//
//    // 格式：
//    // 成员变量
//    private String name;
//    private int age;
//    // 构造方法：无参构造方法是必须的
//    public StudentJavaBean(){}
//    // 构造方法：有参的构造方法是建议的
//    public StudentJavaBean(String name,int age){
//        this.name = name;
//        this.age = age;
//    }
//    // 成员方法
//    // getxxx()方法和 setxxx()方法
//    public String getName(){
//        return name;
//    }
//    public int getAge(){
//        return age;
//    }
//    public void setName(String name){
//        this.name = name;
//    }
//    public void setAge(int age){
//        this.age = age;
//    }
//
    public static void main(String[] args) {
        // 无参的构造方法的调用
        StudentJavaBean s1 = new StudentJavaBean();
        s1.setName("金豆豆");
        s1.setAge(22);
        System.out.println(s1.getName() + "-----" + s1.getAge());

        StudentJavaBean s2 = new StudentJavaBean("金豆", 21);

    }

}
