package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author Joker_Dong
 * @date 2020-5-11 19:14
 */

public class StudentJavaBean {

        // 格式：
        // 成员变量
        private String name;
        private int age;
        // 构造方法：无参构造方法是必须的
    public StudentJavaBean(){}
        // 构造方法：有参的构造方法是建议的
    public StudentJavaBean(String name,int age){
            this.name = name;
            this.age = age;
        }
        // 成员方法
        // getxxx()方法和 setxxx()方法
        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setAge(int age){
            this.age = age;
        }

    }

